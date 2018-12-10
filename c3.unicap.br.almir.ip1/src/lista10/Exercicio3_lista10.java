/*
Exercicio:
Faça um programa para calcular fatorial (N!) e potência (XY). Este programa 
deve conter os seguintes subprogramas: 
a)Um procedimento para calcular o fatorial de um número. Este procedimento deve
receber como parâmetro de entrada um número inteiro e deve calcular e exibir o 
fatorial deste número. 
Lembrete:  0!  =  1;  1!  =  1; N! = N x (N-1) x (N-2) x ... x 2 x 1; 
para N > 1, e não existe fatorial de número negativo. 
b)Uma função para calcular X elevado a Y. Esta função deve receber como 
parâmetro dois números (X – real e Y – inteiro maior ou igual a zero) e deve 
calcular e retornar o valor de XY. O programa deve se encarregar de exibir o 
resultado ao usuário.  
OBS.1: Não utilize a função pré-definida Math.pow().  
Lembrete: X0 = 1, X1 = X e XY = X * X * X * ... * X!!              Y vezes 
OBS.2: Toda entrada de dados deve ser feita pelo programa principal.
OBS.3:  O  programa  deverá  ter  um  menu  principal  que  permita  ao  usuário
executar  os  subprogramas  quantas vezes ele desejar e só deverá terminar sua 
execução se o usuário solicitar.  
 */
package lista10;
import java.util.Scanner;
public class Exercicio3_lista10 {
    
    static void linha(){
        for(int i=1;i<=25;i++)
            System.out.print("*");
        System.out.println("");
    }
    
    static void fatorial(int x){
        if (x == 0)
            System.out.println("Fat(0): 1");
        else if (x < 0)
            System.out.println("Não existe fatorial de número negativo.");
        else{
            int f = 1;
            for (int i = 1 ; i <= x; i++){
                f = f * i;
                }
            System.out.print(f);
            System.out.println("");
            }
    }
    
    static double potencia(double base, double expo){
        double pot=1;
        for (int i = 1; i <= expo; i++)
            pot = pot * base;
        return pot;
        
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int op;
        int fat;
        double base,expo;
        do {
            linha();
            System.out.println("Programa 3");
            System.out.println("1. Calcula fatorial (N!)");
            System.out.println("2. Calcula potência (X^Y)");
            System.out.println("3. Sair");
            System.out.print("Opção: ");
            op = in.nextInt();
            linha();
            switch(op){
                case 1:
                    System.out.print("Digite Fat: ");
                    fat = in.nextInt();
                    System.out.printf("Fat(%d): ",fat);
                    fatorial(fat);
                    break;
                case 2:
                    System.out.print("Base: ");
                    base = in.nextDouble();
                    do {
                        System.out.print("Expoente: ");
                        expo = in.nextDouble();
                        if (expo < 0)
                            System.out.println("Expoente não pode ser negativo.");
                    } while (expo < 0);
                    if (expo == 0)
                        System.out.println("Resultado: 1");
                    System.out.println("Resultado: "+potencia(base,expo));
                    break;
                case 3:
                    System.out.println("Fim Programa.");
                    linha();
                    break;
            }
        } while (op != 3);
    }
}

