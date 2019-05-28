package ar.edu.unlam.pb2.materia;

public class Examen {
	//CONSTRUCTORES
	public Examen(Integer nota) {
		this.nota = nota;
	}
	public Examen() {
		this.nota = 0;
	}
	
	//METODOS
	public void calificar(Integer nota) {
		this.nota = nota;
	}
	public Integer getNota() {
		return this.nota;
	}
	
	//ATRIBUTO
	private Integer nota;
}
