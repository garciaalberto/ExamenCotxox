package org.foobarspam.cotxox.conductores;

import java.util.ArrayList;

public class Conductor {
	// Propiedades privadas
	private String nombre = null;
	private String matricula = null;
	private String modelo = null;
	private ArrayList<Byte> valoraciones = new ArrayList<>();
	private boolean ocupado = false;
	
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
		double valoracion = 0d;
		for (Byte valor : getValoraciones()){
			valoracion += valor;
		}
		return valoracion / getValoraciones().size();
	}

	public ArrayList<Byte> getValoraciones() {
		return this.valoraciones;
	}

	public void setValoracion(Byte valoracion) {
		this.valoraciones.add(valoracion);
	}

	public boolean isOcupado() {
		return ocupado;
	}

	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}
	
	
}
