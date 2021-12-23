package test.ejercicio3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ejercicio3.Ejercicio_3;
import test.ejercicio3.*;
import static org.junit.Assert.*;

public class Ejercicio_3Test {


	@Test
	public void principal() {
		/**
		 * System.out.println("Inserte la completitud funcional");
		 * Ejercicio_3.completitud = 10; System.out.println("Inserte la corrección
		 * funcional"); Ejercicio_3.correcion = 34; System.out.println("Inserte la
		 * pertinencia funcional"); Ejercicio_3.pertinencia = 85;
		 */
		assertEquals(true,Ejercicio_3.principal());

	}
	@Test
	public void adecuacion_menu() {
		/**
		 * System.out.println("Inserte la completitud funcional");
		 * Ejercicio_3.completitud = 10; System.out.println("Inserte la corrección
		 * funcional"); Ejercicio_3.correcion = 34; System.out.println("Inserte la
		 * pertinencia funcional"); Ejercicio_3.pertinencia = 85;
		 */
		assertTrue(Ejercicio_3.adecuacion_menu() <= 5);

	}
	@Test
	public void adecuacion_menu2() {
		/**
		 * System.out.println("Inserte la completitud funcional");
		 * Ejercicio_3.completitud = 10; System.out.println("Inserte la corrección
		 * funcional"); Ejercicio_3.correcion = 34; System.out.println("Inserte la
		 * pertinencia funcional"); Ejercicio_3.pertinencia = 85;
		 */
		assertTrue( Ejercicio_3.adecuacion_menu()>=0);

	}


	@Test
	public void mantenibilidad_menu() {
		/**
		 * System.out.println("Inserte la modularidad"); Ejercicio_3.modulo = 66;
		 * System.out.println("Inserte la reusabilidad"); Ejercicio_3.reusable = 9;
		 * System.out.println("Inserte la analizabilidad"); Ejercicio_3.analiza = 54;
		 * System.out.println("Inserte la capacidad para de ser modificado");
		 * Ejercicio_3.cm = 90; System.out.println("Inserte la capacidad para de ser
		 * probado"); Ejercicio_3.cp = 23;
		 */
		assertTrue(Ejercicio_3.mantenibilidad_menu()<=4);
	}
	@Test
	public void numero() {
		/**
		 * System.out.println("Inserte la modularidad"); Ejercicio_3.modulo = 66;
		 * System.out.println("Inserte la reusabilidad"); Ejercicio_3.reusable = 9;
		 * System.out.println("Inserte la analizabilidad"); Ejercicio_3.analiza = 54;
		 * System.out.println("Inserte la capacidad para de ser modificado");
		 * Ejercicio_3.cm = 90; System.out.println("Inserte la capacidad para de ser
		 * probado"); Ejercicio_3.cp = 23;
		 */
		assertTrue( Ejercicio_3.insertarNumero()>=0);
	}
	@Test
	public void mantenibilidad_menu1() {
		/**
		 * System.out.println("Inserte la modularidad"); Ejercicio_3.modulo = 66;
		 * System.out.println("Inserte la reusabilidad"); Ejercicio_3.reusable = 9;
		 * System.out.println("Inserte la analizabilidad"); Ejercicio_3.analiza = 54;
		 * System.out.println("Inserte la capacidad para de ser modificado");
		 * Ejercicio_3.cm = 90; System.out.println("Inserte la capacidad para de ser
		 * probado"); Ejercicio_3.cp = 23;
		 */
		assertTrue( Ejercicio_3.mantenibilidad_menu()>=0);
	}


	

	@Test
	public void rango_mediciones() {
		assertTrue(Ejercicio_3.rang >= 0 && Ejercicio_3.rang < 100);
	}

	@Test
	public void manteabilidad() {
		assertTrue(Ejercicio_3.mantenibilidad_menu()>=0);
	}
	@Test
	public void manteabilidad1() {
		assertTrue(Ejercicio_3.mantenibilidad_menu()<=5);
	}

}