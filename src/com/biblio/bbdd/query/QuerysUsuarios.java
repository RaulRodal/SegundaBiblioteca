package com.biblio.bbdd.query;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.biblio.bbdd.connection.Conexion;
import com.biblio.models.usuarios.usuario.TipoUsuario;
import com.biblio.models.usuarios.usuario.Usuario;

public class QuerysUsuarios {

	public static final String QUERY_SELECT_ALL = "SELECT id_usuario, nombre, apellidos, tipo_usuario FROM usuarios WHERE dni = ?";
	public static final String QUERY_SELECT_BY_ID = "SELECT id_usuario, dni, nombre, apellidos, tipo_usuario FROM usuario WHERE id_usuario = ?";
	public static final String QUERY_SELECT_BY_DNI = "SELECT id_usuario, dni, nombre, apellidos, tipo_usuario FROM usuario WHERE dni = ?";
	public static final String QUERY_INSERT_USUARIO = "INSERT INTO usuario(dni, nombre, apellidos, tipo_usuario) VALUES (?, ?, ?, ?)";
	public static final String QUERY_DELETE_USUARIO = "DELETE FROM usuario WHERE dni = ?";

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
	
	
	/**
	 * Método que inserta un usuario proporcionado como parametro
	 * @param usuario
	 * @throws SQLException
	 */
	public static void insert(Usuario usuario) throws SQLException {
		try (Connection connection = Conexion.getConnection();
				PreparedStatement statement = connection.prepareStatement(UsuariosEnum.INSERT_USUARIO.getSql());) {
			statement.setString(1, usuario.getDni());
			statement.setString(2, usuario.getNombre());
			statement.setString(3, usuario.getApellidos());
			statement.setString(4, usuario.getTipoUsuario().name());
			statement.executeUpdate();
		}
	}
	
	/**
	 * Método que busca un usuario en la bbdd a partir de un dni, crea un objeto Usuario y lo devuelve
	 * @param dni
	 * @return usuario
	 * @throws SQLException
	 */
	public static Usuario findDni(String dni) throws SQLException {
		Usuario usuario = null;

		try (Connection connection = Conexion.getConnection();
				PreparedStatement statement = connection.prepareStatement(UsuariosEnum.SELECT_BY_DNI.getSql());) {
			statement.setString(1, dni);

			try (ResultSet resultSet = statement.executeQuery()) {
				if (resultSet.next()) {
					usuario = new Usuario();
					usuario.setDni(dni);
					usuario.setIdUsuario(resultSet.getInt("id_usuario"));
					usuario.setNombre(resultSet.getString("nombre"));
					usuario.setApellidos(resultSet.getString("apellidos"));
					usuario.setTipoUsuario(TipoUsuario.valueOf(resultSet.getString("tipo_usuario").toUpperCase()));
				}
			}
		}
		return usuario;
	}

	
}
