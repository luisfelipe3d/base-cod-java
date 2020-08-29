package unicap.uber.model;

public class Motorista extends Usuario implements IMotorista {

	protected String modelo;
	protected int placa;
	protected boolean disponivel;
	
	public Motorista(String nome, int telefone, String modelo, int placa) {
		super();
		setNome(nome);
		setTelefone(telefone);
		this.modelo = modelo;
		this.placa = placa;
		this.disponivel = true;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}

	public boolean isDisponivel() {
		return disponivel;
	}

	public void indisponibilizar() {
		disponivel = false;
	}

	@Override
	public String toString() {
		return "Motorista "+getNome();
	}

	public int getPlaca() {
		return placa;
	}
}
