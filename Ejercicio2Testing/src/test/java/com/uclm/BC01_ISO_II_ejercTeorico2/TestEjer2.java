package com.uclm.BC01_ISO_II_ejercTeorico2;

import static org.junit.Assert.*; 

import org.junit.*;
import com.uclm.BC01_ISO_II_ejercTeorico2.ejercicio2_ISO2;

public class TestEjer2 {
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("@BeforeClass");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("@AfterClass");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("@Before -> How many times do i appear?");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("@After -> How many times do i appear?");
	}

	@Test
	public void testMain() throws NoHayPlazasException {
		
		ejercicio2_ISO2.plazas = 50;
		ejercicio2_ISO2.precio = 36.0;
		ejercicio2_ISO2.edad = 78;
		ejercicio2_ISO2.IA = 200;
		ejercicio2_ISO2.enferma = false;
		ejercicio2_ISO2.sintomas_covid = false;
		ejercicio2_ISO2.contacto = false;
		ejercicio2_ISO2.pasaporteCovid = false;
		ejercicio2_ISO2.profesion_impres = false;
		assertEquals(18.0, ejercicio2_ISO2.calcularPrecio(), 0.0);
			
	}

	@Test
	public void testCalcularPrecio() {

		ejercicio2_ISO2.plazas = 45;
		ejercicio2_ISO2.precio = 34.0;
		ejercicio2_ISO2.edad = 45;
		ejercicio2_ISO2.IA = 340;
		ejercicio2_ISO2.enferma = false;
		ejercicio2_ISO2.sintomas_covid = false;
		ejercicio2_ISO2.contacto = false;
		ejercicio2_ISO2.pasaporteCovid = false;
		ejercicio2_ISO2.profesion_impres = true;
		assertEquals(1, ejercicio2_ISO2.nivel);
	}

	@Test
	public void testObtenerEdad() throws EdadException {

		System.out.println("Introduzca la edad: ");
		assertEquals(78, ejercicio2_ISO2.obtenerEdad());
	}

	@Test
	public void testObtenerPositivo() throws NegativoException {
	
		System.out.println("Introduzca un numero positivo: ");
		assertTrue(ejercicio2_ISO2.obtenerPositivo()>0);
	}

	@Test
	public void testObtenerDoublePositivo() throws NegativoException {

		System.out.println("Introduzca un numero positivo, es decir, el precio inicial del billete: ");
		assertTrue(ejercicio2_ISO2.obtenerDoublePositivo()>0.0);
	}

}
