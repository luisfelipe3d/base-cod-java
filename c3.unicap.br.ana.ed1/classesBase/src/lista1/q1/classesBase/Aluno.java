/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1.q1.classesBase;

public class Aluno implements Comparable <Aluno> {
    private String matricula;
    private String nome;
    private double media;
    private int faltas;
    
    public Aluno(String matricula){
        this.matricula = matricula;
    }
    
    public String getMatricula(){
        return this.matricula;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setMedia(double media){
        this.media = media;
    }
    
    public double getMedia(){
        return this.media;
    }
    
    public void setFaltas(int faltas){
        this.faltas = faltas;
    }
    
    public int getFaltas(){
        return this.faltas;
    }
    
    @Override
    public String toString(){
        return "{Matricula:"+this.matricula+", Nome:"+this.nome+", Media:"
                +this.media+", Faltas:"+this.faltas+"}\n";
    }
    
    @Override
    public int compareTo(Aluno value){
        return this.matricula.compareTo(value.matricula);
    }
}
