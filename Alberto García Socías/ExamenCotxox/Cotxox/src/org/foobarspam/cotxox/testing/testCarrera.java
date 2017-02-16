package org.foobarspam.cotxox.testing;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;
import org.foobarspam.cotxox.carrera.*;
import org.foobarspam.cotxox.conductores.Conductor;
import org.foobarspam.cotxox.conductores.PoolConductores;

public class testCarrera {

	@Test
	public void testCarreraConstructor() {
		String tarjetaCredito = "123456789";
		Carrera carrera = new Carrera(tarjetaCredito);
		assertEquals(tarjetaCredito, carrera.getTarjetaCredito());
	}
	
	@Test
	public void testCarreraSetters() {
		Carrera carrera = new Carrera();
		String origen = "Aeroport Son Sant Joan";
		String destino= "Magaluf";
		double distancia = 7.75;
		int tiempoEsperadoMinutos = 10;
		carrera.setOrigen(origen);
		carrera.setDestino(destino);
		carrera.setDistancia(distancia);
		carrera.setTiempoEsperado(tiempoEsperadoMinutos);
		assertEquals(origen, carrera.getOrigen());
		assertEquals(destino, carrera.getDestino());
		assertEquals(distancia, carrera.getDistancia(), 0.001);
		assertEquals(tiempoEsperadoMinutos, carrera.getTiempoEsperado());
	}
	
	@Test
	public void testGetCosteEsperado() {
		Carrera carrera = new Carrera();
		carrera.setDistancia(100.00);
		carrera.setTiempoEsperado(100);
		assertEquals(170.00, carrera.getCosteEsperado(), 0.001);
	}

	@Test
	public void testAsignarConductor() {
		Carrera carrera = new Carrera();
		Conductor conductor = new Conductor("Fox");
		ArrayList<Conductor> flota = new ArrayList<>();
		flota.add(conductor);
		PoolConductores conductores = new PoolConductores(flota);
		assertEquals(conductor, carrera.asignarConductor(conductores));
	}
	
	@Test
	public void testRealizarPago() {
		Carrera carrera = new Carrera();
		carrera.setDistancia(100.00);
		carrera.setTiempoEsperado(100);
		carrera.realizarPago(carrera.getCosteEsperado());
		assertEquals(170.00, carrera.getCosteTotal(), 0.001);
	}
	
	@Test 
	public void testRecibirPropina() {
		Carrera carrera = new Carrera();
		carrera.setDistancia(100.00);
		carrera.setTiempoEsperado(100);
		carrera.realizarPago(carrera.getCosteEsperado());
		carrera.recibirPropina(5);
		assertEquals(175.00, carrera.getCosteTotal(), 0.001);
	}

	@Test
	public void testLiberarConductor() {
		Carrera carrera = new Carrera();
		Conductor conductor = new Conductor("Fox");
		ArrayList<Conductor> flota = new ArrayList<>();
		flota.add(conductor);
		PoolConductores conductores = new PoolConductores(flota);
		carrera.asignarConductor(conductores);
		carrera.liberarConductor();
		assertEquals(false, conductor.isOcupado());
	}
}
