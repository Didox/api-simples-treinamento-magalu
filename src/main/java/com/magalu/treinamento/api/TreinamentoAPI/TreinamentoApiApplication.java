package com.magalu.treinamento.api.TreinamentoAPI;

import com.magalu.treinamento.api.TreinamentoAPI.infra.db.ClienteDb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TreinamentoApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TreinamentoApiApplication.class, args);
		ClienteDb.popularDados();
	}

}
