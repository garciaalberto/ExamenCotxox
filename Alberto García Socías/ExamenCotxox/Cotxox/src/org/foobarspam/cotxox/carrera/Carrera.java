package org.foobarspam.cotxox.carrera;

import org.foobarspam.cotxox.conductores.Conductor;
import org.foobarspam.cotxox.conductores.PoolConductores;
import org.foobarspam.cotxox.tarifa.Tarifa;

public class Carrera {
	// Propiedades privadas
	private String tarjetaCredito = null;
	private String origen = null;
	private String destino = null;
	private double distancia = 0d;
	private int tiempoEsperadoMinutos = 0;
	private int tiempoCarrera = 0;
	private double costeTotal = 0d;
	private Conductor conductor = null;
	private double propina = 0d;
	
	// Constructores
	public Carrera() {
		
	}
	
	public Carrera(String tarjetaCredito){
		this.tarjetaCredito = tarjetaCredito;
	}

	// Getters y setters
	public double getCosteTotal() {
		return costeTotal;
	}

	public void setCosteTotal(double costeTotal) {
		this.costeTotal = costeTotal;
	}
	
	public String getTarjetaCredito() {
		return this.tarjetaCredito;
	}

	public String getOrigen() {
		return this.origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return this.destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public double getDistancia() {
		return this.distancia;
	}

	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}

	public int getTiempoEsperado() {
		return this.tiempoEsperadoMinutos;
	}

	public void setTiempoEsperado(int tiempoEsperaMinutos) {
		this.tiempoEsperadoMinutos = tiempoEsperaMinutos;
	}
	
	public Conductor getConductor() {
		return this.conductor;
	}

	public void setConductor(Conductor conductor) {
		this.conductor = conductor;
	}
	
	public double getPropina() {
		return this.propina;
	}

	public void setPropina(double propina) {
		this.propina = propina;
	}
	
	// Métodos
	public double getCosteEsperado(){
		Tarifa tarifa = new Tarifa();
		return tarifa.getCosteTotalEsperado(this);
	}
	
	public Conductor asignarConductor(PoolConductores flota){
		conductor = flota.asignarConductor();
		setConductor(conductor);
		return conductor;
	}
	
	public void realizarPago(double pago){
		setCosteTotal(getCosteTotal() + pago);
	}
	
	public void recibirPropina(double propina){
		setPropina(propina);
		setCosteTotal(getCosteTotal() + propina);
	}
	
	public void liberarConductor(){
		getConductor().setOcupado(false);
	}

}
