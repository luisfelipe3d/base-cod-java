package unicap.uber.model;

import java.util.List;

public interface IRepositorioCorridas {

	public double criaCorrida(IPassageiro passDaCorrida, IMotorista motDaCorrida, String origem, String destino);
	
	public List<String> listarCorridas(int telefone);
}
