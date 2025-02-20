package com.yeon.Ylog_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class YlogServerApplication {

	// 루트 경로 ("/")에 요청이 들어오면 "Hello World!" 메시지를 반환하는 메서드
	@RequestMapping("/")
	String sayHello() {
		return "Hello World!";
	}

	public static void main(String[] args) {
		// Spring Boot 애플리케이션을 실행하는 진입점
		SpringApplication.run(YlogServerApplication.class, args);
	}
}
