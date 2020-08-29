import java.io.Serializable;

public class Contato implements Serializable{

    /**
     *
     */
    private static final long serialVersionUID = 7233085001417066662L;
    private String nome;
    private String telefone;
    
    public Contato(String nome, String telefone){
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getTelefone(){
        return this.telefone;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    @Override
    public String toString(){
        return "{Nome: "+getNome() + ", Telefone: " + getTelefone() + "}\n";
    }
}