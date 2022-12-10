package com.example.year;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.example")
@MapperScan("com.example.year.dao")
@SpringBootApplication
public class YearApplication {

	public static void main(String[] args) {
		SpringApplication.run(YearApplication.class, args);
	}

}
