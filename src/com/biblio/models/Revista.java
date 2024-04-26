package com.biblio.models;

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
}
