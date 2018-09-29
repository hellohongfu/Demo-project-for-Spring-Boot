package com.qr.demo;

import com.beust.jcommander.internal.Console;
import com.google.zxing.client.j2se.CommandLineRunner;
import com.qr.demo.service.QRCodeService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;


@SpringBootApplication



public class DemoApplication {

	

	public static void main(String[] args) {

		

		SpringApplication.run(DemoApplication.class, args);
	}


 
	
}




