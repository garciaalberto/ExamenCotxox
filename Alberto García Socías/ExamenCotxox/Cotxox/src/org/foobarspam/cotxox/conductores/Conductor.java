package org.foobarspam.cotxox.conductores;

import java.util.ArrayList;

public class Conductor {
	// Propiedades privadas
	private String nombre = null;
	private String matricula = null;
	private String modelo = null;
	private ArrayList<Byte> valoraciones = new ArrayList<>();
	private boolean ocupado = false;
	private Double valoracionMedia = 0d;
	
	// Constructores
	public Conductor() {
		
	}
	
	public Conductor(String nombre) {
		this.nombre = nombre;
	}

	// Setters y Getters
	public String getNombre() {
		return this.nombre;
	}

	public String getMatricula() {
		return this.matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getValoracion() {
		return getValoracionMedia();
	}

	public ArrayList<Byte> getValoraciones() {
		return this.valoraciones;
	}

	public void setValoracion(Byte valoracion) {
			valoraciones.add(valoracion);
			this.actualizarMedia();
	}

	public boolean isOcupado() {
		return ocupado;
	}

	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}

	public void setValoracionMedia(Double valoracionMedia) {
		this.valoracionMedia = valoracionMedia;
	}

	public Double getValoracionMedia() {
		return valoracionMedia;
	}
	
	public void actualizarMedia() {

		int suma = 0;

		for (Byte valoracion : this.getValoraciones()) {
			suma = suma + valoracion;
		}
		int longitud = this.getValoraciones().size();
		double media = suma / longitud;
		this.setValoracionMedia(media);
	}
	
	
}
