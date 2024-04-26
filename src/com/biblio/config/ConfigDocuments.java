package com.biblio.config;

// CLASE A ELIMINAR, HAY QUE CEREAR UNAS QUERYS EN BBDDD
public class ConfigDocuments {
	
	public static String QUERY_SELECT_LIBRO_VALUE = "SELECT value FROM biblioteca.config WHERE nombre = libro;";
	public static String QUERY_SELECT_REVISTA_VALUE = "SELECT value FROM biblioteca.config WHERE nombre = revista;";
	public static String QUERY_INSERT_NEW_DOCUMENT = "INSERT INTO biblioteca.config (title, value) VALUES (?, ?);";

	public enum DocumentosEnums {
		
		SELECT_LIBRO_VALUE(QUERY_SELECT_LIBRO_VALUE, "seleccionar libro"), 
		SELECT_REVISTA_VALUE(QUERY_SELECT_REVISTA_VALUE, "seleccionar revista"),
		INSERT_DOCUMENTO(QUERY_INSERT_NEW_DOCUMENT, "insertar tipo de documento")
		
		
		;
		
		private String sql;
		
		private String title;
		
		private String[] params;
		
		private DocumentosEnums(String sql, String title, String ...params) {
			this.sql = sql;
			this.title = title;
			this.params = params;
		}
		
		public String getSql() {
			return sql;
		}
	}

	/*
	public static String query(DocumentosEnums valor, String sql) {
		try (Connection conn = DriverManager.getConnection(Conexion.getUrlCompleta(), "root", "root");
				PreparedStatement ps = conn.prepareStatement(sql);){
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}*/
	
}
