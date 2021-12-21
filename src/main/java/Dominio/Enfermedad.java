package Dominio;

public class Enfermedad {
	private String _nom_enfermedad;
	private String _sintomas;
	private int _duracion;
	private String _gravedad;

	public void setNom_enfermedad(String aNom_enfermedad) {
		this._nom_enfermedad = aNom_enfermedad;
	}

	public String getNom_enfermedad() {
		return this._nom_enfermedad;
	}

	public void setSintomas(String aSintomas) {
		this._sintomas = aSintomas;
	}

	public String getSintomas() {
		return this._sintomas;
	}

	public void setDuracion(int aDuracion) {
		this._duracion = aDuracion;
	}

	public int getDuracion() {
		return this._duracion;
	}

	public void setGravedad(String aGravedad) {
		this._gravedad = aGravedad;
	}

	public String getGravedad() {
		return this._gravedad;
	}
}