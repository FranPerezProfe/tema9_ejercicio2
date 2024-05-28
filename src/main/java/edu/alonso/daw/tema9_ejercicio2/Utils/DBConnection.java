package edu.alonso.daw.tema9_ejercicio2.Utils;

import java.sql.Connection;

public class DBConnection {
	
	private final String DB_NAME = "CURSOS";
	
	private final String URL = "jdbc:mysql://localhost:3306/" + DB_NAME;
	
	private final String USER = "root";
	
	private final String PASS = "";
	
	
	private static DBConnection instance;
	
	private Connection conn;
	
	private DBConnection() {
		
		
		
	}
	
	public static DBConnection getInstance() {
		
		if(instance == null) {
			instance = new DBConnection();
		}
		
		return instance;
	}

	
}
