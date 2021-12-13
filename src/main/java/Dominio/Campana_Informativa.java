package Dominio;

public abstract class Campana_Informativa {
	private double _coste;
	private int _temporalidad;
	private String _efectividad;
	private String _descripcion;

	public void setCoste(double aCoste) {
		this._coste = aCoste;
	}

	public double getCoste() {
		return this._coste;
	}

	public void setTemporalidad(int aTemporalidad) {
		this._temporalidad = aTemporalidad;
	}

	public int getTemporalidad() {
		return this._temporalidad;
	}

	public void setEfectividad(String aEfectividad) {
		this._efectividad = aEfectividad;
	}

	public String getEfectividad() {
		return this._efectividad;
	}

	public void setDescripcion(String aDescripcion) {
		this._descripcion = aDescripcion;
	}

	public String getDescripcion() {
		return this._descripcion;
	}
}