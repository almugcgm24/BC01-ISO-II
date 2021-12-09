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

	public static void main(String[] args) {
		BufferedReader leer =
				new BufferedReader (new InputStreamReader (System.in));
				System.out.println("Iniciando programa");
				//Se carga el driver JDBC-ODBC
				try{
				Class.forName ("com.mysql.jdbc.Driver");
				} catch (Exception e) {
				System.out.println("No se pudo cargar el puente JDBC-ODBC");
				return;
				}
		try {
		//Se establece la conexi�n con la base de datos
		conexion=DriverManager.getConnection ("jdbc:mysql://localhost:3306/pacientes","root","carladavid"); 
		//consultas
		sentencia = conexion.createStatement();
		
		System.out.println("Bienvenido al Centro de Salud Healthy");

		boolean salir = false; // variable empleada para salir del programa
		int elegir_menu; // esta variable determina que opcion del men� elegimos
		do {
			try {
				System.out.println("Por favor, seleccione una opci�n:");
				System.out.println("1.- Mostrar informaci�n m�dica de los pacientes del centro de salud.");
				System.out.println("2.- Actualizar informaci�n m�dica de un paciente seleccionado del centro de salud.");
				System.out.println("3.- Mostrar informaci�n de los traslados de pacientes a otros centros hospitalarios.");
				System.out.println("4.- Registrar un traslado de un paciente a otro centro hospitalario.");
				System.out.println("5.- Salir del programa.");
				elegir_menu = teclado.nextInt();
				teclado.nextLine();
				switch (elegir_menu) { // elegir_menu determina el case que se ejecutar� seg�n la opci�n seleccionada
				case 1:
					mostrarInformacionPacientes();
					break;
				case 2: 
					System.out.println(actualizarInformacionPaciente());
					break;
				case 3: 
					mostrarTraslados();
					break;
				case 4: 
					System.out.println(registrarTraslado());
					break;
				case 5: // para salir del programa
					salir = true; // salir se pone a true para poder salir del bucle do while y finalizar el
									// programa
					System.out.println("Muchas gracias por usar nuestro programa.");
					break;
				}
			} catch (InputMismatchException e) { // si el valor introducido en la selecci�n del men� no es un n�mero,
													// saltar� este mensaje de error
				System.out.println("Error, no se ha introducido un valor num�rico.");
				teclado.next();
			}
		} while (!salir); // para que cuando sea false se repita el bucle (por eso se niega la variable
							// salir)
	}catch(Exception e) {
		System.out.println (e);return;
	}
	}
	
	public static void mostrarInformacionPacientes() throws Exception{
		resultado = sentencia.executeQuery("SELECT * FROM pacientes");
		while(resultado.next()) {
			int idPaciente = resultado.getInt(1);
			System.out.print("ID: " + idPaciente + ", ");
			String nombre = resultado.getString(2);
			if(nombre != null) {
			System.out.print("Nombre: " + nombre + ", ");
			String apellido = resultado.getString(3);
			System.out.print("Apellido: " + apellido + ", ");
			String dni = resultado.getString(4);
			System.out.print("DNI: " + dni + ", ");
			String telefono = resultado.getString(5);
			System.out.print("Telefono: " + telefono + ", ");
			String direccion = resultado.getString(6);
			System.out.print("Direccion: " + direccion + ", ");
			String fecha_Nacimiento = resultado.getString(7);
			System.out.print("Fecha de nacimiento: " + fecha_Nacimiento + ", ");
			int edad = resultado.getInt(8);
			System.out.print("Edad: " + edad + ", ");
			String tarjeta_Sanitaria = resultado.getString(9);
			System.out.print("Tarjeta sanitaria: " + tarjeta_Sanitaria + ", ");
			String grupo_Sanguineo = resultado.getString(10);
			System.out.print("Grupo sanguineo: " + grupo_Sanguineo + ", ");
			String alergias = resultado.getString(11);
			System.out.print("Alergias: " + alergias + ", ");
			String patologia = resultado.getString(12);
			System.out.print("Patologia: " + patologia + ", ");
			String tratamiento = resultado.getString(13);
			System.out.print("Tratamiento: " + tratamiento + ", ");
			String operaciones = resultado.getString(14);
			System.out.print("Operaciones: " + operaciones + ", ");
			String antecedentes_Familiares = resultado.getString(15);
			System.out.print("Antecedentes familiares: " + antecedentes_Familiares + ", ");
			String medicacion = resultado.getString(16);
			System.out.print("Medicacion: " + medicacion + ". ");
			System.out.println();			
			}
		}
	}
	
	public static boolean actualizarInformacionPaciente() throws Exception{ 
		boolean actualizacion_correcta = false;
		int idSeleccionado = 0;
		String campo = "";
		String nuevaInformacion = "";
		System.out.println("Introduce el ID del paciente del que desea actualizar su informaci�n: ");
		idSeleccionado = teclado.nextInt();
		System.out.println("Introduce el campo del paciente en el que desea modificar su informaci�n (Sin espacios): ");
		campo = teclado.next();
		System.out.println("Introduce la nueva informaci�n del paciente en ese campo: ");
		nuevaInformacion = teclado.next();
		if(campo.equalsIgnoreCase("telefono")){
			String SQL = "UPDATE pacientes SET telefono='"+nuevaInformacion+"' WHERE Id_Paciente=" +idSeleccionado;
			PreparedStatement PS = conexion.prepareStatement(SQL);
			sentencia = conexion.createStatement();
			int resultado = PS.executeUpdate(SQL);
			actualizacion_correcta = true;
		}
		if(campo.equalsIgnoreCase("direccion")){
			String SQL = "UPDATE pacientes SET direccion='"+nuevaInformacion+"' WHERE Id_Paciente=" +idSeleccionado;
			PreparedStatement PS = conexion.prepareStatement(SQL);
			sentencia = conexion.createStatement();
			int resultado = PS.executeUpdate(SQL);
			actualizacion_correcta = true;
		}
		if(campo.equalsIgnoreCase("edad")){
			String SQL = "UPDATE pacientes SET edad='"+nuevaInformacion+"' WHERE Id_Paciente=" +idSeleccionado;
			PreparedStatement PS = conexion.prepareStatement(SQL);
			sentencia = conexion.createStatement();
			int resultado = PS.executeUpdate(SQL);
			actualizacion_correcta = true;
		}
		if(campo.equalsIgnoreCase("alergias")){
			String SQL = "UPDATE pacientes SET alergias='"+nuevaInformacion+"' WHERE Id_Paciente=" +idSeleccionado;
			PreparedStatement PS = conexion.prepareStatement(SQL);
			sentencia = conexion.createStatement();
			int resultado = PS.executeUpdate(SQL);
			actualizacion_correcta = true;
		}
		if(campo.equalsIgnoreCase("patologia")){
			String SQL = "UPDATE pacientes SET patologia='"+nuevaInformacion+"' WHERE Id_Paciente=" +idSeleccionado;
			PreparedStatement PS = conexion.prepareStatement(SQL);
			sentencia = conexion.createStatement();
			int resultado = PS.executeUpdate(SQL);
			actualizacion_correcta = true;
		}
		if(campo.equalsIgnoreCase("tratamiento")){
			String SQL = "UPDATE pacientes SET tratamiento='"+nuevaInformacion+"' WHERE Id_Paciente=" +idSeleccionado;
			PreparedStatement PS = conexion.prepareStatement(SQL);
			sentencia = conexion.createStatement();
			int resultado = PS.executeUpdate(SQL);
			actualizacion_correcta = true;
		}
		if(campo.equalsIgnoreCase("operaciones")){
			String SQL = "UPDATE pacientes SET operaciones='"+nuevaInformacion+"' WHERE Id_Paciente=" +idSeleccionado;
			PreparedStatement PS = conexion.prepareStatement(SQL);
			sentencia = conexion.createStatement();
			int resultado = PS.executeUpdate(SQL);
			actualizacion_correcta = true;
		}
		if(campo.equalsIgnoreCase("antecedentes_Familiares")){
			String SQL = "UPDATE pacientes SET antecedentes_Familiares='"+nuevaInformacion+"' WHERE Id_Paciente=" +idSeleccionado;
			PreparedStatement PS = conexion.prepareStatement(SQL);
			sentencia = conexion.createStatement();
			int resultado = PS.executeUpdate(SQL);
			actualizacion_correcta = true;
		}
		if(campo.equalsIgnoreCase("medicacion")){
			String SQL = "UPDATE pacientes SET medicacion='"+nuevaInformacion+"' WHERE Id_Paciente=" +idSeleccionado;
			PreparedStatement PS = conexion.prepareStatement(SQL);
			sentencia = conexion.createStatement();
			int resultado = PS.executeUpdate(SQL);
			actualizacion_correcta = true;
		}
		return actualizacion_correcta;
	}
	
	public static void mostrarTraslados() throws Exception{
		resultado = sentencia.executeQuery("SELECT * FROM traslados");
		while(resultado.next()) {
			String centro_destino = resultado.getString(2);
			if(centro_destino != null) {
				String id_Paciente = resultado.getString(1);
				System.out.print("ID del paciente: " + id_Paciente + ", ");
				System.out.print("Centro Destino: " + centro_destino + ", ");
				String fecha_Traslado = resultado.getString(3);
				System.out.print("Fecha del traslado: " + fecha_Traslado + ", ");
				String hora_recogida = resultado.getString(4);
				System.out.print("Hora de la recogida: " + hora_recogida + ", ");
				String hora_llegada = resultado.getString(5);
				System.out.print("Hora de la llegada: " + hora_llegada + ", ");
				String id_ambulancia = resultado.getString(6);
				System.out.print("ID de la ambulancia: " + id_ambulancia + ".");
				System.out.println();
			}
		}
	}
	
	public static boolean registrarTraslado() throws Exception{ 
		boolean registro_correcto = false;
		int idSeleccionado = 0;
		String centroDestino = "";
		String fechaTraslado = "";
		String horaRecogida = "";
		String horaLlegada = "";
		int idAmbulancia = 0;
		
		System.out.println("Introduce el ID del paciente del que se desea registrar el traslado: ");
		idSeleccionado = teclado.nextInt();
		System.out.println("Introduce el centro de destino del traslado (sin espacios): ");
		centroDestino = teclado.next();
		String SQL = "UPDATE traslados SET centro_destino='"+centroDestino+"' WHERE Id_Paciente=" +idSeleccionado;
		PreparedStatement PS = conexion.prepareStatement(SQL);
		sentencia = conexion.createStatement();
		int resultado = PS.executeUpdate(SQL);
		
		System.out.println("Introduce la fecha del traslado (sin espacios): ");
		fechaTraslado = teclado.next();
		SQL = "UPDATE traslados SET fecha_traslado='"+fechaTraslado+"' WHERE Id_Paciente=" +idSeleccionado;
		PS = conexion.prepareStatement(SQL);
		sentencia = conexion.createStatement();
		resultado = PS.executeUpdate(SQL);
		
		System.out.println("Introduce la hora de recogida del paciente (sin espacios): ");
		horaRecogida = teclado.next();
		SQL = "UPDATE traslados SET hora_recogida='"+horaRecogida+"' WHERE Id_Paciente=" +idSeleccionado;
		PS = conexion.prepareStatement(SQL);
		sentencia = conexion.createStatement();
		resultado = PS.executeUpdate(SQL);
		
		System.out.println("Introduce la hora de llegada del paciente (sin espacios): ");
		horaLlegada = teclado.next();
		SQL = "UPDATE traslados SET hora_llegada='"+horaLlegada+"' WHERE Id_Paciente=" +idSeleccionado;
		PS = conexion.prepareStatement(SQL);
		sentencia = conexion.createStatement();
		resultado = PS.executeUpdate(SQL);
		
		System.out.println("Introduce el ID de la ambulancia que trasladar� al paciente: ");
		idAmbulancia = teclado.nextInt();
		SQL = "UPDATE traslados SET id_ambulancia='"+idAmbulancia+"' WHERE Id_Paciente=" +idSeleccionado;
		PS = conexion.prepareStatement(SQL);
		sentencia = conexion.createStatement();
		resultado = PS.executeUpdate(SQL);
		
		registro_correcto = true;
		
		return registro_correcto;
	}
	

}