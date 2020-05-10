package GeometriaCorpos;



public class Retangulo extends FormaGeometrica implements Redimensionavel {
    private double altura;
	private double comprimento;
    
	public Retangulo(double alt, double comp){
    	this.nLados = 4;
    	this.altura = alt;
    	this.comprimento = comp;
	}
    
	@Override
	public double getPerimetro(){
    	return (this.altura + this.comprimento) * 2;
	}
    
	@Override
	public double getArea(){
    	return this.altura * this.comprimento;
	}
    
	@Override
	public void redimensionar(double x){
    	this.altura = this.altura * x;
    	this.comprimento = this.comprimento * x;
    	System.out.println("\nRetanguloRedimensionado");
    	System.out.println("Área: "+getArea());
    	System.out.println("Perímetro: "+getPerimetro());
	}

}
