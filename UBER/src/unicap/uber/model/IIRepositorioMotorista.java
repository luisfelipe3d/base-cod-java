package unicap.uber.model;

import java.util.List;

import unicap.uber.exceptions.NumeroExisteException;
import unicap.uber.exceptions.PlacaExisteException;

public interface IIRepositorioMotorista {

	public void adicionaMotorista(String nome, int telefone, String modelo, int placa) throws NumeroExisteException, PlacaExisteException;
	
	public IMotorista achaMotorista(int telefone);
	
	public List<String> listarMotoristas();
	
	public IMotorista selecionaMotorista();
}
