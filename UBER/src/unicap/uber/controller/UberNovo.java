package unicap.uber.controller;

import java.util.List;

import unicap.uber.exceptions.NumeroExisteException;
import unicap.uber.exceptions.PlacaExisteException;
import unicap.uber.model.IIRepositorioMotorista;
import unicap.uber.model.IMotorista;
import unicap.uber.model.IPassageiro;
import unicap.uber.model.IRepositorioCorridas;
import unicap.uber.model.IRepositorioPassagueiro;
import unicap.uber.model.RepositorioCorridas;
import unicap.uber.model.RepositorioMotorista;
import unicap.uber.model.RepositorioPassagueiro;

public class UberNovo implements I_Uber{

	static protected UberNovo singleton;
	
	public static I_Uber getInstance() {
		if (singleton == null) {
			singleton = new UberNovo();
		}
		return singleton;
	}
	
	IIRepositorioMotorista rm = new RepositorioMotorista();
	IRepositorioPassagueiro rp = new RepositorioPassagueiro();
	IRepositorioCorridas rc = new RepositorioCorridas();
	
	private UberNovo() {
		
	}
	
	public void adicionaMotorista(String nome, String modelo, int telefone, int placa) throws NumeroExisteException, PlacaExisteException {
		rm.adicionaMotorista(nome, telefone, modelo, placa);
	}
	
	public void adicionaPassageiro(String nome, int telefone, boolean especial) throws NumeroExisteException {
		rp.adicionaPassagueiro(nome, telefone, especial);
	}

	public double solicitarCorrida(int telefone, String origem, String destino) {
		CapsulaMotorista c = new CapsulaMotorista(rm);
		Thread t2 = new Thread(c);
		t2.start();
		IPassageiro passDaCorrida= rp.achaPassageiro(telefone);
		try {
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		IMotorista motDaCorrida = c.getMotorista();
		return rc.criaCorrida(passDaCorrida, motDaCorrida, origem, destino);
	}

	public List<String> listarMotoristas() {
		return rm.listarMotoristas();
	}

	public List<String> listarPassageiros() {
		return rp.listarPassagueiros();
	}

	public List<String> listarCorridas(int telefone) {
		return rc.listarCorridas(telefone);
	}
}
