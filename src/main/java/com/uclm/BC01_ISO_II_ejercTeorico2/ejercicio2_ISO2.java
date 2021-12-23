package com.uclm.BC01_ISO_II_ejercTeorico2;
import java.util.Scanner;

public class ejercicio2_ISO2 {
    static Double precio = 0.0;
	static int edad = 0;
	static int IA = 0;
	static Double reduccion_plazas;
	static int plazas;
	static int nivel;
    static Boolean enferma = false, sintomas_covid = false, contacto = false, pasaporteCovid = false, profesion_impres = false;
	static Double descuento = 0.0, incremento = 0.0;
	static Double reserva_plazas = 0.0;
    final static Scanner teclado=new Scanner(System.in);
public static void main(String[] args){

	principal();
}


public static boolean principal() {
	
	boolean a = true;
	String respuesta;
	try{

	try{
	System.out.println("Por favor, introduzca el precio normal del billete: ");
	precio = obtenerDoublePositivo();
	System.out.println("Por favor, introduzca la edad: ");
	try{
	edad = obtenerEdad();
	}catch(EdadException d){
		respuesta=d.getMessage();
		System.out.println(respuesta);
		a = false;
		System.exit(0);
	}
	
	System.out.println("Por favor, introduzca la IA de la comunidad: ");
	IA = obtenerPositivo();
	System.out.println("Por favor, introduzca el numero de plazas que existen: ");
	plazas = obtenerPositivo();
	}catch(NegativoException n){
		respuesta=n.getMessage();
		System.out.println(respuesta);
		a = false;
		System.exit(0);
	}

	System.out.println("Por favor, introduzca si la persona se encuentra enferma (true/false): ");
	enferma = teclado.nextBoolean();
	System.out.println("Por favor, introduzca si la persona posee síntomas de covid (true/false): ");
	sintomas_covid = teclado.nextBoolean();
	System.out.println("Por favor, introduzca si la persona ha tenido contacto con un positivo (true/false): ");
	contacto = teclado.nextBoolean();
	System.out.println("Por favor, introduzca si la persona posee pasaporte Covid (true/false): ");
	pasaporteCovid = teclado.nextBoolean();
	System.out.println("Por favor, introduzca si la persona ocupa una profesión imprescindible (true/false): ");
	profesion_impres = teclado.nextBoolean();
	
	precio = calcularPrecio();
	System.out.println("El precio del billete es: " + precio + " euros.");
	} catch(NoHayPlazasException ex){
		respuesta=ex.getMessage();
		System.out.println(respuesta);
		a = false;
		System.exit(0);
	}
	
	return a;
}
public static double calcularPrecio() throws NoHayPlazasException {
	if(IA < 100){
		nivel = 0;
		reduccion_plazas = 0.0;
	} else if(100<=IA && IA<=200){
		nivel = 1;
		reduccion_plazas = 0.8;
	} else if(200<IA && IA<=300){
		nivel = 2;
		reduccion_plazas = 0.6;
	} else if(300<IA && IA<=500){
		nivel = 3;
		reduccion_plazas = 0.4;
	} else if(500<IA){
		nivel = 4;
		reduccion_plazas = 0.3;
	}
		plazas = (int) (plazas - (plazas * reduccion_plazas));
	if(enferma || contacto || sintomas_covid){
		precio = 0.0;
		System.out.println("Lo sentimos, no puede viajar.");
		return precio;
	} else if(nivel == 0 && edad < 23){
		descuento = 0.6;
	} else if(nivel == 0 && edad > 65){
		descuento = 0.8;
	} else if(nivel == 1 && edad < 23){
		descuento = 0.3;
	} else if(nivel == 1 && edad > 65){
		descuento = 0.5;
	} else if(nivel == 2 && edad > 65){
		incremento = 0.2;
		plazas = (int) (plazas - (plazas * 0.6));
	} else if(nivel == 2 && 18<= edad && edad <= 65 && profesion_impres == true){
		plazas = (int) (plazas * 0.6);
	} else if(nivel == 2 && edad <= 65 && profesion_impres == false){
		plazas = (int) (plazas - (plazas * 0.6));
	} else if(nivel == 3 && edad < 23 && profesion_impres == false){
		incremento = 0.2;
		plazas = (int) (plazas - (plazas * 0.8));
	} else if(nivel == 3 && 18<= edad && edad < 23 && profesion_impres == true){
		incremento = 0.2;
		plazas = (int) (plazas * 0.8);
	} else if(nivel == 3 && 23<= edad && edad <= 65 && profesion_impres == true){
		plazas = (int) (plazas * 0.8);
	} else if(nivel == 3 && 23<= edad && edad <= 65 && profesion_impres == false){
		plazas = (int) (plazas - (plazas * 0.8));
	} else if(nivel == 3 && edad > 65){
		incremento = 0.5;
		plazas = (int) (plazas - (plazas * 0.8));
	} else if(nivel == 4 && edad < 23 && profesion_impres == false){
		incremento = 0.5;
		plazas = (int) (plazas - (plazas * 0.9));
	} else if(nivel == 4 && 18<= edad && edad < 23 && profesion_impres == true){
		incremento = 0.5;
		plazas = (int) (plazas * 0.9);
	} else if(nivel == 4 && 23<= edad && edad <= 65 && profesion_impres == true){
		plazas = (int) (plazas * 0.9);
	} else if(nivel == 4 && 23<= edad && edad <= 65 && profesion_impres == false){
		plazas = (int) (plazas - (plazas * 0.9));
	} else if(nivel == 4 && edad > 65){
		precio = 0.0;
		System.out.println("Lo sentimos, no puede viajar.");
		return precio;
	}
	if(plazas <= 0){
		throw new NoHayPlazasException("Lo sentimos, no hay plazas suficientes.");
	}
	precio = precio + (precio * incremento); //aplicamos incremento
	precio = precio - (precio * descuento); //aplicamos descuento

	return precio; 
	}

	public static int obtenerEdad() throws EdadException{
		int mi_edad = 0;
		mi_edad = teclado.nextInt();
		if(mi_edad <= 0 || mi_edad > 100){
			throw new EdadException("Error, ha introducido una edad inválida.");
		}

		return mi_edad;
	}

	public static int obtenerPositivo() throws NegativoException{
		int numero = 0;
		numero = teclado.nextInt();
		if(numero < 0){
			throw new NegativoException("Dato incorrecto, por favor, introduzca números positivos.");
		}

		return numero;
	}

	public static double obtenerDoublePositivo() throws NegativoException{
		double numeroDouble = 0;
		numeroDouble = teclado.nextDouble();
		if(numeroDouble < 0.0){
			throw new NegativoException("Dato incorrecto, por favor, introduzca números positivos.");
		}

		return numeroDouble;
	}
}  


