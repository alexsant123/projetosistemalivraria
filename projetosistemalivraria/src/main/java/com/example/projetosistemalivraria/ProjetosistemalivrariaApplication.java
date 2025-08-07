package com.example.projetosistemalivraria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@SpringBootApplication
@ComponentScan(basePackages= {"java.*"})
public class ProjetosistemalivrariaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetosistemalivrariaApplication.class, args);
	}

}
