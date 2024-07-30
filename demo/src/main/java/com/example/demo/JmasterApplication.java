package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@SpringBootApplication
@EnableJpaAuditing
@EnableScheduling
@EnableCaching
public class JmasterApplication implements WebMvcConfigurer {

	public static void main(String[] args) {

		SpringApplication.run(JmasterApplication.class, args);
	}
	@Override
	public void addInterceptors(InterceptorRegistry registry) {

	}
}