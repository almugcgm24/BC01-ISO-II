package Dominio;

public class Usuario {
	private String _usuario;
	private String _contrasena;
	private String _tipo_usuario;

	public void setUsuario(String aUsuario) {
		this._usuario = aUsuario;
	}

	public String getUsuario() {
		return this._usuario;
	}

	public void setContrasena(String aContrasena) {
		this._contrasena = aContrasena;
	}

	public String getContrasena() {
		return this._contrasena;
	}

	public void setTipo_usuario(String aTipo_usuario) {
		this._tipo_usuario = aTipo_usuario;
	}

	public String getTipo_usuario() {
		return this._tipo_usuario;
	}
}