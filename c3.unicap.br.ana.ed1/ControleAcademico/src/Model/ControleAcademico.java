/*
https://howtodoinjava.com/java/collections/java-linkedlist-class/
 */
package Model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.List;

public class ControleAcademico {
    
    private final List<Aluno> listaAlunos = new LinkedList<>();
    private final List<Professor> listaProfessor = new LinkedList<>();
    
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
            //NÃO ATIVO
            Professor aux = (Professor) obj;
            this.listaProfessor.add(aux);
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
        Aluno aux = new Aluno(cpf);
        //Professor aux1 = new Professor(cpf);
        boolean existe = this.listaAlunos.contains(aux); 
        if(existe){
            for(int i = 0; i < this.listaAlunos.size(); i++){
                if(this.listaAlunos.get(i).equals(aux)){
                    return i;
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
            //oos.writeObject(this.listaProfessor);
            oos.close();
            fos.close();
            
        }catch(IOException ioe){
        }
    }

    /**
     * Carrega os objetos do arquivo alunosData.ser
     */
    public void carregarLista(){
        LinkedList<Aluno> aux;
        try{
            FileInputStream fis = new FileInputStream("alunosData.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            aux = (LinkedList) ois.readObject();
            
            ois.close();
            fis.close();
        } catch(IOException | ClassNotFoundException ioe){
            return;
        }
        aux.forEach(Aluno -> System.out.println(Aluno.toString()));   
    }
}
