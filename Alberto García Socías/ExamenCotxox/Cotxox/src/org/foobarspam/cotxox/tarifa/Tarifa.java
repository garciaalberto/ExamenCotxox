package org.foobarspam.cotxox.tarifa;

import org.foobarspam.cotxox.carrera.Carrera;

public class Tarifa {
	// Propiedades privadas
	private double costeMilla = 1.35;
	private double costeMinuto = 0.35;
	private double costeMinimo = 5.00;
	private double porcentajeComision = 20.00;
	
	// Constructores
	public Tarifa(){
		
	}

	// Setters y getters
	public double getCosteMilla() {
		return this.costeMilla;
	}

	public double getCosteMinuto() {
		return this.costeMinuto;
	}

	public double getCosteMinimo() {
		return this.costeMinimo;
	}

	public double getPorcentajeComision() {
		return this.porcentajeComision;
	}
	
	// Métodos
	public double getCosteDistancia(double distancia){
		return getCosteMilla() * distancia;
	}
	
	public double getCosteTiempo(int minutos){
		return getCosteMinuto() * minutos;
	}
	
	public double getCosteTotalEsperado(Carrera carrera){
		double costeTiempo = getCosteTiempo(carrera.getTiempoEsperado());
		double costeDistancia = getCosteDistancia(carrera.getDistancia());
		if ((costeTiempo + costeDistancia) > 5){
			return costeTiempo + costeDistancia;
		} else {
			return getCosteMinimo();
		}
	}
}
