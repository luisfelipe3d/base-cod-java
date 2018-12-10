/*
Exercicio :
Faça um programa que forneça ao usuário os seguintes serviços: 
a)Verificar se um dado número inteiro é divisível por outro. Ambos os números 
devem ser fornecidos pelo usuário; 
b)Ordenar (ordem crescente) três números fornecidos pelo usuário; 
Obs.1: Os serviços devem ser implementados através de subprogramas 
(procedimentos ou funções) a escolha do programador. 
Obs.2: Toda entrada de dados deve ser feita no programa principal. 
Obs.3: O programa deverá ter um menu principal que permita ao usuário executar 
os subprogramas quantas vezes desejar e só deverá terminar sua execução se o 
usuário solicitar.  
SUGESTÃO: Construa duas versões para o programa acima. Na primeira versão, 
implemente todos os serviços utilizando procedimentos. Na segunda versão, 
implemente os serviços (a),(b) e (c) utilizando funções.Compare as duas versões.
 */
package lista11;
import java.util.Scanner;
public class Exercicio1_lista11 {
    
    static void linha(){
        for(int i=1 ; i<=25; i++)
            System.out.print("*");
        System.out.println("");
    }
    
    static void divisivel(int num1, int num2){
        if (num1%num2 == 0 || num2%num1 == 0)
            System.out.println("É divísivel");
        else
            System.out.println("Não divísivel");
    }
    
    static void ordenar(int num1, int num2, int num3){
        if (num1 > num2 && num1 > num3){
            if(num2 > num3)
                System.out.printf("Ordem crescente: %d, %d, %d \n", num3, num2, num1);
            else
                System.out.printf("Ordem crescente: %d, %d, %d \n", num2, num3, num1);
        }else if (num2 > num3){
            if(num1 > num3)
                System.out.printf("Ordem crescente: %d, %d, %d \n", num3, num1, num2);
            else
                System.out.printf("Ordem crescente: %d, %d, %d \n", num1, num3, num2);
        }else
            if(num2 > num1)
                System.out.printf("Ordem crescente: %d, %d, %d \n", num1, num2, num3);
            else
                System.out.printf("Ordem crescente: %d, %d, %d \n", num2, num1, num3 );
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1,num2,num3;
        char op;
        
        do {
            linha();
            System.out.println("Programa 1.0");
            System.out.println("a) Verifica se o número e disível pelo outro.");
            System.out.println("b) Ordena (ordem crescente) três números fornecido"
                    + " pelo usuário.");
            System.out.println("c) Sair");
            System.out.print("Opção: ");
            op = in.next().charAt(0);
            switch (op){
                case 'a':
                case 'A':
                    System.out.print("Num: ");
                    num1 = in.nextInt();
                    num2 = in.nextInt();
                    divisivel(num1,num2);
                    break;
                case 'b':
                case 'B':
                    System.out.print("Num: ");
                    num1 = in.nextInt();
                    num2 = in.nextInt();
                    num3 = in.nextInt();
                    ordenar(num1,num2,num3);
                    break;
                case 'c':
                case 'C':
                    System.out.println("Fim do Programa.");
                    break;
                    
            }
            linha();
        } while (op != 'c' && op != 'C');
        
    }
    
}
