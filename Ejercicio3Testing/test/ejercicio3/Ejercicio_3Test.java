package test.ejercicio3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ejercicio3.Ejercicio_3;
import test.ejercicio3.*;
import static org.junit.Assert.*;

public class Ejercicio_3Test {

    @Before
    public void setUp() throws Exception {
        System.out.println("How many time do I appear?");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Hey!");
    }

    
    @Test
    public void principal() {
    	assertEquals(true,Ejercicio_3.principal());
    }


    @Test
    public void adecuacion_menu() {
        System.out.println("Inserte la completitud funcional");
        Ejercicio_3.completitud = 10;
        System.out.println("Inserte la corrección funcional");
        Ejercicio_3.correcion = 34;
        System.out.println("Inserte la pertinencia funcional");
        Ejercicio_3.pertinencia = 85;
        assertEquals(1,Ejercicio_3.adecuacion_menu());

    }

    @Test
    public void mantenibilidad_menu() {
        System.out.println("Inserte la modularidad");
        Ejercicio_3.modulo = 66;
        System.out.println("Inserte la reusabilidad");
        Ejercicio_3.reusable = 9;
        System.out.println("Inserte la analizabilidad");
        Ejercicio_3.analiza = 54;
        System.out.println("Inserte la capacidad para de ser modificado");
        Ejercicio_3.cm = 90;
        System.out.println("Inserte la capacidad para de ser probado");
        Ejercicio_3.cp = 23;
        assertEquals(0,Ejercicio_3.mantenibilidad_menu());
    }

    @Test
    public void insertarNumero() {
    }

    @Test
    public void calcular_af() {
    }

    @Test
    public void min() {
        //assertTrue();
        //assertTrue();
    }

    @Test
    public void rango_mediciones() {
        System.out.println("Valor de rang: "+Ejercicio_3.rang);
        assertTrue(Ejercicio_3.rang >= 0 && Ejercicio_3.rang < 10);
        assertTrue(Ejercicio_3.rang >= 0 && Ejercicio_3.rang < 10);
        assertTrue(Ejercicio_3.rang >= 0 && Ejercicio_3.rang < 10);
        assertTrue(Ejercicio_3.rang >= 0 && Ejercicio_3.rang < 10);
        assertTrue(Ejercicio_3.rang >= 0 && Ejercicio_3.rang < 10);
        assertTrue(Ejercicio_3.rang >= 0 && Ejercicio_3.rang < 10);
        assertTrue(Ejercicio_3.rang >= 0 && Ejercicio_3.rang < 10);

    }

    @Test
    public void manteabilidad() {
    	
    }

    @Test
    public void calcular_cg() {
    }
}