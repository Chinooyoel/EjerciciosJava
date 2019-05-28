
public class Cuenta {
	//Constructores
	public Cuenta(String titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;
	}
	public Cuenta(String titular) {
		this.titular = titular;
		this.saldo = 0;
	}
	//Metodos
	/**
	La cantidad se suma al saldo, si la cantidad
	es negativa el saldo no debe ser afectado
	*/
	public void depositar(Double cantidad){
	    if(cantidad >= 0 ) {
	    	this.saldo += cantidad;
	    }
	}
	/**
	Restamos cantidad al saldo actual, si la cantidada a retirar
	es mayor que el saldo no se debe afectar el saldo
	*/

	public void retirar(Double cantidad){
	    if(cantidad <= this.saldo) {
	    	this.saldo -= cantidad;
	    }
	}
	
	
	
	//Atributos
	private String titular;
	private double saldo;
	
	//¿Que pasa con los setters en este caso?
	//HACE FALTA EN EL TITULAR, EN EL SALDO NO HAY FALTA PORQ AL HACER UNA CUENTA BANCARIA, NO SE DEBE MODIFICAR MANUALMENTE
}
