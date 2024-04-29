package com.biblio.bbdd.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Clase que maneja la conexión con la base de datos mysql
 * 
 * @author Admin
 *
 */
public class Conexion {

	// Connection utilizando un patron Singleton
	public static Connection conn = null;

	private final static String SERVER = "jdbc:mysql://localhost:";
	private final static String PORT = "3306/";
	private final static String SCHEMA = "biblioteca2";
	private final static String USER = "root";
	private final static String PASS = "root";

	/**
	 * Método que devuelve la conexion realizada con el esquema y los credenciales
	 * proporcionados por la clase, si es null intentamos realizar la conexion, en caso contrario
	 * devolvemos la conexion.
	 * 
	 * @return conexion
	 */
	public static Connection getConnection() {
		final String URL = getUrlCompleta();
		if (conn == null) {
			System.out.println("Connecting database ...");
			try {
				conn = DriverManager.getConnection(URL, USER, PASS);
				System.out.println("Database connected!");
			} catch (SQLException e) {
				throw new IllegalStateException("Cannot connect the database!", e);
			}
		}
		return conn;
	}

	public static boolean closeConnection() throws SQLException {
		 if(conn != null) {
			 conn.close();
		 }
		 return conn.isClosed();
	 }
	
	public static String getUrlCompleta() {
		return SERVER + PORT + SCHEMA;
	}
}
