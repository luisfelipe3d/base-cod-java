package pontoExtra;
public class Filme{
    private String titulo;
    private String diretor;
    private String categoria;
    private int likes;
    private int dislikes;

    public Filme(String titulo, String diretor, String categoria) {
        if (titulo != null && !titulo.trim().equals("")) {
            this.titulo = titulo;
        }
        if (diretor != null && !diretor.trim().equals("")) {
            this.diretor = diretor;
        }
        if (categoria != null && !categoria.trim().equals("")) {
            this.categoria = categoria;
        }
        
    }

    public String getTitulo(){
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
        if (this.likes < 0) {
            this.likes = 0;
        } else {
            this.likes = likes;
        }
    }

    public int getDislikes(){
        return this.dislikes;
    }

    public void setDislikes(int dislikes){
        if (this.dislikes < 0) {
            this.dislikes = 0;
        } else {
            this.dislikes = dislikes;
        }
    }

    public double getRelevancia(){
        return this.likes/(this.likes + this.dislikes);
    } 
    
    @Override
    public String toString(){
        return "\nTítulo: " + this.titulo + "\nDiretor: " + this.diretor
                + "\nCategoria: " + this.categoria + "\nLikes: " + this.likes
                + "\nDislikes: " + this.dislikes + "\n";
    }

}
