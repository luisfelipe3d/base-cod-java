/*
https://howtodoinjava.com/java/collections/java-linkedlist-class/
https://www.tutorialspoint.com/java_generics/java_generics_type_parameters.htm

E − Element, and is mainly used by Java Collections framework.

K − Key, and is mainly used to represent parameter type of key of a map.

V − Value, and is mainly used to represent parameter type of value of a map.

N − Number, and is mainly used to represent numbers.

T − Type, and is mainly used to represent first generic type parameter.

S − Type, and is mainly used to represent second generic type parameter.

U − Type, and is mainly used to represent third generic type parameter.

V − Type, and is mainly used to represent fourth generic type parameter.
 */
package controle.academico.model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.List;

public class ControleAcademico {
    
    private List<Aluno> listaAlunos = new LinkedList<>();
    private List<Professor> listaProfessor = new LinkedList<>();
    
    /**
     * Adiciona a lista professores e/ou alunos
     * @param <T>
     * @param obj recebe um objeto do tipo Aluno ou Professor.
     * @return True se cadastrou com sucesso, False se não conseguiu cadastrar.
     */
    public <T extends Pessoa> boolean cadastrar(T obj){
        if(obj instanceof Aluno){
            Aluno aux = (Aluno) obj;
            if(buscar(obj.getCpf()) == -1){
                this.listaAlunos.add(aux);
                return true;
            }
            return false;
        }else if(obj instanceof Professor){
            Professor aux = (Professor) obj;
            if(buscar(obj.getCpf()) == -1){
                this.listaProfessor.add(aux);
                return true;
            }
            return true;
        }
        return false;
    }
 
    /**
     *
     * @param cpf
     */
    public void alterarDados(String cpf) {
        if(buscar(cpf) != -1){
            
        }
    }

    public List<Aluno> getAlunos(){
        return this.listaAlunos;
    }
    
    public <T extends Pessoa> boolean remover(String cpf) {
        int removerID = buscar(cpf);
        if(removerID != -1){
            this.listaAlunos.remove(removerID);
            return true;
        }
        return false;
    }

    /**
     * Exibe todos os objetos da lista utilizando o toString()
     */
    public void listarTodos() {
        this.listaAlunos.forEach(Aluno -> System.out.println(Aluno.toString())); 
        //this.listaProfessor.forEach(Professor -> System.out.println(Professor.toString()));
    }
    
    
    private int buscar(String cpf) {
        Aluno auxA = new Aluno(cpf);
        Professor auxP = new Professor(cpf);
        boolean existeA = this.listaAlunos.contains(auxA); 
        boolean existeP = this.listaProfessor.contains(auxP);
        if(existeA){
            for(int i = 0; i < this.listaAlunos.size(); i++){
                if(this.listaAlunos.get(i).equals(auxA)){
                    return i;
                }
            }
            return -1;
        } else if(existeP){
            for(int j = 0; j < this.listaProfessor.size(); j++){
                if(this.listaProfessor.get(j).equals(auxP)){
                    return j;
                }
            }
            return -1;
        }
        return -1;
    }
   
    /**
     * Procura pelo CPF informado dentro da lista
     * @param cpf CPF do Aluno
     * 
     */
    public void buscarAluno(String cpf){
        int alunoId = buscar(cpf);
        if(alunoId != -1){
            this.listaAlunos.get(alunoId).toString();
        }else{
            System.err.println("Aluno não encontrado");
        }
    }
    
    /**
     * Salva a lista de Alunos em um arquivo chamado "alunosData.ser"
     */
    public void salvarLista(){
        try{
            FileOutputStream fos = new FileOutputStream("alunosData.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(this.listaAlunos);
            oos.writeObject(this.listaProfessor);
            oos.close();
            fos.close();
            
        }catch(IOException ioe){
        }
    }

    /**
     * Carrega os objetos do arquivo alunosData.ser
     */
    public void carregarLista(){
        LinkedList<Aluno> auxA;
        //LinkedList<Professor> auxP;
        try{
            FileInputStream fis = new FileInputStream("alunosData.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            auxA = (LinkedList) ois.readObject();
            //auxP = (LinkedList) ois.readObject();
            this.listaAlunos = auxA;
            ois.close();
            fis.close();
        } catch(IOException | ClassNotFoundException ioe){
            return;
        }
        auxA.forEach(Aluno -> System.out.println(Aluno.toString()));   
    }
    
    public void printElements(List<String> list) {
        System.out.println("Size: "+list.size());
        for (Object o : list) {
            System.out.println(o.toString());
        }
        System.out.println("");
    }
}
