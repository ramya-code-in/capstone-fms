package com.cts.event;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author 802468
 *
 */
@SpringBootApplication
@EnableSwagger2
@ComponentScan(basePackages = { "com.cts.event", "com.cts.event.api", "com.cts.event.repository" })
@EnableR2dbcRepositories
public class Swagger2SpringBoot implements CommandLineRunner {

    @Override
    public void run(String... arg0) throws Exception {
        if (arg0.length > 0 && arg0[0].equals("exitcode")) {
            throw new ExitException();
        }
    }

    public static void main(String[] args) throws Exception {
      
        System.out.println("SwaggerBoot Main");
    	  new SpringApplication(Swagger2SpringBoot.class).run(args);
    }

    class ExitException extends RuntimeException implements ExitCodeGenerator {
        private static final long serialVersionUID = 1L;

        @Override
        public int getExitCode() {
            return 10;
        }

    }

	 
}
