package unicap.uber.model;

public class Corrida {

	private IPassageiro p;
	private IMotorista m;
	private String origem;
	private String destino;
	private double valor;
	
	public Corrida(IPassageiro p, IMotorista m, String origem, String destino) {
		this.p = p;
		this.m = m;
		this.origem = origem;
		this.destino = destino;
		valor = Math.random();
	}

	public double getValor() {
		return valor;
	}

	public String imprime() {
		return "corrida de "+origem+ " para "+ destino+ " custou: "+valor;
	}

	public IPassageiro getPassageiro() {
		return p;
	}

	public IMotorista getMotorista() {
		return m;
	}

}
