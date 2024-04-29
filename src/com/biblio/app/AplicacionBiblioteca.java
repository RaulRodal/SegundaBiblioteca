package com.biblio.app;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

import com.biblio.bbdd.connection.Conexion;
import com.biblio.menu.GestionMenu;
import com.biblio.models.documentos.TipoDocumento;

public class AplicacionBiblioteca {

	public static void main(String[] args) {
		
		// Establecer conexion con patron singleton
		Connection conn = Conexion.getConnection();
		
		// Scanner para pedir datos por consola de comandos
		Scanner sc = new Scanner(System.in);
		
		// Lanzar el menu de la aplicacion
		try {
			GestionMenu.menu(conn, sc);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
