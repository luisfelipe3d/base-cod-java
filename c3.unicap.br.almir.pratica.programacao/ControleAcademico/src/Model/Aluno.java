/*

 */
package Model;

import java.io.Serializable;

/**
 *
 * @author home
 */
public class Aluno extends Pessoa implements Serializable {
    
    private String turma;
    
    public Aluno(String cpf){
        super(cpf);
    }
    
    public Aluno(String cpf, String nome, String turma,String nascimento, 
            boolean eHomem, String telefone, String email, Endereco endereco){
        
        super(cpf, nome, nascimento,eHomem,telefone,email,endereco);
        this.turma = turma;
    }

    @Override
    public String toString() {
        return "Aluno{cpf=" + this.cpf + ",nome=" + this.nome +
                ",turma=" + this.turma + ",dataNascimento=" + this.dataNascimento
                + ",eHomem=" + this.eHomem + "\n,telefone=" + this.telefone +
                ",email=" + this.email + ",endereço=" + this.endereco;
    }

}
