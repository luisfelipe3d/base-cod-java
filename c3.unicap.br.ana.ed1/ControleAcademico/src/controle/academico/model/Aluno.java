/*

 */
package controle.academico.model;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author home
 */
public class Aluno extends Pessoa implements Serializable {
    
    public Aluno(String cpf){
        super(cpf);
    }
    
    public Aluno(String cpf, String nome,LocalDate nascimento, 
            String sexo, String telefone, String email, Endereco endereco){  
        super(cpf, nome, nascimento,sexo,telefone,email,endereco);
    }

    @Override
    public String toString() {
        return "Aluno{cpf=" + this.cpf + ",nome=" + this.nome + 
                ",dataNascimento=" + this.dataNascimento
                + ",sexo=" + this.sexo + "\n,telefone=" + this.telefone +
                ",email=" + this.email + ",endereço=" + this.endereco;
    }

}
