package ar.edu.unlam.pb2.fecha;

public class Fecha {
	//METODOS
	//Setters
	public void setDia(Integer dia) {
		this.dd = dia;
	}
	public void setMes(Integer mes) {
		this.mm = mes;
	}
	public void setAnio(Integer anio) {
		this.aaaa = anio;
	}
	//Getters
	public Integer getDia() {
		return dd;
	}
	public Integer getMes() {
		return mm;
	}
	public Integer getAnio() {
		return aaaa;
	}
	
	//CONSTRUCTORES
	public Fecha(Integer dia, Integer mes, Integer anio) {
		this.dd = dia;
		this.mm = mes;
		this.aaaa = anio;
	}
	public Fecha() {
		this.dd = 0;
		this.mm = 0;
		this.aaaa = 0;
	}
	
	
	//COMPARA OBJETOSS
	//2 OBJETOS SON IGUALES SOLO SI SON IGUALES POR EQUALS Y POR HASHCODE
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((aaaa == null) ? 0 : aaaa.hashCode());
		result = prime * result + ((dd == null) ? 0 : dd.hashCode());
		result = prime * result + ((mm == null) ? 0 : mm.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fecha other = (Fecha) obj;
		if (aaaa == null) {
			if (other.aaaa != null)
				return false;
		} else if (!aaaa.equals(other.aaaa))
			return false;
		if (dd == null) {
			if (other.dd != null)
				return false;
		} else if (!dd.equals(other.dd))
			return false;
		if (mm == null) {
			if (other.mm != null)
				return false;
		} else if (!mm.equals(other.mm))
			return false;
		return true;
	}



	//ATRIBUTO
	private Integer dd;
	private Integer mm;
	private Integer  aaaa;
}
