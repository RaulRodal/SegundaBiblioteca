package com.biblio.app;

import java.sql.Connection;
import java.util.Scanner;

import com.biblio.connection.Conexion;
import com.biblio.menu.GestionMenu;

public class AplicacionBiblioteca {

	public static void main(String[] args) {
		
		Connection conn = Conexion.getConnection();
		Scanner sc = new Scanner(System.in);
		GestionMenu.menu(conn, sc);
		
	}
}
