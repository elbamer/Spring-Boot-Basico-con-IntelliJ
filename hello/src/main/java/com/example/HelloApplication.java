package com.example;

import com.example.repository.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.sql.DataSource;


@SpringBootApplication
public class HelloApplication {

	@Autowired
	DataSource dataSource;


	@Autowired
	UsuariosRepository usuariosRepository;

	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);
	}

}
