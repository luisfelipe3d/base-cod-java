package unicap.uber.exceptions;

public class NumeroExisteException extends Exception{

	private int numero;

	public NumeroExisteException(int numero){
		super("numero já usado");
	}
	
	public int getNumero() {
		return numero;
	}
}
