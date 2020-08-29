package unicap.uber.model;

public class PassageiroEspecial extends Usuario implements IPassageiro {


	protected float pontos;
	
	public PassageiroEspecial(String nome, int telefone) {
		super();
		setNome(nome);
		setTelefone(telefone);
		pontos = 0;
	}
	
	@Override
	public String toString() {
		return "Passageiro "+getNome();
	}
}
