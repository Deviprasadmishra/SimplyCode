package com.simply.code.boot.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.simply.code.boot.service.UserService;
import com.simply.code.boot.service.UserServiceImpl;


/**
 * Boot started!
 *
 */
@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.simply.code.boot.controller")
public class BootStarter 
{
	/*@RequestMapping("/")
    String home() {
        return "Boot started!";
    }*/
	@Bean
	UserService bookingService() {
		return new UserServiceImpl();
	}

    public static void main( String[] args )
    {
    	SpringApplication.run(BootStarter.class, args);
        
    }
}
