package Dominio;

public class Vacuna {
	private String _nombre;
	private int _num_dosis;
	private String _enfermedad;
	private String _efectividad;
	public Gestion_de_vacunacion _tiene;

	public void setNombre(String aNombre) {
		this._nombre = aNombre;
	}

	public String getNombre() {
		return this._nombre;
	}

	public void setNum_dosis(int aNum_dosis) {
		this._num_dosis = aNum_dosis;
	}

	public int getNum_dosis() {
		return this._num_dosis;
	}

	public void setEnfermedad(String aEnfermedad) {
		this._enfermedad = aEnfermedad;
	}

	public String getEnfermedad() {
		return this._enfermedad;
	}

	public void setEfectividad(String aEfectividad) {
		this._efectividad = aEfectividad;
	}

	public String getEfectividad() {
		return this._efectividad;
	}
}