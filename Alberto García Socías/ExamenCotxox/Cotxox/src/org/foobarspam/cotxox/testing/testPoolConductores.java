package org.foobarspam.cotxox.testing;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;
import org.foobarspam.cotxox.conductores.*;

public class testPoolConductores {

	@Test
	public void testPoolConductoresConstructor() {
		Conductor conductor = new Conductor("Fox");
		ArrayList<Conductor> flota = new ArrayList<>();
		flota.add(conductor);
		PoolConductores conductores = new PoolConductores(flota);
		assertEquals(flota, conductores.getConductores());
	}
	
	@Test
	public void testAsignarConductor() {
		Conductor conductor = new Conductor("Mola");
		ArrayList<Conductor> flota = new ArrayList<>();
		flota.add(conductor);
		PoolConductores conductores = new PoolConductores(flota);
		assertEquals(conductor, conductores.asignarConductor());
		assertTrue(conductor.isOcupado());
	}

}
