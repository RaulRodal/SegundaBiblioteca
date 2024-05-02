package com.biblio.bbdd.query;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.biblio.bbdd.connection.Conexion;
import com.biblio.models.documentos.Documento;
import com.biblio.models.documentos.Libro;
import com.biblio.models.documentos.Revista;
import com.biblio.models.documentos.TipoDocumento;

public abstract class QuerysDocumentos {

	public static String QUERY_SELECT_ALL_LIBRO = "SELECT * FROM biblioteca.documento WHERE tipo_documento = 'LIBRO';";
	public static String QUERY_SELECT_ALL_REVISTA = "SELECT * FROM biblioteca.documento WHERE tipo_documento = 'REVISTA';";
	public static String QUERY_SELECT_ALL_DISPONIBLE = "SELECT * FROM biblioteca.documento WHERE disponible = '1';";
	public static String QUERY_SELECT_ALL_NOT_DISPONIBLE = "SELECT * FROM biblioteca.documento WHERE disponible = '0';";

	public static String QUERY_SELECT_LIBRO_BY_TITLE = "SELECT * FROM biblioteca.documento WHERE titulo = ? AND tipo_documento = LIBRO;";
	public static String QUERY_SELECT_REVISTA_BY_TITLE = "SELECT * FROM biblioteca.documento WHERE titulo = ? AND tipo_documento = REVISTA;";
	public static String QUERY_SELECT_DOCUMENT_BY_TITLE = "SELECT * FROM biblioteca.documento WHERE titulo = ?;";

	public static String QUERY_INSERT_LIBRO = "INSERT INTO `biblioteca`.`documento` (`codigo`, `titulo`, `anho_publicacion`, `tipo_documento`, `disponible`) VALUES (?, ?, ?, 'LIBRO', ?);";
	public static String QUERY_INSERT_REVISTA = "INSERT INTO `biblioteca`.`documento` (`codigo`, `titulo`, `anho_publicacion`, `tipo_documento`, `disponible`) VALUES (?, ?, ?, 'REVISTA', ?);";
	public static String QUERY_INSERT_NEW_DOCUMENT = "INSERT INTO `biblioteca`.`documento` (`codigo`, `titulo`, `anho_publicacion`, `tipo_documento`, `disponible`) VALUES (?, ?, ?, ?, ?);";

	public static String QUERY_DELETE_DOCUMENT_BY_ID = "DELETE FROM biblioteca.documento WHERE id_documento = ?;";

	public static String QUERY_FILTER_DOCUMENT_BY_TITLE = "SELECT * FROM biblioteca.documento WHERE titulo like ?;";
	public static String QUERY_FILTER_DOCUMENT_BY_ANHO = "SELECT * FROM biblioteca.documento WHERE anho_publicacion like '?';";
	public static String QUERY_FILTER_DOCUMENT_BY_TITLE_AND_ANHO = "SELECT * FROM biblioteca.documento WHERE titulo like '?' AND anho_publicacion like '?';";

	public static enum DocumentosEnum {

		SELECT_ALL_LIBRO(QUERY_SELECT_ALL_LIBRO, "seleccionar todos los libros"),
		SELECT_ALL_REVISTA(QUERY_SELECT_ALL_REVISTA, "seleccionar todas las revistas"),
		SELECT_ALL_DISPONIBLE(QUERY_SELECT_ALL_DISPONIBLE, "seleccinonar todos los libros que esten disponibles"),
		SELECT_ALL_NOT_DISPONIBLE(QUERY_SELECT_ALL_NOT_DISPONIBLE,
				"seleccinonar todos los libros que no esten disponibles"),

		SELECT_DOCUMENT_BY_TITLE(QUERY_SELECT_DOCUMENT_BY_TITLE, "seleccionar libro por titulo"),
		SELECT_LIBRO_BY_TITLE(QUERY_SELECT_LIBRO_BY_TITLE, "seleccionar libro"),
		SELECT_REVISTA_BY_TITLE(QUERY_SELECT_REVISTA_BY_TITLE, "seleccionar revista"),

		INSERT_DOCUMENTO(QUERY_INSERT_NEW_DOCUMENT, "insertar nuevo documento"),
		INSERT_LIBRO(QUERY_INSERT_LIBRO, "insertar nuevo libro"),
		INSERT_REVISTA(QUERY_INSERT_LIBRO, "insertar nueva revista"),

		DELETE_DOCUMENT_BY_ID(QUERY_DELETE_DOCUMENT_BY_ID, "eliminar un documento por su id"),

		FILTER_DOCUMENT_BY_TITLE(QUERY_FILTER_DOCUMENT_BY_TITLE, "filtrar documentos por titulo"),
		FILTER_DOCUMENT_BY_ANHO(QUERY_FILTER_DOCUMENT_BY_ANHO, "filtrar documentos por anho de publicacion"),
		FILTER_DOCUMENT_BY_TITLE_AND_ANHO(QUERY_FILTER_DOCUMENT_BY_TITLE_AND_ANHO,
				"filtrar documentos por titulo y anho de publicacion")

		;

		private String sql;
		private String title;

		private DocumentosEnum(String sql, String title) {
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
	 * Método que busca un documento en la bbdd a partir de un titulo, crea un objeto
	 * Libro o Revista y lo devuelve
	 * 
	 * @param tituloDocumento el titulo del documento a buscar
	 * @return Libro/Revista
	 * @throws SQLException
	 */
	public static Documento findDocumento(String tituloDocumento) throws SQLException {
		Libro libro = null;
		Revista revista = null;
		try (Connection connection = Conexion.getConnection();
				PreparedStatement statement = connection
						.prepareStatement(DocumentosEnum.FILTER_DOCUMENT_BY_TITLE.getSql());) {
			statement.setString(1, "%" + tituloDocumento + "%");
			try (ResultSet rs = statement.executeQuery()) {
				if (rs.next()) {
					String id = rs.getString("id_documento");
					String cod = rs.getString("codigo");
					String title = rs.getString("titulo");
					if (rs.getString("tipo_documento").equalsIgnoreCase(TipoDocumento.LIBRO.name())) {
						int anho = rs.getInt("anho_publicacion");
						libro = new Libro(id, cod, title, anho);
						return libro;
					}
						revista = new Revista(id, cod, title);
						return revista;
					}
				}
			}
		return null;
	}

}
