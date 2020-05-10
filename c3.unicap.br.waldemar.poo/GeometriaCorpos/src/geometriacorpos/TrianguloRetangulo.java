

public class TrianguloRetangulo extends FormaGeometrica implements Redimensionavel {
    
    private double base;
    private double altura;

    public TrianguloRetangulo(double base, double altura){
        this.nLados = 3;
        this.altura = altura;
        this.base = base;
    }

    @Override
	public double getArea(){
    	return (this.altura * this.base)/2;
	}
    
	@Override
	public double getPerimetro(){
    	double hipotenusa = Math.sqrt(this.base * this.base +
            	this.altura * this.altura);
    	return hipotenusa + this.base + this.altura;
	}
    
	@Override
	public void redimensionar(double x){
    	this.base = this.base * x;
    	this.altura = this.altura * x;
    	System.out.println("\nTrianguloRedimensionado:");
    	System.out.println("Base: "+this.base);
    	System.out.println("Altura: "+this.altura);
	}

}
