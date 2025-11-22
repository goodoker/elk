package ru.netology.elk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
@RestController
public class Application {

    private static final Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @GetMapping("/hello")
    public String hello() {
        logger.info("Hello endpoint called");
        return "Hello from Spring Boot ELK Demo!";
    }

    @GetMapping("/error-test")
    public String errorTest() {
        logger.error("This is a test error message");
        return "Error logged successfully";
    }
}