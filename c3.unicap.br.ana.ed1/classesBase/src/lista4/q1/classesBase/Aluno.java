package lista4.q1.classesBase;

public class Aluno {
    private String nome;
    private double media;
    private int faltas;
    
    public Aluno(String value){
        this.nome = value;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setMedia(double m){
        this.media = m;
    }
    
    public double getMedia(){
        return this.media;
    }
    
    public void setFaltas(int qtd){
        this.faltas = qtd;
    }
    
    @Override
    public String toString(){
        return "{Aluno: "+this.nome+", Média: "+this.media+", Faltas: "
                +this.faltas+"}\n";
    }
}
