package unicap.uber.model;

public class Passageiro extends Usuario implements IPassageiro {

	public Passageiro(String nome, int telefone) {
		super();
		setNome(nome);
		setTelefone(telefone);
	}
	
	@Override
	public String toString() {
		return "Passageiro "+getNome();
	}
}
