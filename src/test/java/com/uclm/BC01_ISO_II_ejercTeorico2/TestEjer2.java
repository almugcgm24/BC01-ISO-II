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
	public void testCalcularPrecio1() throws NoHayPlazasException {
		
		ejercicio2_ISO2.plazas = 50;
		ejercicio2_ISO2.precio = 36.0;
		ejercicio2_ISO2.edad = 78;
		ejercicio2_ISO2.IA = 200;
		ejercicio2_ISO2.enferma = false;
		ejercicio2_ISO2.sintomas_covid = false;
		ejercicio2_ISO2.contacto = false;
		ejercicio2_ISO2.pasaporteCovid = false;
		ejercicio2_ISO2.profesion_impres = false;
		assertEquals(18.0, ejercicio2_ISO2.calcularPrecio(), 0.0005);
			
	}
	
	@Test
	public void testCalcularPrecio2() throws NoHayPlazasException {
		
		ejercicio2_ISO2.plazas = 10;
		ejercicio2_ISO2.precio = 26.0;
		ejercicio2_ISO2.edad = 48;
		ejercicio2_ISO2.IA = 20;
		ejercicio2_ISO2.enferma = true;
		ejercicio2_ISO2.sintomas_covid = true;
		ejercicio2_ISO2.contacto = true;
		ejercicio2_ISO2.pasaporteCovid = true;
		ejercicio2_ISO2.profesion_impres = false;
		assertEquals(0.0, ejercicio2_ISO2.calcularPrecio(), 0.0005);
			
	}

	@Test
	public void testCalcularPrecio3() throws NoHayPlazasException {
		
		ejercicio2_ISO2.plazas = 10;
		ejercicio2_ISO2.precio = 36.0;
		ejercicio2_ISO2.edad = 45;
		ejercicio2_ISO2.IA = 250;
		ejercicio2_ISO2.enferma = false;
		ejercicio2_ISO2.sintomas_covid = false;
		ejercicio2_ISO2.contacto = false;
		ejercicio2_ISO2.pasaporteCovid = false;
		ejercicio2_ISO2.profesion_impres = false;
		assertEquals(18.0, ejercicio2_ISO2.calcularPrecio(), 0.0005);
			
	}
	
	@Test
	public void testCalcularPrecio4() throws NoHayPlazasException {
		
		ejercicio2_ISO2.plazas = 10;
		ejercicio2_ISO2.precio = 16.0;
		ejercicio2_ISO2.edad = 22;
		ejercicio2_ISO2.IA = 450;
		ejercicio2_ISO2.enferma = false;
		ejercicio2_ISO2.sintomas_covid = false;
		ejercicio2_ISO2.contacto = false;
		ejercicio2_ISO2.pasaporteCovid = false;
		ejercicio2_ISO2.profesion_impres = true;
		assertEquals(9.6, ejercicio2_ISO2.calcularPrecio(), 0.0005);
			
	}
	
	
	@Test
	public void testCalcularPrecio5() throws NoHayPlazasException {
		
		ejercicio2_ISO2.plazas = 30;
		ejercicio2_ISO2.precio = 26.0;
		ejercicio2_ISO2.edad = 32;
		ejercicio2_ISO2.IA = 550;
		ejercicio2_ISO2.enferma = false;
		ejercicio2_ISO2.sintomas_covid = false;
		ejercicio2_ISO2.contacto = false;
		ejercicio2_ISO2.pasaporteCovid = false;
		ejercicio2_ISO2.profesion_impres = false;
		assertEquals(15.6, ejercicio2_ISO2.calcularPrecio(), 0.0005);
			
	}
	
	
	@Test
	public void testCalcularPrecio6() throws NoHayPlazasException {
		
		ejercicio2_ISO2.plazas = 20;
		ejercicio2_ISO2.precio = 5.0;
		ejercicio2_ISO2.edad = 13;
		ejercicio2_ISO2.IA = 350;
		ejercicio2_ISO2.enferma = false;
		ejercicio2_ISO2.sintomas_covid = false;
		ejercicio2_ISO2.contacto = false;
		ejercicio2_ISO2.pasaporteCovid = false;
		ejercicio2_ISO2.profesion_impres = false;
		assertEquals(3.0, ejercicio2_ISO2.calcularPrecio(), 0.0005);
			
	}
	
	
	@Test
	public void testCalcularPrecio7() throws NoHayPlazasException {
		
		ejercicio2_ISO2.plazas = 55;
		ejercicio2_ISO2.precio = 5.0;
		ejercicio2_ISO2.edad = 15;
		ejercicio2_ISO2.IA = 30;
		ejercicio2_ISO2.enferma = false;
		ejercicio2_ISO2.sintomas_covid = false;
		ejercicio2_ISO2.contacto = false;
		ejercicio2_ISO2.pasaporteCovid = false;
		ejercicio2_ISO2.profesion_impres = false;
		assertEquals(2.4, ejercicio2_ISO2.calcularPrecio(), 0.0005);
			
	}
	
	
	@Test
	public void testCalcularPrecio8() throws NoHayPlazasException {
		
		ejercicio2_ISO2.plazas = 55;
		ejercicio2_ISO2.precio = 45.0;
		ejercicio2_ISO2.edad = 75;
		ejercicio2_ISO2.IA = 630;
		ejercicio2_ISO2.enferma = false;
		ejercicio2_ISO2.sintomas_covid = false;
		ejercicio2_ISO2.contacto = false;
		ejercicio2_ISO2.pasaporteCovid = false;
		ejercicio2_ISO2.profesion_impres = false;
		assertEquals(0.0, ejercicio2_ISO2.calcularPrecio(), 0.0005);
			
	}
	
	
	@Test
	public void testCalcularPrecio9() throws NoHayPlazasException {
		
		ejercicio2_ISO2.plazas = 55;
		ejercicio2_ISO2.precio = 5.0;
		ejercicio2_ISO2.edad = 75;
		ejercicio2_ISO2.IA = 30;
		ejercicio2_ISO2.enferma = false;
		ejercicio2_ISO2.sintomas_covid = false;
		ejercicio2_ISO2.contacto = false;
		ejercicio2_ISO2.pasaporteCovid = false;
		ejercicio2_ISO2.profesion_impres = false;
		assertEquals(1.2, ejercicio2_ISO2.calcularPrecio(), 0.0005);
			
	}
	

	@Test
	public void testCalcularPrecio10() throws NoHayPlazasException {
		
		ejercicio2_ISO2.plazas = 55;
		ejercicio2_ISO2.precio = 15.0;
		ejercicio2_ISO2.edad = 15;
		ejercicio2_ISO2.IA = 230;
		ejercicio2_ISO2.enferma = false;
		ejercicio2_ISO2.sintomas_covid = false;
		ejercicio2_ISO2.contacto = false;
		ejercicio2_ISO2.pasaporteCovid = false;
		ejercicio2_ISO2.profesion_impres = false;
		assertEquals(3.6, ejercicio2_ISO2.calcularPrecio(), 0.0005);
			
	}
	
	
	@Test
	public void testCalcularPrecio11() throws NoHayPlazasException {
		
		ejercicio2_ISO2.plazas = 55;
		ejercicio2_ISO2.precio = 15.0;
		ejercicio2_ISO2.edad = 75;
		ejercicio2_ISO2.IA = 130;
		ejercicio2_ISO2.enferma = false;
		ejercicio2_ISO2.sintomas_covid = false;
		ejercicio2_ISO2.contacto = false;
		ejercicio2_ISO2.pasaporteCovid = false;
		ejercicio2_ISO2.profesion_impres = false;
		assertEquals(9.0, ejercicio2_ISO2.calcularPrecio(), 0.0005);
			
	}
	
	
	@Test
	public void testCalcularPrecio12() throws NoHayPlazasException {
		
		ejercicio2_ISO2.plazas = 35;
		ejercicio2_ISO2.precio = 25.0;
		ejercicio2_ISO2.edad = 45;
		ejercicio2_ISO2.IA = 130;
		ejercicio2_ISO2.enferma = false;
		ejercicio2_ISO2.sintomas_covid = false;
		ejercicio2_ISO2.contacto = false;
		ejercicio2_ISO2.pasaporteCovid = false;
		ejercicio2_ISO2.profesion_impres = true;
		assertEquals(15.0, ejercicio2_ISO2.calcularPrecio(), 0.0005);
			
	}
	
	
	@Test
	public void testCalcularPrecio13() throws NoHayPlazasException {
		
		ejercicio2_ISO2.plazas = 35;
		ejercicio2_ISO2.precio = 25.0;
		ejercicio2_ISO2.edad = 15;
		ejercicio2_ISO2.IA = 130;
		ejercicio2_ISO2.enferma = false;
		ejercicio2_ISO2.sintomas_covid = false;
		ejercicio2_ISO2.contacto = false;
		ejercicio2_ISO2.pasaporteCovid = false;
		ejercicio2_ISO2.profesion_impres = false;
		assertEquals(21.0, ejercicio2_ISO2.calcularPrecio(), 0.0005);
			
	}
	

	@Test
	public void testCalcularPrecio14() throws NoHayPlazasException {
		
		ejercicio2_ISO2.plazas = 35;
		ejercicio2_ISO2.precio = 25.0;
		ejercicio2_ISO2.edad = 75;
		ejercicio2_ISO2.IA = 250;
		ejercicio2_ISO2.enferma = false;
		ejercicio2_ISO2.sintomas_covid = false;
		ejercicio2_ISO2.contacto = false;
		ejercicio2_ISO2.pasaporteCovid = false;
		ejercicio2_ISO2.profesion_impres = false;
		assertEquals(21.0, ejercicio2_ISO2.calcularPrecio(), 0.0005);
			
	}
	
	
	@Test
	public void testCalcularPrecio15() throws NoHayPlazasException {
		
		ejercicio2_ISO2.plazas = 35;
		ejercicio2_ISO2.precio = 25.0;
		ejercicio2_ISO2.edad = 45;
		ejercicio2_ISO2.IA = 250;
		ejercicio2_ISO2.enferma = false;
		ejercicio2_ISO2.sintomas_covid = false;
		ejercicio2_ISO2.contacto = false;
		ejercicio2_ISO2.pasaporteCovid = false;
		ejercicio2_ISO2.profesion_impres = true;
		assertEquals(21.0, ejercicio2_ISO2.calcularPrecio(), 0.0005);
			
	}
	
	
	@Test
	public void testCalcularPrecio16() throws NoHayPlazasException {
		
		ejercicio2_ISO2.plazas = 35;
		ejercicio2_ISO2.precio = 25.0;
		ejercicio2_ISO2.edad = 45;
		ejercicio2_ISO2.IA = 350;
		ejercicio2_ISO2.enferma = false;
		ejercicio2_ISO2.sintomas_covid = false;
		ejercicio2_ISO2.contacto = false;
		ejercicio2_ISO2.pasaporteCovid = false;
		ejercicio2_ISO2.profesion_impres = true;
		assertEquals(21.0, ejercicio2_ISO2.calcularPrecio(), 0.0005);
			
	}
	
	
	@Test
	public void testCalcularPrecio17() throws NoHayPlazasException {
		
		ejercicio2_ISO2.plazas = 35;
		ejercicio2_ISO2.precio = 25.0;
		ejercicio2_ISO2.edad = 45;
		ejercicio2_ISO2.IA = 350;
		ejercicio2_ISO2.enferma = false;
		ejercicio2_ISO2.sintomas_covid = false;
		ejercicio2_ISO2.contacto = false;
		ejercicio2_ISO2.pasaporteCovid = false;
		ejercicio2_ISO2.profesion_impres = false;
		assertEquals(21.0, ejercicio2_ISO2.calcularPrecio(), 0.0005);
			
	}
	
	
	@Test
	public void testCalcularPrecio18() throws NoHayPlazasException {
		
		ejercicio2_ISO2.plazas = 35;
		ejercicio2_ISO2.precio = 25.0;
		ejercicio2_ISO2.edad = 75;
		ejercicio2_ISO2.IA = 350;
		ejercicio2_ISO2.enferma = false;
		ejercicio2_ISO2.sintomas_covid = false;
		ejercicio2_ISO2.contacto = false;
		ejercicio2_ISO2.pasaporteCovid = false;
		ejercicio2_ISO2.profesion_impres = false;
		assertEquals(26.25, ejercicio2_ISO2.calcularPrecio(), 0.0005);
			
	}
	
	
	@Test
	public void testCalcularPrecio19() throws NoHayPlazasException {
		
		ejercicio2_ISO2.plazas = 55;
		ejercicio2_ISO2.precio = 45.0;
		ejercicio2_ISO2.edad = 15;
		ejercicio2_ISO2.IA = 600;
		ejercicio2_ISO2.enferma = false;
		ejercicio2_ISO2.sintomas_covid = false;
		ejercicio2_ISO2.contacto = false;
		ejercicio2_ISO2.pasaporteCovid = false;
		ejercicio2_ISO2.profesion_impres = false;
		assertEquals(47.25, ejercicio2_ISO2.calcularPrecio(), 0.0005);
			
	}
	
	
	@Test
	public void testCalcularPrecio20() throws NoHayPlazasException {
		
		ejercicio2_ISO2.plazas = 55;
		ejercicio2_ISO2.precio = 45.0;
		ejercicio2_ISO2.edad = 19;
		ejercicio2_ISO2.IA = 600;
		ejercicio2_ISO2.enferma = false;
		ejercicio2_ISO2.sintomas_covid = false;
		ejercicio2_ISO2.contacto = false;
		ejercicio2_ISO2.pasaporteCovid = false;
		ejercicio2_ISO2.profesion_impres = true;
		assertEquals(47.25, ejercicio2_ISO2.calcularPrecio(), 0.0005);
			
	}
	
	
	@Test
	public void testCalcularPrecio21() throws NoHayPlazasException {
		
		ejercicio2_ISO2.plazas = 55;
		ejercicio2_ISO2.precio = 45.0;
		ejercicio2_ISO2.edad = 45;
		ejercicio2_ISO2.IA = 600;
		ejercicio2_ISO2.enferma = false;
		ejercicio2_ISO2.sintomas_covid = false;
		ejercicio2_ISO2.contacto = false;
		ejercicio2_ISO2.pasaporteCovid = false;
		ejercicio2_ISO2.profesion_impres = true;
		assertEquals(47.25, ejercicio2_ISO2.calcularPrecio(), 0.0005);
			
	}
	
	
	

}
