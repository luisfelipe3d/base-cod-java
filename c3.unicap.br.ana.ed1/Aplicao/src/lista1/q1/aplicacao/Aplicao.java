package lista1.q1.aplicacao;

import java.util.Scanner;
import lista1.q1.classesPrincipais.LSE;
import lista1.q1.classesBase.Aluno;
public class Aplicao {
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int op;
        String matricula;
        LSE listaAlunos = new LSE();
        do{
            System.out.print("Programa - 01: \n"
                    + "1. Inserir no inicio\n"
                    + "2. Inserir no final\n"
                    + "3. Remover no inicio\n"
                    + "4. Remover no final\n"
                    + "5. Listar\n"
                    + "0. Sair\n"
                    + "Opção: ");
            op = in.nextInt();
            switch(op){
                case 1:
                    System.out.print("Matricula: ");
                    matricula = in.next();
                    listaAlunos.inserirInicio(cadastrarAluno(matricula));
                    System.out.println("Aluno cadastrado.(Inicio)");
                    break;
                case 2:
                    System.out.println("Matricula: ");
                    matricula = in.next();
                    listaAlunos.inserirFinal(cadastrarAluno(matricula));
                    System.out.println("Elemento adicionado no final.");
                    break;
                case 3:
                    System.out.println("Removendo o primeiro elemento da lista.");
                    listaAlunos.removerInicio();
                    break;
                case 4:
                    System.out.println("Removendo o ultimo elemento da lista.");
                    listaAlunos.removerFinal();
                    break;
                case 5:
                    listaAlunos.exibirTodos();
                    break;
                case 0:
                    System.out.println("Programa finalizado.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }while(op != 0);
    }
    
    public static Aluno cadastrarAluno(String matricula){
        Scanner in = new Scanner(System.in);
        Aluno aux = new Aluno(matricula);
        
        System.out.print("Nome: ");
        String nome = in.nextLine();
        aux.setNome(nome);
        
        System.out.print("Media: ");
        double media = in.nextDouble();
        aux.setMedia(media);
        
        System.out.print("Faltas: ");
        int faltas = in.nextInt();
        aux.setFaltas(faltas);
        
        return aux;
    }
 }
    

