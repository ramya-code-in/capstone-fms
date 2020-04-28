package com.cts.user.api;

import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import com.cts.user.model.User;
import com.cts.user.repository.UserRepository;
import com.fasterxml.jackson.databind.ObjectMapper;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-02-25T11:03:53.520+05:30")

@Controller
public class LoginApiController implements LoginApi {
	private static final Logger LOGGER = LoggerFactory.getLogger(LoginApiController.class);

	private final ObjectMapper objectMapper;

	private final HttpServletRequest request;

	@Autowired
	UserRepository userRepository;

	@org.springframework.beans.factory.annotation.Autowired
	public LoginApiController(ObjectMapper objectMapper, HttpServletRequest request) {
		this.objectMapper = objectMapper;
		this.request = request;
	}

	@Override
	public Optional<ObjectMapper> getObjectMapper() {
		return Optional.ofNullable(objectMapper);
	}

	@Override
	public Optional<HttpServletRequest> getRequest() {
		return Optional.ofNullable(request);
	}

	@Override
	public Mono<ResponseEntity<Map<String, String>>> loginPost(
			@RequestHeader(value = "Authorization", required = false) String authHeader) {

		Map<String, String> authenticationMap = new HashMap<String, String>();
		LOGGER.info("authentication START");
		LOGGER.debug("authHeader " + authHeader);
		String user = getUser(authHeader);
		Mono<User> userDetail = userRepository.findByUsername(user);
		String role = SecurityContextHolder.getContext().getAuthentication().getAuthorities().toArray()[0].toString();
		LOGGER.debug(role);
		authenticationMap.put("role", role);
		String token = generateJwt(user);
		authenticationMap.put("token", token);
		LOGGER.info("authentication END");
		return Mono.just(authenticationMap).map(info -> ResponseEntity.ok(info));
	}

	private String getUser(String authHeader) {
		LOGGER.info("getUser START");
		String encodedCredentials = authHeader.substring(authHeader.indexOf(" ") + 1);
		byte[] decodedText = Base64.getDecoder().decode(encodedCredentials);
		LOGGER.debug("Decoded text " + decodedText);
		String decodedString = new String(decodedText);
		LOGGER.debug("Decoded String " + decodedString);
		String user = decodedString.substring(0, decodedString.indexOf(":"));
		LOGGER.debug("User " + user);
		LOGGER.info("getUser END");
		return user;
	}

	private String generateJwt(String user) {
		LOGGER.info("generateJWT START");
		LOGGER.info("generateJWT END");
		JwtBuilder builder = Jwts.builder();
		builder.setSubject(user);
		// Set the token issue time as current time
		builder.setIssuedAt(new Date());
		// Set the token expiry as 20 minutes from now
		builder.setExpiration(new Date((new Date()).getTime() + 1200000));
		builder.signWith(SignatureAlgorithm.HS256, "secretkey");

		String token = builder.compact();

		return token;
	}

	@Override
	public Mono<ResponseEntity<User>> configureRole(@PathVariable int employeeId, @RequestBody String role) {
		return userRepository.findById(employeeId).flatMap(employee -> {
			employee.setRoleId(role);
			return userRepository.save(employee);
		}).map(info -> ResponseEntity.ok(info));
		// .flatMap(employee -> {employee.setRoleId(role);
		// return userRepository.save(employee);
		// })
		// .map(info -> ResponseEntity.ok(info));

	}

}
