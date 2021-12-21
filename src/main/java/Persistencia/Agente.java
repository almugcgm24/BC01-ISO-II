package Persistencia;

import java.sql.Connection;
import java.util.ArrayList;

public class Agente {
	private Object _agente;
	private Agente _mInstancia;
	private Connection _mBD;
	private String _url;
	private String _driver;

	public void connect() {
		throw new UnsupportedOperationException();
	}

	public void disconnect() {
		throw new UnsupportedOperationException();
	}

	public ArrayList[] insert(String aSQL) {
		throw new UnsupportedOperationException();
	}

	public int delete(String aSQL) {
		throw new UnsupportedOperationException();
	}

	public ArrayList[] update(String aSQL) {
		throw new UnsupportedOperationException();
	}

	public ArrayList[] select(String aSQL) {
		throw new UnsupportedOperationException();
	}

	public void setAgente(Object aAgente) {
		this._agente = aAgente;
	}

	public Object getAgente() {
		return this._agente;
	}

	public void setMInstancia(Agente aMInstancia) {
		this._mInstancia = aMInstancia;
	}

	public Agente getMInstancia() {
		return this._mInstancia;
	}

	public void setMBD(Connection aMBD) {
		this._mBD = aMBD;
	}

	public Connection getMBD() {
		return this._mBD;
	}

	public void setUrl(String aUrl) {
		this._url = aUrl;
	}

	public String getUrl() {
		return this._url;
	}

	public void setDriver(String aDriver) {
		this._driver = aDriver;
	}

	public String getDriver() {
		return this._driver;
	}
}