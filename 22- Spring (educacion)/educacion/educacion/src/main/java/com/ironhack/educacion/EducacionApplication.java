package com.ironhack.educacion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLException;

@SpringBootApplication
public class EducacionApplication {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		SpringApplication.run(EducacionApplication.class, args);

		GestorEduc consultasSQL= new GestorEduc();
		consultasSQL.GestorConcultas();
	}

}
