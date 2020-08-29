package unicap.uber.controller;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import unicap.uber.exceptions.NumeroExisteException;
import unicap.uber.exceptions.PlacaExisteException;
import unicap.uber.model.Corrida;
import unicap.uber.model.Motorista;
import unicap.uber.model.Passageiro;
import unicap.uber.model.Usuario;

public class Uber implements I_Uber{

	private List<Motorista> motoristas = new ArrayList<Motorista>();
	private List<Passageiro> passageiros = new LinkedList<Passageiro>();
	private List<Corrida> corridas = new LinkedList<Corrida>();
	
	public void adicionaMotorista(String nome, String modelo, int telefone, int placa) throws NumeroExisteException, PlacaExisteException {
		for (Motorista m : motoristas) {
			if(m.getTelefone() == telefone) {
				throw new NumeroExisteException(telefone);
			}
			if(m.getPlaca() == placa) {
				throw new PlacaExisteException(telefone);
			}
		}
		Motorista m =new Motorista(nome, telefone, modelo, placa);
		motoristas.add(m);
	}
	
	public void adicionaPassageiro(String nome, int telefone, boolean especial) throws NumeroExisteException {
		
		for (Passageiro p : passageiros) {
			if(p.getTelefone() == telefone) {
				throw new NumeroExisteException(telefone);
			}
		}
		
		Passageiro p =new Passageiro(nome, telefone);
		passageiros.add(p);
	}

	public double solicitarCorrida(int telefone, String origem, String destino) {
		Motorista motDaCorrida = null;
		Passageiro passDaCorrida= achaPassageiro(telefone);
		
		for (Motorista umMotorista : motoristas) {
			if(umMotorista.isDisponivel()) {
				motDaCorrida = umMotorista;
				motDaCorrida.indisponibilizar();
				break;
			}
		}
		Corrida c = new Corrida(passDaCorrida, motDaCorrida, origem, destino);
		corridas.add(c);
		motDaCorrida.adicionaCorrida(c);
		passDaCorrida.adicionaCorrida(c);
		return c.getValor();
	}

	private Passageiro achaPassageiro(int telefone) {
		Passageiro passDaCorrida = null;
		for (Passageiro umPassageiro : passageiros) {
			if(umPassageiro.getTelefone() == telefone) {
				passDaCorrida = umPassageiro;
				break;
			}
		}
		return passDaCorrida;
	}
	
	private Usuario achaMotorista(int telefone) {
		Motorista motoristaEncontrado = null;
		for (Motorista umMotorista : motoristas) {
			if(umMotorista.getTelefone() == telefone) {
				motoristaEncontrado = umMotorista;
				break;
			}
		}
		return motoristaEncontrado;
	}

	public List<String> listarMotoristas() {
		return listarUsuario(motoristas);
	}

	public List<String> listarPassageiros() {
		return listarUsuario(passageiros);
	}

	private List<String> listarUsuario(List<? extends Usuario> usuarios) {
		List<String> mensagens = new LinkedList<String>();
		for (Usuario p : usuarios) {
			mensagens.add(p.toString());
		}
		return mensagens;
	}

	public List<String> listarCorridas(int telefone) {
		Usuario u = achaPassageiro(telefone);
		if (u == null) {
			u = achaMotorista(telefone);
		}
		
		List<String> mensagens = new LinkedList<String>();
		if (u != null) {
			for (Corrida umaCorrida : u.getCorridas()) {
				mensagens.add(umaCorrida.toString());
			}
		}
		
		return mensagens;
	}

}
