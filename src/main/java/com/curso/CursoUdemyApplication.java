package com.curso;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CursoUdemyApplication implements CommandLineRunner {

	private static final Logger LOG = LoggerFactory.getLogger(CursoUdemyApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(CursoUdemyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Curso c = new Curso();
		
		c.mostraDados();
		
		LOG.info("Finalizando RUN");
		LOG.warn("Alerta no codigo");
		LOG.error("Erro no codigo");
		
		LOG.debug("Debugando o codigo");
		
	}

}
