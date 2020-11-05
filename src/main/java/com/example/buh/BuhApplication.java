package com.example.buh;

import com.example.buh.DAO.CedolaDAO;
import com.example.buh.DAO.MovimentoDAO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BuhApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(BuhApplication.class, args);
		//context.getBean(CedolaDAO.class);
		context.getBean(MovimentoDAO.class);
	}

}
