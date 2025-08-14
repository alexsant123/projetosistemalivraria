package com.example.projetosistemalivraria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"livraria.*"})
public class ProjetosistemalivrariaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetosistemalivrariaApplication.class, args);
	}

}
