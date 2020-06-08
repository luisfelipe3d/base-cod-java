package unicap.uber.model;

import java.util.List;

import unicap.uber.exceptions.NumeroExisteException;

public interface IRepositorioPassagueiro {

	public void adicionaPassagueiro(String nome, int telefone, boolean especial) throws NumeroExisteException;
	
	public IPassageiro achaPassageiro(int telefone);
	
	public List<String> listarPassagueiros();
}
