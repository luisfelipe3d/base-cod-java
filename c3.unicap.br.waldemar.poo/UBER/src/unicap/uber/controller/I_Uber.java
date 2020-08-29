package unicap.uber.controller;

import java.util.List;

import unicap.uber.exceptions.NumeroExisteException;
import unicap.uber.exceptions.PlacaExisteException;

public interface I_Uber {

	static I_Uber instance = UberNovo.getInstance();
	
	public void adicionaMotorista(String nome, String modelo, int telefone, int placa) throws NumeroExisteException, PlacaExisteException;
	
	public void adicionaPassageiro(String nome, int telefone, boolean especial) throws NumeroExisteException;
	
	public double solicitarCorrida(int telefone, String origem, String destino);
	
	public List<String> listarMotoristas();
	
	public List<String> listarPassageiros();
	
	public List<String> listarCorridas(int telefone);

	public static I_Uber getInstance() {
		return instance;
	}
}
