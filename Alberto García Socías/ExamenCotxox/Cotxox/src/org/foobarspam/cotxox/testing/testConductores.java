package org.foobarspam.cotxox.testing;

import static org.junit.Assert.*;

import org.junit.Test;
import org.foobarspam.cotxox.conductores.*;

public class testConductores {

	@Test
	public void testConstructorConductor() {
		String nombre = "Fox";
		Conductor conductor = new Conductor(nombre);
		assertEquals(nombre, conductor.getNombre());
	}
	
	@Test
	public void testSettersConductor() {
		Conductor conductor = new Conductor();
		conductor.setMatricula("5DHJ444");
		conductor.setModelo("Toyota Prius");
		conductor.setValoracion((byte)4);
		assertEquals("5DHJ444", conductor.getMatricula());
		assertEquals("Toyota Prius", conductor.getModelo());
		assertEquals(4.0, conductor.getValoracion(), 0.001);
	}
}
