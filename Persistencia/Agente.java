package Persistencia;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;

public class Agente {
	
	private Agente agente;
	// instancia del agente

	protected static Agente mInstancia = null;

		// Conexion con la base de datos

	protected static Connection mBD;

		// Identificador ODBC de la base de datos

	private static String url = "jdbc:mysql://172.20.48.70:3306/BC01dbservice?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	//"jdbc:mysql://172.20.48.70:3306/XXXdbservice?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

		// Driven para conectar con bases de datos MySQL

	private static String driver = "com.mysql.cj.jdbc.Driver";
		
	
	private Agente() throws Exception {

		connect();

		}

	public static Agente getAgente() throws Exception {

		if (mInstancia == null) {

			mInstancia = new Agente();

		}

		return mInstancia;

		}

	public void connect() throws Exception {

		Class.forName(driver).newInstance();

		mBD = DriverManager.getConnection(url);
	}

	public void disconnect() throws Exception {

		mBD.close();
	}

	public int insert(String SQL) throws SQLException, Exception {

			connect();

			PreparedStatement stmt = mBD.prepareStatement(SQL);

			int res = stmt.executeUpdate();

			stmt.close();

			disconnect();

			return res;
	}

	public int delete(String SQL) throws SQLException, Exception {
		
		connect();

		PreparedStatement stmt = mBD.prepareStatement(SQL);

		int res = stmt.executeUpdate();

		stmt.close();

		disconnect();

		return res;
	}

	public int update(String SQL) throws SQLException, Exception {

		connect();

		PreparedStatement stmt = mBD.prepareStatement(SQL);

		int res = stmt.executeUpdate();

		stmt.close();

		disconnect();

		return res;

	}

	public Vector<Vector<Object>> select(String SQL, int nCols) throws SQLException, Exception {

		Vector<Vector<Object>> devolver = new Vector<Vector<Object>>();

		connect();

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

		disconnect();

		return devolver;

	}

//	public void setAgente(Agente agente) {
//		this.agente = agente;
//	}
//
//	public void setMInstancia(Agente MInstancia) {
//		this.mInstancia = MInstancia;
//	}
//
//	public Agente getMInstancia() {
//		return this.mInstancia;
//	}
//
//	public void setMBD(Connection MBD) {
//		this.mBD = MBD;
//	}
//
//	public Connection getMBD() {
//		return this.mBD;
//	}
//
//	public void setUrl(String aUrl) {
//		this.url = aUrl;
//	}
//
//	public String getUrl() {
//		return this.url;
//	}
//
//	public void setDriver(String Driver) {
//		this.driver = Driver;
//	}
//
//	public String getDriver() {
//		return this.driver;
//	}
	
	
	
}
