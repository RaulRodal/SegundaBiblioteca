package com.biblio.connection;

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
	private final static String MYSQL_DRIVER = "com.mysql.cj.jdbc.Driver";

	/**
	 * Método que devuelve la conexion realizada con el esquema y los credenciales
	 * proporcionados por la clase, si es null intentamos realizar la conexion, en caso contrario
	 * devolvemos la conexion.
	 * 
	 * @return conexion
	 */
	public static Connection getConnection() {
		final String URL = SERVER + PORT + SCHEMA;
		if (conn == null) {
			// loadDriver(MYSQL_DRIVER);
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

	public static void loadDriver(String driver) {
		System.out.println("Loading driver ...");
		try {
			Class.forName(driver);
			System.out.println("Driver loaded!");
		} catch (ClassNotFoundException e) {
			throw new IllegalStateException("Cannot find the driver in the classpath!", e);
		}
	}

	public static boolean closeConnection() throws SQLException {
		 if(conn != null) {
			 conn.close();
		 }
		 return conn.isClosed();
	 }
}
