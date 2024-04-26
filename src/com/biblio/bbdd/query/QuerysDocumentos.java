package com.biblio.bbdd.query;

public abstract class QuerysDocumentos {
	
	public static String QUERY_SELECT_LIBRO_BY_TITLE = "SELECT * FROM biblioteca.documentos WHERE titulo = ? AND tipo_documento = LIBRO;";
	public static String QUERY_SELECT_REVISTA_BY_TITLE = "SELECT * FROM biblioteca.documentos WHERE titulo = ? AND tipo_documento = REVISTA;";
	public static String QUERY_INSERT_NEW_DOCUMENT = "INSERT INTO biblioteca.documentos (title, value) VALUES (?, ?);";

	public static enum DocumentosEnums {
		
		SELECT_LIBRO_BY_NOMBRE(QUERY_SELECT_LIBRO_BY_TITLE, "seleccionar libro"), 
		SELECT_REVISTA_BY_NOMBRE(QUERY_SELECT_REVISTA_BY_TITLE, "seleccionar revista"),
		INSERT_DOCUMENTO(QUERY_INSERT_NEW_DOCUMENT, "insertar tipo de documento")
		
		
		;
		private String sql;
		private String title;
		
		private DocumentosEnums(String sql, String title) {
			this.sql = sql;
			this.title = title;
		}
		
		public String getSql() {
			return sql;
		}

		public String getTitle() {
			return title;
		}

	}

}
