package com.biblio.app;

import java.sql.Connection;
import java.util.Scanner;

import com.biblio.connection.Conexion;
import com.biblio.menu.GestionMenu;
import com.biblio.models.documentos.TipoDocumento;

public class AplicacionBiblioteca {

	public static void main(String[] args) {
		
		// Establecer conexion con patron singleton
		Connection conn = Conexion.getConnection();
		
		// Scanner para pedir datos por consola de comandos
		Scanner sc = new Scanner(System.in);
		
		// Lanzar el menu de la aplicacion
		GestionMenu.menu(conn, sc);
		
	}
}
