package org.foobarspam.cotxox.testing;

import static org.junit.Assert.*;

import org.junit.Test;
import org.foobarspam.cotxox.carrera.Carrera;
import org.foobarspam.cotxox.tarifa.Tarifa;

public class testTarifa {

	@Test
	public void testGetCosteDistancia() {
		Tarifa tarifa = new Tarifa();
		assertEquals(135.00, tarifa.getCosteDistancia(100.00), 0.001);
	}
	
	@Test
	public void testGetCosteTiempo(){
		Tarifa tarifa = new Tarifa();
		assertEquals(35.00, tarifa.getCosteTiempo(100), 0.001);
	}
	
	@Test
	public void testGetCosteTotalEsperado(){
		Tarifa tarifa = new Tarifa();
		Carrera carrera = new Carrera();
		carrera.setDistancia(100.00);
		carrera.setTiempoEsperado(100);
		assertEquals(170.00, tarifa.getCosteTotalEsperado(carrera), 0.001);
	}
	
	@Test
	public void testgetCosteMinimo(){
		Tarifa tarifa = new Tarifa();
		Carrera carrera = new Carrera();
		carrera.setDistancia(1.00);
		carrera.setTiempoEsperado(1);
		assertEquals(5.00, tarifa.getCosteTotalEsperado(carrera), 0.001);
	}
}
