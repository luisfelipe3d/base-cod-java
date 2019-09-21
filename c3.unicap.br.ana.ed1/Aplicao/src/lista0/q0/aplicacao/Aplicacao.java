package lista0.q0.aplicacao;
import java.util.Scanner;
import lista0.q0.classesPrincipais.LSE;

public class Aplicacao {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int op, entrada;
        LSE lista = new LSE();
        do{
            System.out.print("Programa - 00: \n"
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
                    System.out.println("Digite o valor a ser inserido: ");
                    entrada = in.nextInt();
                    lista.inserirInicio(entrada);
                    System.out.println("Elemento adicionado no inicio.");
                    break;
                case 2:
                    System.out.println("Digite o valor a ser inserido: ");
                    entrada = in.nextInt();
                    lista.inserirFinal(entrada);
                    System.out.println("Elemento adicionado no final.");
                    break;
                case 3:
                    System.out.println("Removendo o primeiro elemento da lista.");
                    lista.removerInicio();
                    break;
                case 4:
                    System.out.println("Removendo o ultimo elemento da lista.");
                    lista.removerFinal();
                    break;
                case 5:
                    lista.listar();
                    break;
                case 0:
                    System.out.println("Programa finalizado.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }while(op != 0);
    }
}
