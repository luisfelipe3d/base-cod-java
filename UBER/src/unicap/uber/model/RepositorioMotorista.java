package unicap.uber.model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import unicap.uber.exceptions.NumeroExisteException;
import unicap.uber.exceptions.PlacaExisteException;

public class RepositorioMotorista implements IIRepositorioMotorista{

	private List<IMotorista> motoristas = new ArrayList<IMotorista>();

	public void adicionaMotorista(String nome, int telefone, String modelo, int placa) throws NumeroExisteException, PlacaExisteException {
		for (IMotorista m : motoristas) {
			if(m.getTelefone() == telefone) {
				throw new NumeroExisteException(telefone);
			}
			if(m.getPlaca() == placa) {
				throw new PlacaExisteException(telefone);
			}
		}
		IMotorista m =new Motorista(nome, telefone, modelo, placa);
		motoristas.add(m);
	}
	
	public IMotorista achaMotorista(int telefone) {
		IMotorista motoristaEncontrado = null;
		for (IMotorista umMotorista : motoristas) {
			if(umMotorista.getTelefone() == telefone) {
				motoristaEncontrado = umMotorista;
				break;
			}
		}
		return motoristaEncontrado;
	}

	public List<String> listarMotoristas() {
		List<String> mensagens = new LinkedList<String>();
		for (IUsuario p : motoristas) {
			mensagens.add(p.toString());
		}
		return mensagens;
	}

	public IMotorista selecionaMotorista() {
		for (IMotorista umMotorista : motoristas) {
			if(umMotorista.isDisponivel()) {
				umMotorista.indisponibilizar();
				return umMotorista;
				
			}
		}
		return null;
	}
	
	
}
