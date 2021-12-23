package Dominio;

public class SMS {
	private Persona_CLM _destinatario;
	private String _contenido;

	public void setDestinatario(Persona_CLM aDestinatario) {
		this._destinatario = aDestinatario;
	}

	public Persona_CLM getDestinatario() {
		return this._destinatario;
	}

	public void setContenido(String aContenido) {
		this._contenido = aContenido;
	}

	public String getContenido() {
		return this._contenido;
	}
}