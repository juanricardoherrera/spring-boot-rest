package com.juanr.testos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TestosApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestosApplication.class, args);
	}
        
        @RequestMapping("/hello/{nombre}")
        public String hello(@PathVariable String nombre){
            return "Hello: " + nombre + "Te saludo";
        }
}
