package com.yahyatechie.jenkins.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class SpringJenkinsApplication /*implements CommandLineRunner*/ {

	public static final Logger logger=LoggerFactory.getLogger(SpringJenkinsApplication.class);

	@PostConstruct
	public void intt() {
	logger.info("Application started ... ");
	}
	
	public static void main(String[] args) {
		logger.info("Application executed ... ");
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}

	/*
	@Override
	public void run(String... args) throws Exception {
		logger.info("its my second logger ! ... ");
	}
	*/

}
