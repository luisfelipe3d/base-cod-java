package unicap.uber.exceptions;

public class PlacaExisteException extends Exception {

	private int placa;

	public PlacaExisteException(int placa){
		super("Placa já cadastrada");
	}
	
	public int getPlaca() {
		return placa;
	}
}
