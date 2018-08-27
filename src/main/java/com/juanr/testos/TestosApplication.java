package com.juanr.testos;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.cassandra.CassandraDataAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class, CassandraDataAutoConfiguration.class})
public class TestosApplication {

	@Value("${openshift.variable}") String variableOpenshiftTest;
	
	public static void main(String[] args) {
		SpringApplication.run(TestosApplication.class, args);
	}
        
        @RequestMapping("/hello/{nombre}")
        public String hello(@PathVariable String nombre){
            return "Hello: " + nombre + "Te saludo " + variableOpenshiftTest;
        }
}
