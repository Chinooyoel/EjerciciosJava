import java.time.LocalDate;
public class Persona {

	//Constructores
	public Persona() {
		this.nombre = "";
		this.sexo = DEFECTOHOMBRE;
		this.edad = 0;
		this.peso = 0;
		this.altura = 0;
	}
	public Persona(String nombre, int edad, char sexo) {
		this.nombre = nombre;
		this.sexo = sexo;
		this.edad = edad;
		this.peso = 0;
		this.altura = 0;
	}
	public Persona(String nombre, int edad, char sexo, int DNI, double peso, double altura, int dia, int mes, int anio) {
		this.nombre = nombre;
		this.sexo = sexo;
		this.DNI = DNI;
		this.edad = edad;
		this.fechaDeNacimiento = fechaDeNacimiento.of(anio, mes, dia);
		this.peso = peso;
		this.altura = altura;
	}
	//Metodos
	public int calcularIMC() {
		double resultado;
		resultado = (this.peso/(this.altura*this.altura));
		if(resultado < 20 ) {
			return DEBAJODESUPESO;
		}else if (resultado >= 20 && resultado <= 25) {
			return PESOIDEAL;
		}else {
			return SOBREPESO;
		}
	}
	public boolean esMayorDeEdad() {
		LocalDate fechaActualMenos18Anios = LocalDate.now().minusYears(18);
		
		if (fechaActualMenos18Anios.isAfter(fechaDeNacimiento) || fechaActualMenos18Anios.isEqual(fechaDeNacimiento)) {
			return true;
		}else {
			return false;
		}
	}
	public void comprobarSexo(char sexo) {
		if (sexo == 'm' || sexo == 'M'){
			this.sexo = 'M';
		}else {
			this.sexo = 'H';
		}
	}
	public String toString() {
		return this.nombre + " tiene " + this.edad + " anios, es " + 
				this.sexo + " su DNI es "+ this.DNI + ", pesa " + this.peso + "kgs y mide " + this.altura + "y nacio el " +  this.fechaDeNacimiento.getDayOfMonth() + "/" + this.fechaDeNacimiento.getMonthValue() +"/"+ this.fechaDeNacimiento.getYear();
	}
	public int generaDNI() {
		return (int)(Math.random() * 100000000 ) + 1;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public void setFechaDeNacimiento(LocalDate fecha) {
		this.fechaDeNacimiento = fecha;
	}
	
	//Constante
	private final char DEFECTOHOMBRE = 'H';
	private final int PESOIDEAL = -1;
	private final int SOBREPESO = 1;
	private final int DEBAJODESUPESO = 0;
	
	//Atributos
	private String nombre;
	private int edad;
	private int DNI;
	private LocalDate fechaDeNacimiento;
	private char sexo;
	private double peso;
	private double altura;
	
	
}
