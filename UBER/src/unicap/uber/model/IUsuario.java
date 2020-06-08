package unicap.uber.model;

import java.util.List;

public interface IUsuario {

	public void setTelefone(int telefone);
	public void adicionaCorrida(Corrida c);
	public List<Corrida> getCorridas();
}
