package com.biblio.interfaces.bibliotecario;

import com.biblio.models.documentos.Documento;
import com.biblio.models.usuarios.usuario.Usuario;

public interface FuncionesBibliotecario {

	public Documento seleccionarDocumento(Documento d);
	
	public Documento seleccionarDocumentoPorTitulo(String titulo);
	
	public Documento seleccionarDocumentoPorCod(String cod);
	
	public Documento prestaDocumentoActual(String dni);
	
	public void devolverDocumento(String dni, Documento documento);
	
	public Documento buscarDocumentoPorTitulo(String titulo);
	
	public Documento buscarDocumentoPorCod(String cod);
	
	//public InformePrestamo getInformePrestamos(String dniUsuario);
	
	public boolean agregarUsuario(Usuario p);
	
	public boolean eliminarUsuario(Usuario p);
	
	public boolean elimiarUsuarioPorId(String idUsuario);
	
}