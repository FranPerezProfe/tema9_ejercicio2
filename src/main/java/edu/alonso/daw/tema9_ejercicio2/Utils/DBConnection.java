package edu.alonso.daw.tema9_ejercicio2.Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	private final String DB_NAME = "CURSOS";
	
	private final String URL = "jdbc:mysql://localhost:3306/" + DB_NAME;
	
	private final String USER = "root";
	
	private final String PASS = "";
	
	
	private static DBConnection instance;
	
	private Connection conn;
	
	private DBConnection() {

		System.out.println("Creando la conexión a la BBDD...");

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.err.println("Error al registrar el driver con la BBDD." + e.getMessage());

		}
		try {
			this.conn = DriverManager.getConnection(URL, USER, PASS);
		} catch (SQLException e) {
			System.err.println("Error al crear la conexión con la BBDD." + e.getMessage());
		}
		
	}
	
	public static synchronized DBConnection getInstance() {
		
		if(instance == null) {
			instance = new DBConnection();
		}
		
		return instance;
	}

	
}
