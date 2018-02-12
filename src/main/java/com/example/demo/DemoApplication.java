package com.example.demo;

import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@SpringBootApplication
//@EnableAutoConfiguration
//@Configuration
//@ComponentScan

//@RestController
//@ResponseBody


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
//public class DemoApplication {
//    @RequestMapping("/")
////	@ResponseBody
//    String home() {
//        return "Hello, good morning! <br><br>  Welcome, Trisha Jariwala!";
//    }
//
//    public static void main(String[] args) throws Exception {
//        SpringApplication.run(DemoApplication.class, args);
//    }
//}