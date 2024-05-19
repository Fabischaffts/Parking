package ar.unlam.pb2.tp.parcking;

import static org.junit.Assert.*;

import org.junit.Test;

public class test {

	@Test
	public void QueSePuedaCrearUnAutotest() {
		
		String marca = "BMW";
		String color = "rojo";
		String patente = "A2002E";
		Vehiculo auto = new Auto(marca, color, patente);
		assertTrue(auto.getAuto());
	}


}
