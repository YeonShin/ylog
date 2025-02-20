package com.yeon.Ylog_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class YlogServerApplication {

	@RequestMapping("/")
	String sayHello() {
		return "Hello World!";
	}
	public static void main(String[] args) {
		SpringApplication.run(YlogServerApplication.class, args);
	}

}
