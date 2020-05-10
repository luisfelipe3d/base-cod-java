package lista4.q1.aplicacao;
import java.util.Scanner;
import lista4.q1.classesBase.Aluno;
import lista4.q1.classesPrincipais.LDE;
public class Aplicacao{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in); 
        LDE turma = new LDE();
        String nome;
        double media;
        int faltas;
        int op;
        
        do{
            System.out.println("Escolha a opção desejada: \n"
                    + "1- Cadastrar aluno \n"
                    + "2- Listas todos os alunos \n"
                    + "3- Exibir dados \n"
                    + "4- Alterar média final \n"
                    + "5- Alterar faltas \n"
                    + "6- Remover aluno \n"
                    + "0- Sair");
            op = in.nextInt(); in.nextLine();
            
            switch (op){
                case 1: 
                    System.out.println("Informe o nome: ");
                    nome = in.nextLine();
                    System.out.println("Informe a média final: ");
                    media = in.nextDouble(); in.nextLine();
                    System.out.println("Informe a quantidade de faltas: ");
                    faltas = in.nextInt(); in.nextLine();
                    Aluno a = new Aluno(nome);
                    a.setMedia(media);
                    a.setFaltas(faltas);
                    turma.cadastrar(a);
                    break;
                case 2:
                    turma.listar();
                    break;
                case 3:
                    System.out.println("Informe o nome do aluno para exibição: ");
                    nome = in.nextLine();
                    turma.exibir(nome);
                    break;
                case 4:
                    System.out.println("Informe o nome do aluno para alteração: ");
                    nome = in.nextLine();
                    turma.alterarMedia(nome);
                    break;
                case 5:
                    System.out.println("Informe o nome do aluno para alteração: ");
                    nome = in.nextLine();
                    turma.alterarFaltas(nome);
                    break;
                case 6:
                    System.out.println("Informe o nome do aluno que deseja remover: ");
                    nome = in.nextLine();
                    turma.remover(nome);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }while(op != 0);
        
        
    }
    
}
