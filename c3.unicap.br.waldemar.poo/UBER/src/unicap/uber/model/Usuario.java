package unicap.uber.model;

import java.util.LinkedList;
import java.util.List;

public abstract class Usuario{
	
	private String nome;
	private float nota;
	private int telefone;
	protected String mensagem;
	List<Corrida> historico = new LinkedList<Corrida>();

	protected String getNome() {
		return nome;
	}
	protected void setNome(String nome) {
		this.nome = nome;
	}
	protected float getNota() {
		return nota;
	}
	protected void setNota(float nota) {
		this.nota = nota;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	public void adicionaCorrida(Corrida c) {
		historico.add(c);
	}
	public List<Corrida> getCorridas() {
		return historico;
	}
}
