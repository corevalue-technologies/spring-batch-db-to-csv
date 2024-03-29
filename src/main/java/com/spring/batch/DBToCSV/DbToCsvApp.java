package com.spring.batch.DBToCSV;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DbToCsvApp {

	private static final Logger LOG = LoggerFactory.getLogger(DbToCsvApp.class);
	
	public static void main(String[] args) {
		LOG.info("STARTING APPLICATION");
		SpringApplication.run(DbToCsvApp.class, args);
		LOG.info("APPLICATION HAS STARTED");
	}

}
