package com.biblio.models.usuarios.usuario;

import java.time.LocalDate;

import com.biblio.models.documentos.Documento;
import com.biblio.models.documentos.Revista;

/**
 * Clase Usuario que siempre inicializa el TipoUsuario en OCASIONAL, tiene todos los getters y setters
 * y un par de métodos necesarios para calcular la fecha de devolucion y para hacer socio a un usuario
 * @author Admin
 *
 */
public class Usuario {

	private int idUsuario;
	private String dni;
	private String nombre;
	private String apellidos;	
	private TipoUsuario tipoUsuario;
	
	public Usuario() {
		this.tipoUsuario = TipoUsuario.OCASIONAL;
	}

	public Usuario(String dni, String nombre, String apellidos) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.tipoUsuario = TipoUsuario.OCASIONAL;
	}

	public Usuario(int idUsuario) {
		super();
		this.idUsuario = idUsuario;
	}
	
	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return this.apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
		
	public TipoUsuario getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(TipoUsuario tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	//Método setTipo_usuario que recibe un String y asigna si coincide con un TipoUsuario
	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = TipoUsuario.valueOf(tipoUsuario.toUpperCase());
	}

	//Método que cambia el TipoUsuario a SOCIO
	public void hacerSocio() {
		this.tipoUsuario = TipoUsuario.SOCIO;
	}
	
	//Método que devuelve la fecha maxima a la que puede devolver el documento proporcionado
	public LocalDate fechaDevolucion(LocalDate fecha, Documento documento) {
		
		int numDias = this.tipoUsuario.getMaxDiasLibro();
		
		if (documento instanceof Revista) {
			numDias = numDias/3;
		}
		
		return fecha.plusDays(numDias);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(this.getClass().getSimpleName()).append(", id=").append(idUsuario).append(", dni=")
		.append(dni).append(", nombre=").append(nombre).append(", apellidos=").append(apellidos)
		.append(", tipo de usuario=").append(tipoUsuario);
		return builder.toString();
	}

	
}
