package unicap.uber.model;

import java.util.LinkedList;
import java.util.List;

public class RepositorioCorridas implements IRepositorioCorridas{

	private List<Corrida> corridas = new LinkedList<Corrida>();

	public double criaCorrida(IPassageiro passDaCorrida, IMotorista motDaCorrida, String origem, String destino) {
		Corrida c = new Corrida(passDaCorrida, motDaCorrida, origem, destino);
		corridas.add(c);
		motDaCorrida.adicionaCorrida(c);
		passDaCorrida.adicionaCorrida(c);
		return c.getValor();
	}

	public List<String> listarCorridas(int telefone) {
		List<String> mensagens = new LinkedList<String>();
		for (Corrida corrida : corridas) {
			if (corrida.getPassageiro().getTelefone() == telefone) {
				mensagens.add(corrida.toString());
			}
			if (corrida.getMotorista().getTelefone() == telefone) {
				mensagens.add(corrida.toString());
			}
		}
		return mensagens;
	}
	
}
