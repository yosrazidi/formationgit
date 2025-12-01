package com.example.gitgithub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitgithubApplication {

	public static void main(String[] args) {
		SpringApplication.run(GitgithubApplication.class, args);
		file1 file = new file1();
		System.out.println(file.getMessage());
		
	}

}
