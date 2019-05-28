package ar.edu.unlam.pb2.materia;

public class Materia {

	//CONSTRUCTORES
	public Materia(Integer notaExamen1, Integer notaExamen2) {
		examen1 = new Examen(notaExamen1);
		examen2 = new Examen(notaExamen2);
	}
	public Materia() {
		examen1 = new Examen();
		examen2 = new Examen();
	}
	
	//METODOS
	public void evaluar(Integer numeroExamen, Integer nota) {
		if( numeroExamen == 1 ) {
			examen1.calificar(nota);
		}else if ( numeroExamen == 2 ) {
			examen2.calificar(nota);
		}
	}
	
	public Examen getExamen1() {
		return examen1;
	}
	public void setExamen1(Examen examen1) {
		this.examen1 = examen1;
	}
	public Examen getExamen2() {
		return examen2;
	}
	public void setExamen2(Examen examen2) {
		this.examen2 = examen2;
	}
	
	
	//ATRIBUTOS
	
	private Examen examen1;
	private Examen examen2;
}
