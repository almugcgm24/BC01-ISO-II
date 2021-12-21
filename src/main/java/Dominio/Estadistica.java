package Dominio;

public class Estadistica {
	private int _num_enfermedades_estado;
	private int _num_personas_estado;
	private int _num_enfermedades_catalogadas;
	private int _num_campanas;
	private String _evolucion_enfermedades;
	private String _estadistica_vacunacion;
	private int _num_personas_vacunadas;
	private int _num_personas_infectadas;

	public void setNum_enfermedades_estado(int aNum_enfermedades_estado) {
		this._num_enfermedades_estado = aNum_enfermedades_estado;
	}

	public int getNum_enfermedades_estado() {
		return this._num_enfermedades_estado;
	}

	public void setNum_personas_estado(int aNum_personas_estado) {
		this._num_personas_estado = aNum_personas_estado;
	}

	public int getNum_personas_estado() {
		return this._num_personas_estado;
	}

	public void setNum_enfermedades_catalogadas(int aNum_enfermedades_catalogadas) {
		this._num_enfermedades_catalogadas = aNum_enfermedades_catalogadas;
	}

	public int getNum_enfermedades_catalogadas() {
		return this._num_enfermedades_catalogadas;
	}

	public void setNum_campanas(int aNum_campanas) {
		this._num_campanas = aNum_campanas;
	}

	public int getNum_campanas() {
		return this._num_campanas;
	}

	public void setEvolucion_enfermedades(String aEvolucion_enfermedades) {
		this._evolucion_enfermedades = aEvolucion_enfermedades;
	}

	public String getEvolucion_enfermedades() {
		return this._evolucion_enfermedades;
	}

	public void setEstadistica_vacunacion(String aEstadistica_vacunacion) {
		this._estadistica_vacunacion = aEstadistica_vacunacion;
	}

	public String getEstadistica_vacunacion() {
		return this._estadistica_vacunacion;
	}

	public void setNum_personas_vacunadas(int aNum_personas_vacunadas) {
		this._num_personas_vacunadas = aNum_personas_vacunadas;
	}

	public int getNum_personas_vacunadas() {
		return this._num_personas_vacunadas;
	}

	public void setNum_personas_infectadas(int aNum_personas_infectadas) {
		this._num_personas_infectadas = aNum_personas_infectadas;
	}

	public int getNum_personas_infectadas() {
		return this._num_personas_infectadas;
	}
}