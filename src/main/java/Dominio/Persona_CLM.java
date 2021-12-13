package Dominio;

public class Persona_CLM {
	private String _nombre;
	private String _apellidos;
	private String _telefono;
	private String _domicilio;
	private int _edad;
	private String _dni;
	private String _estado_de_salud;
	private String _nivel_vulnerabilidad;

	public void setNombre(String aNombre) {
		this._nombre = aNombre;
	}

	public String getNombre() {
		return this._nombre;
	}

	public void setApellidos(String aApellidos) {
		this._apellidos = aApellidos;
	}

	public String getApellidos() {
		return this._apellidos;
	}

	public void setTelefono(String aTelefono) {
		this._telefono = aTelefono;
	}

	public String getTelefono() {
		return this._telefono;
	}

	public void setDomicilio(String aDomicilio) {
		this._domicilio = aDomicilio;
	}

	public String getDomicilio() {
		return this._domicilio;
	}

	public void setEdad(int aEdad) {
		this._edad = aEdad;
	}

	public int getEdad() {
		return this._edad;
	}

	public void setDni(String aDni) {
		this._dni = aDni;
	}

	public String getDni() {
		return this._dni;
	}

	public void setEstado_de_salud(String aEstado_de_salud) {
		this._estado_de_salud = aEstado_de_salud;
	}

	public String getEstado_de_salud() {
		return this._estado_de_salud;
	}

	public void setNivel_vulnerabilidad(String aNivel_vulnerabilidad) {
		this._nivel_vulnerabilidad = aNivel_vulnerabilidad;
	}

	public String getNivel_vulnerabilidad() {
		return this._nivel_vulnerabilidad;
	}
}