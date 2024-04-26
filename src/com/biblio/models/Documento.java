package com.biblio.models;

/**
 * Clase padre Documento de la que heredan Libro y Revista 
 * @author Admin
 *
 */
public abstract class Documento {
	private String idDocumento;
	private String titulo;
	
	public Documento() {
	}
	
	public Documento(String idDocumento, String titulo) {
		this.idDocumento = idDocumento;
		this.titulo = titulo;
	}

	public String getId_documento() {
		return idDocumento;
	}

	public void setId_documento(String idDocumento) {
		this.idDocumento = idDocumento;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(this.getClass().getSimpleName()).append(", id_documento=")
		.append(idDocumento).append(", titulo=").append(titulo);
		return builder.toString();
	}
		
}
