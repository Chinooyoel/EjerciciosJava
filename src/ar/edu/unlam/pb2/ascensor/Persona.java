package ar.edu.unlam.pb2.ascensor;

public class Persona {
	private String apellido;
	private double peso;
	private Integer DNI;
	
	public Persona(String apellido, double peso, Integer DNI) {
		this.apellido = apellido;
		this.peso = peso;
		this.DNI = DNI;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public Integer getDNI() {
		return DNI;
	}

	public void setDNI(Integer dNI) {
		DNI = dNI;
	}
}
