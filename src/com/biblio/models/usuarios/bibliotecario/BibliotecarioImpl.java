package com.biblio.models.usuarios.bibliotecario;

import com.biblio.interfaces.bibliotecario.FuncionesBibliotecario;
import com.biblio.models.documentos.Documento;
import com.biblio.models.usuarios.usuario.Usuario;

public class BibliotecarioImpl implements FuncionesBibliotecario{

	@Override
	public Documento seleccionarDocumento(Documento d) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Documento seleccionarDocumentoPorTitulo(String titulo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Documento seleccionarDocumentoPorCod(String cod) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Documento prestaDocumentoActual(String dni) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void devolverDocumento(String dni, Documento documento) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Documento buscarDocumentoPorTitulo(String titulo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Documento buscarDocumentoPorCod(String cod) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean agregarUsuario(Usuario p) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean eliminarUsuario(Usuario p) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean elimiarUsuarioPorId(String idUsuario) {
		// TODO Auto-generated method stub
		return false;
	}

}
