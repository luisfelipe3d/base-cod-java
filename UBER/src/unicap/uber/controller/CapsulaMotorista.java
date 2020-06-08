package unicap.uber.controller;

import unicap.uber.model.IIRepositorioMotorista;
import unicap.uber.model.IMotorista;

public class CapsulaMotorista implements Runnable{

	
	public IIRepositorioMotorista rm;
	private IMotorista motDaCorrida;
	
	public CapsulaMotorista(IIRepositorioMotorista rm) {
		this.rm = rm;
	}
	
	public void run() {
		motDaCorrida = rm.selecionaMotorista();
	}
	
	public IMotorista getMotorista() {
		return motDaCorrida;
	}
}
