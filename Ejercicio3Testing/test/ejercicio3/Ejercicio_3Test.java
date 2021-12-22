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
    	assertEquals(true,Ejercicio_3.principal());
    }


    @Test
    public void adecuacion_menu() {
    	/**
        System.out.println("Inserte la completitud funcional");
        Ejercicio_3.completitud = 10;
        System.out.println("Inserte la corrección funcional");
        Ejercicio_3.correcion = 34;
        System.out.println("Inserte la pertinencia funcional");
        Ejercicio_3.pertinencia = 85;
        */
        assertEquals(1,Ejercicio_3.adecuacion_menu());

    }


    @Test
    public void adecuacion_menu1() {
    	/**
        System.out.println("Inserte la completitud funcional");
        Ejercicio_3.completitud = 99;
        System.out.println("Inserte la corrección funcional");
        Ejercicio_3.correcion = 66;
        System.out.println("Inserte la pertinencia funcional");
        Ejercicio_3.pertinencia = 77;
        */
        assertEquals(2,Ejercicio_3.adecuacion_menu());

    }   
  
    
    @Test
    public void mantenibilidad_menu() {
    	/**
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
        */
        assertEquals(0,Ejercicio_3.mantenibilidad_menu());
    }
    


    @Test
    public void mantenibilidad_menu1() {
    	/**
        System.out.println("Inserte la modularidad");
        Ejercicio_3.modulo = 44;
        System.out.println("Inserte la reusabilidad");
        Ejercicio_3.reusable = 55;
        System.out.println("Inserte la analizabilidad");
        Ejercicio_3.analiza = 33;
        System.out.println("Inserte la capacidad para de ser modificado");
        Ejercicio_3.cm = 22;
        System.out.println("Inserte la capacidad para de ser probado");
        Ejercicio_3.cp = 45;
        */
        assertEquals(1,Ejercicio_3.mantenibilidad_menu());
    }

   
    @Test
    public void rango_mediciones() {
        assertTrue(Ejercicio_3.rang >= 0 && Ejercicio_3.rang < 10);
    }
    @Test
    public void rango_mediciones1() {
        assertTrue(Ejercicio_3.rang >= 10 && Ejercicio_3.rang < 35);

    }
    @Test
    public void rango_mediciones2() {
        assertTrue(Ejercicio_3.rang >= 35 && Ejercicio_3.rang < 50);
    }
    @Test
    public void rango_mediciones3() {
        assertTrue(Ejercicio_3.rang >= 50 && Ejercicio_3.rang < 70);
    }
    @Test
    public void rango_mediciones4() {
        assertTrue(Ejercicio_3.rang >= 70 && Ejercicio_3.rang < 90);

    }
    @Test
    public void rango_mediciones5() {
        assertTrue(Ejercicio_3.rang >= 90 && Ejercicio_3.rang < 100);

    }
    @Test
    public void rango_mediciones6() {
        assertTrue(Ejercicio_3.rang >= 100 && Ejercicio_3.rang < 100);

    }

    @Test
    public void manteabilidad() {
     assertEquals(0,Ejercicio_3.mantenibilidad_menu());
    }


}