package com.biblio.bbdd.query;

public class QuerysUsuarios {

	public static final String QUERY_SELECT_ALL = "SELECT id_usuario, nombre, apellidos, tipo_usuario FROM usuarios WHERE dni = ?";
	public static final String QUERY_SELECT_BY_ID = "SELECT id_usuario, nombre, apellidos, tipo_usuario FROM usuarios WHERE id_usuario = ?";
	public static final String QUERY_SELECT_BY_DNI = "SELECT id_usuario, nombre, apellidos, tipo_usuario FROM usuarios WHERE dni = ?";
	public static final String QUERY_INSERT_USUARIO = "INSERT INTO usuarios(dni, nombre, apellidos, tipo_usuario) VALUES (?, ?, ?, ?)";
	public static final String QUERY_DELETE_USUARIO = "DELETE FROM usuarios WHERE dni = ?";

	private enum UsuariosEnum {
		
		SELECT_ALL(QUERY_SELECT_ALL, "seleccionar todos los usuarios"),
		SELECT_BY_ID(QUERY_SELECT_BY_ID, "seleccionar usuario por id"),
		SELECT_BY_DNI(QUERY_SELECT_BY_DNI, "seleccionar usuario por dni"),
		INSERT_USUARIO(QUERY_INSERT_USUARIO, "insert usuario"), 
		DELETE_USUARIO(QUERY_DELETE_USUARIO, "delete usuario");

		private String sql;

		private String title;

		private UsuariosEnum(String sql, String title) {
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
