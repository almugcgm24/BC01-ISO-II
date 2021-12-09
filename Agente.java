package Persistencia;

import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

public class Agente {

	// instancia del agente

	protected static Agente mInstancia = null;

	// Conexion con la base de datos

	protected static Connection mBD;

	// Identificador ODBC de la base de datos

	private static String url = "jdbc:mysql://172.20.48.70:3306/?user=BC01"

	// Driven para conectar con bases de datos MySQL

	private static String driver = "com.mysql.jdbc.Driver";   // CAMBIAR

	// Constructor

	private Agente() throws Exception {

		conectar();

	}

	public static Agente getAgente() throws Exception {

		if (mInstancia == null) {

			mInstancia = new Agente();

		}

		return mInstancia;

	}

	// Metodo para realizar la conexion a la base de datos

	private void conectar() throws Exception {

		Class.forName(driver).newInstance();

		mBD = DriverManager.getConnection(url);

	}

	// Metodo para desconectar de la base de datos

	public void desconectar() throws Exception {

		mBD.close();

	}

	// Metodo para realizar una insercion en la base de datos

	public int insert(String SQL) throws SQLException, Exception {

		conectar();

		PreparedStatement stmt = mBD.prepareStatement(SQL);

		int res = stmt.executeUpdate();

		stmt.close();

		desconectar();

		return res;

	}

	// Metodo para realizar una eliminacion en la base de datos

	public int delete(String SQL) throws SQLException, Exception {
		
		conectar();

		PreparedStatement stmt = mBD.prepareStatement(SQL);

		int res = stmt.executeUpdate();

		stmt.close();

		desconectar();

		return res;

	}

	// Metodo para realizar una eliminacion en la base de datos

	public int update(String SQL) throws SQLException, Exception {

		conectar();

		PreparedStatement stmt = mBD.prepareStatement(SQL);

		int res = stmt.executeUpdate();

		stmt.close();

		desconectar();

		return res;

	}

	public Vector<Vector<Object>> select(String SQL, int nCols) throws SQLException, Exception {

		Vector<Vector<Object>> devolver = new Vector<Vector<Object>>();

		conectar();

		Statement stmt = mBD.createStatement();

		ResultSet res = stmt.executeQuery(SQL);

		while (res.next()) {
			Vector<Object> vector = new Vector<Object>();

			for (int i = 1; i <= nCols; i++) {
				vector.add(res.getObject(i));
			}

			devolver.add(vector);

		}

		stmt.close();

		desconectar();

		return devolver;

	}

}