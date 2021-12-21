package Dominio;

public class Confinamiento {
	private boolean _enfermo;
	private String _fecha_inicio;
	private String _fecha_fin;

	public void setEnfermo(boolean aEnfermo) {
		this._enfermo = aEnfermo;
	}

	public boolean isEnfermo() {
		return this._enfermo;
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
}