/*Event table creation*/
CREATE TABLE `event` (
  `event_no` int(11) NOT NULL AUTO_INCREMENT,
  `event_id` varchar(45) DEFAULT NULL,
  `base_location` varchar(45) DEFAULT NULL,
  `beneficiary_name` varchar(45) DEFAULT NULL,
  `council_name` varchar(45) DEFAULT NULL,
  `event_name` varchar(45) DEFAULT NULL,
  `event_description` varchar(1000) DEFAULT NULL,
  `event_date` date DEFAULT NULL,
  `employee_id` bigint(20) DEFAULT NULL,
  `employee_name` varchar(45) DEFAULT NULL,
  `volunteer_hours` int(11) DEFAULT NULL,
  `travel_hours` int(11) DEFAULT NULL,
  `lives_impacted` int(11) DEFAULT NULL,
  `business_unit` varchar(45) DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  `iiep_category` varchar(45) DEFAULT NULL,
  `summary_id` int(11) DEFAULT NULL,
  `poc_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`event_no`)
);

/*Event summary table creation*/
CREATE TABLE `event_summary` (
  `summary_id` int(11) NOT NULL AUTO_INCREMENT,
  `event_id` varchar(45) DEFAULT NULL,
  `month` varchar(45) DEFAULT NULL,
  `base_location` varchar(45) DEFAULT NULL,
  `beneficiary_name` varchar(45) DEFAULT NULL,
  `venue_address` varchar(500) DEFAULT NULL,
  `council_name` varchar(45) DEFAULT NULL,
  `project` varchar(45) DEFAULT NULL,
  `category` varchar(45) DEFAULT NULL,
  `event_name` varchar(45) DEFAULT NULL,
  `event_description` varchar(1000) DEFAULT NULL,
  `event_date` date DEFAULT NULL,
  `total_no_of_volunteers` int(11) DEFAULT NULL,
  `total_volunteer_hours` int(11) DEFAULT NULL,
  `total_travel_hours` int(11) DEFAULT NULL,
  `overall_volunteer_hours` int(11) DEFAULT NULL,
  `lives_impacted` int(11) DEFAULT NULL,
  `activity_type` varchar(45) DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  `poc_id` bigint(20) DEFAULT NULL,
  `poc_name` varchar(45) DEFAULT NULL,
  `poc_contactnumber` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`summary_id`)
);


CREATE TABLE `feedback_ques` (
  `ques_id` int(11) NOT NULL AUTO_INCREMENT,
  `feedback_type` varchar(45) DEFAULT NULL,
  `feedback_ques` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`ques_id`)
);

CREATE TABLE `feedback_ans` (
  `ans_id` int(11) NOT NULL AUTO_INCREMENT,
  `feedback_ans` varchar(1000) DEFAULT NULL,
  `rating` int(11) DEFAULT NULL,
`ques_id` int(11) NOT NULL,
`event_no` varchar(100) NOT NULL,
  PRIMARY KEY (`ans_id`)
);


/*user*/

CREATE  TABLE `fms`.`user` (
  `id` INT NOT NULL ,
  `username` VARCHAR(45) NULL ,
  `password` VARCHAR(200) NULL ,
  `role_id` VARCHAR(45) NULL ,
  PRIMARY KEY (`id`) );

CREATE TABLE `event` (
  `event_no` int(11) NOT NULL AUTO_INCREMENT,
  `event_id` varchar(45) DEFAULT NULL,
  `base_location` varchar(45) DEFAULT NULL,
  `beneficiary_name` varchar(45) DEFAULT NULL,
  `council_name` varchar(45) DEFAULT NULL,
  `event_name` varchar(45) DEFAULT NULL,
  `event_description` varchar(100) DEFAULT NULL,
  `event_date` date DEFAULT NULL,
  `employee_id` bigint(20) DEFAULT NULL,
  `employee_name` varchar(45) DEFAULT NULL,
  `volunteer_hours` int(11) DEFAULT NULL,
  `travel_hours` int(11) DEFAULT NULL,
  `lives_impacted` int(11) DEFAULT NULL,
  `business_unit` varchar(45) DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  `iiep_category` varchar(45) DEFAULT NULL,
  `summary_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`event_no`)
);

/*data migration*/
/*Event table creation*/
CREATE TABLE `event` (
  `event_no` int(11) NOT NULL AUTO_INCREMENT,
  `event_id` varchar(45) DEFAULT NULL,
  `base_location` varchar(45) DEFAULT NULL,
  `beneficiary_name` varchar(45) DEFAULT NULL,
  `council_name` varchar(45) DEFAULT NULL,
  `event_name` varchar(45) DEFAULT NULL,
  `event_description` varchar(1000) DEFAULT NULL,
  `event_date` date DEFAULT NULL,
  `employee_id` bigint(20) DEFAULT NULL,
  `employee_name` varchar(45) DEFAULT NULL,
  `volunteer_hours` int(11) DEFAULT NULL,
  `travel_hours` int(11) DEFAULT NULL,
  `lives_impacted` int(11) DEFAULT NULL,
  `business_unit` varchar(45) DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  `iiep_category` varchar(45) DEFAULT NULL,
  `summary_id` int(11) DEFAULT NULL,
  `poc_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`event_no`)
);

/*Event summary table creation*/
CREATE TABLE `summary` (
  `summary_id` int(11) NOT NULL AUTO_INCREMENT,
  `event_id` varchar(45) DEFAULT NULL,
  `month` varchar(45) DEFAULT NULL,
  `base_location` varchar(45) DEFAULT NULL,
  `beneficiary_name` varchar(45) DEFAULT NULL,
  `venue_address` varchar(500) DEFAULT NULL,
  `council_name` varchar(45) DEFAULT NULL,
  `project` varchar(45) DEFAULT NULL,
  `category` varchar(45) DEFAULT NULL,
  `event_name` varchar(45) DEFAULT NULL,
  `event_description` varchar(1000) DEFAULT NULL,
  `event_date` date DEFAULT NULL,
  `total_volunteers` int(11) DEFAULT NULL,
  `total_volunteer_hours` int(11) DEFAULT NULL,
  `total_travel_hours` int(11) DEFAULT NULL,
  `overall_hours` int(11) DEFAULT NULL,
  `lives_impacted` int(11) DEFAULT NULL,
  `activity_type` varchar(45) DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  `poc_id` bigint(20) DEFAULT NULL,
  `poc_name` varchar(45) DEFAULT NULL,
  `poc_contactnumber` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`summary_id`)
);