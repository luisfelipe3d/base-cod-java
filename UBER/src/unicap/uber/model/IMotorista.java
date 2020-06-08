package unicap.uber.model;

public interface IMotorista extends IUsuario{


	public String getModelo();

	public void setModelo(String modelo);

	public void setDisponivel(boolean disponivel);

	public boolean isDisponivel();

	public void indisponibilizar();

	@Override
	public String toString();

	public int getPlaca();

	public int getTelefone();
	
}
