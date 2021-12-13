package Dominio;

import java.util.Vector;
import Dominio.Vacuna;

public class Gestion_de_vacunacion {
	private Vacuna[] _vacunas;
	private String _fechas_dosis;
	private int _cantidad;
	/**
	 * Fechas de vacunación según la vulnerabilidad de las personas.
	 */
	private String _pautas_vulnerabilidad;
	public Vector<Vacuna> _tiene = new Vector<Vacuna>();

	public void setVacunas(Vacuna[] aVacunas) {
		this._vacunas = aVacunas;
	}

	public Vacuna[] getVacunas() {
		return this._vacunas;
	}

	public void setFechas_dosis(String aFechas_dosis) {
		this._fechas_dosis = aFechas_dosis;
	}

	public String getFechas_dosis() {
		return this._fechas_dosis;
	}

	public void setCantidad(int aCantidad) {
		this._cantidad = aCantidad;
	}

	public int getCantidad() {
		return this._cantidad;
	}

	public void setPautas_vulnerabilidad(String aPautas_vulnerabilidad) {
		this._pautas_vulnerabilidad = aPautas_vulnerabilidad;
	}

	public String getPautas_vulnerabilidad() {
		return this._pautas_vulnerabilidad;
	}
}