package com.biblio.models.documentos;

/**
 * Clase padre Documento de la que heredan Libro y Revista 
 * @author Admin
 *
 */
public abstract class Documento {
	private String idDocumento;
	private String cod;
	private String titulo;
	
	public Documento() {
	}
	
	public Documento(String idDocumento, String titulo) {
		this.idDocumento = idDocumento;
		this.titulo = titulo;
	}

	public Documento(String idDocumento, String cod, String titulo) {
		super();
		this.idDocumento = idDocumento;
		this.cod = cod;
		this.titulo = titulo;
	}

	public String getIdDocumento() {
		return idDocumento;
	}

	public void setIdDocumento(String idDocumento) {
		this.idDocumento = idDocumento;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getCod() {
		return cod;
	}

	public void setCod(String cod) {
		this.cod = cod;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(this.getClass().getSimpleName()).append(", id_documento=");
		builder.append(idDocumento);
		builder.append(", cod=");
		builder.append(cod);
		builder.append(", titulo=");
		builder.append(titulo);
		return builder.toString();
	}


		
}
