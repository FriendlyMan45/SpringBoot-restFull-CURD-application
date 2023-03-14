package com.waran.Webapp_CURD;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class WebappCurdApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebappCurdApplication.class, args);
	}

}
