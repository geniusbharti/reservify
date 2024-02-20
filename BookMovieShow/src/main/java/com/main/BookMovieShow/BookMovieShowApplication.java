package com.main.BookMovieShow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.main.BookMovieShow.Repository")
public class BookMovieShowApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookMovieShowApplication.class, args);
	}

}
