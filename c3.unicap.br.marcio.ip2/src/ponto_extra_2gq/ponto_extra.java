/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ponto_extra_2gq;
import java.util.Scanner;
/**
 *
 * @author android-123098b21c
 */
public class ponto_extra {
    class Filme{
        private String titulo;
        private String diretor;
        private String categoria;
        private int likes;
        private int dislikes;

        public String getTitulo() {
            return this.titulo;
        }

        public void setTitulo(String titulo){
            this.titulo = titulo;
        }

        public String getDiretor(){
            return this.diretor;
        }

        public void setDiretor(String diretor){
            this.diretor = diretor;
        }

        public String getCategoria(){
            return this.categoria;
        }

        public void setCategoria(String categoria){
            this.categoria = categoria;
        }

        public int getLikes(){
            return this.likes;
        }

        public void setLikes(int likes){
            if (this.likes < 0){
                this.likes = 0;
            }else{
                this.likes = likes;
            }
        }

        public int getDislikes(){
            return this.dislikes;
        }

        public void setDislikes(int dislikes){
            if(this.dislikes < 0){
                this.dislikes = 0;
            }else{
                this.dislikes = dislikes;
            }  
        }
        
        public double getRelevancia(){
            return this.likes/(this.likes + this.dislikes);
        }

        public Filme(String titulo, String diretor, String categoria){

            if(titulo != null && !titulo.trim().equals("")){
                this.titulo = titulo;
            }

            if(diretor != null && !diretor.trim().equals("")){
                this.diretor = diretor;
            }

            if(categoria != null && !categoria.trim().equals("")){
                this.categoria = categoria;
            }
           
        } //fim construtor
                
    }// fim Filme
    
    class CadastroFilmes{
        
        private int qtdFilmes;
        private Filme[] totalFilmes;
        
        public int getqtdFilmes(){
            return this.qtdFilmes;
        }
        
        public void setqtdFilmes(int qtd){
            this.qtdFilmes = qtd;
        }
        
        CadastroFilmes(int qtd){
            this.totalFilmes = new Filme[qtd];
        }
        
        public int busca(Filme f[], double relevancia){
            for(int i = 0; i <f.length; i++){
                if(f[i].getRelevancia() >= relevancia){
                    return i;
                }
            }
            return -1;
        }// fim busca
        
        public void inserirOrdenado(Filme f){
            if(this.qtdFilmes == this.totalFilmes.length){
                System.out.println("Vetor cheio!");
            }else{
                if(this.qtdFilmes == 0){
                    this.totalFilmes[this.qtdFilmes] = f;
                    this.qtdFilmes++;
                }else{
                    int aux = busca(this.totalFilmes, f.getRelevancia());//busca ponto de inserção
                    if(aux != -1){ //encontrou == ou ponto de inserção
                        if(this.totalFilmes[aux].getRelevancia() == f.getRelevancia()){
                            if(f.getDislikes() < this.totalFilmes[aux].getDislikes()){
                                for(int i = this.qtdFilmes; i > aux; i--){
                                    this.totalFilmes[i] = this.totalFilmes[i-1];
                                }
                                this.totalFilmes[aux] = f;
                                this.qtdFilmes++;
                            }else{
                                for(int i = this.qtdFilmes; i > aux+1; i--){
                                    this.totalFilmes[i] = this.totalFilmes[i-1];
                                }
                                this.totalFilmes[aux+1] = f;
                                this.qtdFilmes++;
                            }
                        }else if(this.totalFilmes[aux].getRelevancia() > f.getRelevancia()){
                            for(int i = this.qtdFilmes; i > aux; i--){
                                this.totalFilmes[i] = this.totalFilmes[i-1];
                            }
                            this.totalFilmes[aux] = f;
                            this.qtdFilmes++;
                        }else{
                            for(int i = this.qtdFilmes; i > aux+1; i--){
                                this.totalFilmes[i] = this.totalFilmes[i-1];
                            }
                            this.totalFilmes[aux+1] = f;
                            this.qtdFilmes++;
                        }
                    }else{
                        this.totalFilmes[qtdFilmes] = f;
                        this.qtdFilmes++;
                    }
                }
            }
        } // fim Ordenado
        
        public int consulta(String titulo){
            for(int i = 0; i < this.qtdFilmes; i++){
                if(this.totalFilmes[i].getTitulo().equalsIgnoreCase(titulo)){
                    return i;
                }
            }
            return -1;
        }
        
        public void removerFilme(String titulo){
            int c = consulta(titulo);
            if(c != -1){
               for(int i = c ; i < this.qtdFilmes - 1; i++){
                   this.totalFilmes[i] = this.totalFilmes[i+1];
               }
               this.totalFilmes[this.qtdFilmes] = null;
               this.qtdFilmes--;
            }
        }
        
        
        
    }// fim CadastroFilmes
    
    
    
    public static void main(String[] args) {
        
    }
} //fim ponto_extra

