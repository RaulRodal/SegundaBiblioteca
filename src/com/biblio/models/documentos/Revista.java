package com.biblio.models.documentos;

/**
 * Clase que hereda de Documento 
 * @author Admin
 *
 */
public class Revista extends Documento {

	public Revista() {
	}
	
	public Revista(String idRevista, String titulo) {
		super(idRevista, titulo);
	}
	
	public Revista(String idDocumento, String cod, String titulo) {
		super(idDocumento, cod, titulo);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		return builder.toString();
	}
}
