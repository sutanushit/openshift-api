package com.sutanu.openshift.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class OpenshiftApiApplication {
	
	@GetMapping("/")
	public static String welcome() {
		return "Welcome to OpenshiftApi.";
	}
	
	@GetMapping("/{name}")
	public static String Congrats(@PathVariable String name) {
		return "Hi "+ name +" ...";
	}

	public static void main(String[] args) {
		SpringApplication.run(OpenshiftApiApplication.class, args);
	}

}
