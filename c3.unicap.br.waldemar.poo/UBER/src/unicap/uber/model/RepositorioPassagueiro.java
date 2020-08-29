package unicap.uber.model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import unicap.uber.exceptions.NumeroExisteException;

public class RepositorioPassagueiro implements IRepositorioPassagueiro{

	private List<IPassageiro> passageiros = new ArrayList<IPassageiro>();

	public void adicionaPassagueiro(String nome, int telefone, boolean especial) throws NumeroExisteException {
		for (IPassageiro p : passageiros) {
			if(p.getTelefone() == telefone) {
				throw new NumeroExisteException(telefone);
			}
		}
		
		
		IPassageiro p; 
		if (especial)
			p = new Passageiro(nome, telefone);
		else
			p = new PassageiroEspecial(nome, telefone);
		passageiros.add(p);
	}

	public IPassageiro achaPassageiro(int telefone) {
		IPassageiro passDaCorrida = null;
		for (IPassageiro umPassageiro : passageiros) {
			if(umPassageiro.getTelefone() == telefone) {
				passDaCorrida = umPassageiro;
				break;
			}
		}
		return passDaCorrida;
	}

	public List<String> listarPassagueiros() {
		List<String> mensagens = new LinkedList<String>();
		for (IUsuario p : passageiros) {
			mensagens.add(p.toString());
		}
		return mensagens;
	}
	
	
}
