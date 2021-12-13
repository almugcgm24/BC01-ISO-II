package Dominio;

public class Medicamento {
	private String _nombre;
	private String _tipo;
	private int _dosis;
	private String _fecha_inicio;
	private String _fecha_fin;
	private int _frecuencia;

	public void setNombre(String aNombre) {
		this._nombre = aNombre;
	}

	public String getNombre() {
		return this._nombre;
	}

	public void setTipo(String aTipo) {
		this._tipo = aTipo;
	}

	public String getTipo() {
		return this._tipo;
	}

	public void setDosis(int aDosis) {
		this._dosis = aDosis;
	}

	public int getDosis() {
		return this._dosis;
	}

	public void setFecha_inicio(String aFecha_inicio) {
		this._fecha_inicio = aFecha_inicio;
	}

	public String getFecha_inicio() {
		return this._fecha_inicio;
	}

	public void setFecha_fin(String aFecha_fin) {
		this._fecha_fin = aFecha_fin;
	}

	public String getFecha_fin() {
		return this._fecha_fin;
	}

	public void setFrecuencia(int aFrecuencia) {
		this._frecuencia = aFrecuencia;
	}

	public int getFrecuencia() {
		return this._frecuencia;
	}
}