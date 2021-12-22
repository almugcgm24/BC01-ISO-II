package Dominio;

import java.io.*;  
import java.util.*;
import java.sql.*;
import java.io.*;
import Persistencia.Agente;

public class Main {
	
	public static final Scanner teclado = new Scanner(System.in);
	public static Connection conexion;
	public static Statement sentencia;
	public static ResultSet resultado;

	public static void main(String[] args) throws Exception {
		BufferedReader leer =
				new BufferedReader (new InputStreamReader (System.in));
				System.out.println("Iniciando programa");
				//Se carga el driver JDBC-ODBC
				try{
					Conexion c=new Conexion();
					conexion=c.conectar();
				} catch (Exception e) {
				System.out.println("No se pudo cargar el puente JDBC-ODBC");
				return;
				}
		try {
			sentencia = conexion.createStatement();
		
		
		System.out.println("Bienvenido al Centro de Salud Healthy");

		boolean salir = false; // variable empleada para salir del programa
		int elegir_menu; // esta variable determina que opcion del men� elegimos
		do {
			try {
				System.out.println("Por favor, seleccione una opcion:");
				System.out.println("1.- Mostrar informacion de las enfermedad del sistema.");
				System.out.println("2.- Actualizar informacion sobre las enfermedad del sistema.");
				System.out.println("3.- Mostrar información sobre los pacientes de CLM.");
				System.out.println("4.- Añadir un paciente.");
				System.out.println("5.- Eliminar un paciente.");
				System.out.println("6.- Salir del programa.");
				elegir_menu = teclado.nextInt();
				teclado.nextLine();
				switch (elegir_menu) { // elegir_menu determina el case que se ejecutar� seg�n la opci�n seleccionada
				case 1:
					mostrarInformacionenfermedad();
					break;
				case 2: 
					System.out.println(actualizarInformacionenfermedad());
					break;
				case 3: 
					mostrarPacientes();
					break;
				case 4: 
					System.out.println(anadirPaciente());
					break;
				case 5: 
					System.out.println(eliminarPaciente());
					break;
				case 6: // para salir del programa
					salir = true; // salir se pone a true para poder salir del bucle do while y finalizar el
									// programa
					System.out.println("Muchas gracias por usar nuestro programa.");
					break;
				}
			} catch (InputMismatchException e) { // si el valor introducido en la selecci�n del men� no es un n�mero,
													// saltar� este mensaje de error
				System.out.println("Error, no se ha introducido un valor numerico.");
				teclado.next();
			}
		} while (!salir); // para que cuando sea false se repita el bucle (por eso se niega la variable
							// salir)
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	
	public static void mostrarInformacionenfermedad() throws Exception{
		resultado = sentencia.executeQuery("SELECT * FROM enfermedades");
		while(resultado.next()) {
			String nom_enfermedad = resultado.getString(1);
			System.out.print("Nombre: " + nom_enfermedad + ", ");
			String sintomas = resultado.getString(2);
			if(sintomas != null) {
			System.out.print("Sintomas: " + sintomas + ", ");
			int duracion = resultado.getInt(3);
			if(duracion != 0) {
			System.out.print("Duracion: " + duracion + ", ");
			String gravedad = resultado.getString(4);
			if(gravedad != null) {
			System.out.print("Gravedad: " + gravedad + ", ");
			System.out.println();			
			}
		}}}
		
	}
	
	public static boolean actualizarInformacionenfermedad() throws Exception{ 
		boolean actualizacion_correcta = false;
		String nombreSeleccionado = null;
		String campo = "";
		String nuevaInformacion = "";
		System.out.println("Introduce el nombre de la enfermedad de la que desea actualizar su informacion: ");
		nombreSeleccionado = teclado.nextLine();
		System.out.println("Introduce el campo de la enfermedad del que desea modificar su informacion (Sin espacios): ");
		campo = teclado.nextLine();
		System.out.println("Introduce la nueva informacion de la enfermedad en ese campo: ");
		nuevaInformacion = teclado.nextLine();
		if(campo.equalsIgnoreCase("nom_enfermedad")){
			String SQL = "UPDATE enfermedades SET nom_enfermedad='"+nuevaInformacion+"' WHERE nom_enfermedad='"+nombreSeleccionado+"'";
			PreparedStatement PS = conexion.prepareStatement(SQL);
			sentencia = conexion.createStatement();
			int resultado = PS.executeUpdate(SQL);
			actualizacion_correcta = true;
		}
		if(campo.equalsIgnoreCase("sintomas")){
			String SQL = "UPDATE enfermedades SET sintomas='"+nuevaInformacion+"' WHERE nom_enfermedad='"+nombreSeleccionado+"'";
			System.out.println(SQL);
			PreparedStatement PS = conexion.prepareStatement(SQL);
			sentencia = conexion.createStatement();
			int resultado = PS.executeUpdate(SQL);
			actualizacion_correcta = true;
		}
		if(campo.equalsIgnoreCase("duracion")){
			String SQL = "UPDATE enfermedades SET duracion='"+nuevaInformacion+"' WHERE nom_enfermedad='"+nombreSeleccionado+"'";
			PreparedStatement PS = conexion.prepareStatement(SQL);
			sentencia = conexion.createStatement();
			int resultado = PS.executeUpdate(SQL);
			actualizacion_correcta = true;
		}
		if(campo.equalsIgnoreCase("gravedad")){
			String SQL = "UPDATE enfermedades SET gravedad='"+nuevaInformacion+"' WHERE nom_enfermedad='"+nombreSeleccionado+"'";
			PreparedStatement PS = conexion.prepareStatement(SQL);
			sentencia = conexion.createStatement();
			int resultado = PS.executeUpdate(SQL);
			actualizacion_correcta = true;
		}
		
		
		return actualizacion_correcta;
	}
	
	public static void mostrarPacientes() throws Exception{
		resultado = sentencia.executeQuery("SELECT * FROM pacientes");
		while(resultado.next()) {
			String nombre = resultado.getString(1);
			if(nombre != null) {
				System.out.print("Nombre del paciente: " + nombre + ", ");
				String apellidos = resultado.getString(2);
			if(apellidos != null) {
				System.out.print("Apellidos del paciente: " + apellidos + ", ");
				String telefono = resultado.getString(3);
			if(telefono != null) {
				System.out.print("Telefono del paciente: " + telefono + ", ");
				String dni = resultado.getString(4);
			if(dni != null) {
				System.out.print("DNI del paciente: " + dni + ", ");
				int edad = resultado.getInt(5);
			if(edad != 0) {
				System.out.print("Edad del paciente: " + edad + ".");
				System.out.println();
			}
		}}}}}
	}
	
	public static boolean anadirPaciente() throws Exception{ 
		boolean registro_correcto = false;
		String nombre = "";
		String apellidos = "";
		String telefono = "";
		String dni = "";
		int edad = 0;
		
		System.out.println("Introduce el nombre del paciente que desea añadir: ");
		nombre = teclado.nextLine();
		System.out.println("Introduce los apellidos del paciente que desea añadir: ");
		apellidos = teclado.nextLine();
		System.out.println("Introduce el telefono del paciente que desea añadir: ");
		telefono = teclado.nextLine();
		System.out.println("Introduce el dni del paciente que desea añadir: ");
		dni = teclado.nextLine();
		System.out.println("Introduce la edad del paciente que desea añadir: ");
		edad = teclado.nextInt();
		
		String SQL = "INSERT INTO pacientes VALUES ('"+nombre+"', '"+apellidos+"', '"+telefono+"', '"+dni+"', '"+edad+"');";
		PreparedStatement PS = conexion.prepareStatement(SQL);
		sentencia = conexion.createStatement();
		int resultado = PS.executeUpdate(SQL);
		registro_correcto = true;

		
		return registro_correcto;
	}
	public static boolean eliminarPaciente() throws Exception{ 
		boolean registro_correcto = false;
		String nombre = "";
		String apellidos = "";
		String telefono = "";
		String dni = "";
		int edad = 0;
		
		System.out.println("Introduce el nombre del paciente que desea eliminar: ");
		nombre = teclado.nextLine();
		System.out.println("Introduce el dni del paciente que desea eliminar: ");
		dni = teclado.nextLine();
		
		String SQL = "DELETE FROM pacientes WHERE (nombre ='"+nombre+"');";
		System.out.println(SQL);
		PreparedStatement PS = conexion.prepareStatement(SQL);
		sentencia = conexion.createStatement();
		int resultado = PS.executeUpdate(SQL);
		registro_correcto = true;

		
		return registro_correcto;
	}
	

}
