/*
Exercicio:
Faça um programa que contenha uma função que recebe dois números inteiros e 
retorne o MDC deles. O programa se encarregará de exibir o resultado ao usuário.
mdc(m,n) = mdc(n%m, m) se m > 0 e n >= 0 
mdc(0,n) = n, se n > 0 (e também mdc(0, m) = m, se m > 0)
Assume-se que n > 0 e m >= 0, não existe MDC se ambos forem ZERO. 
Obs.1: O programa deverá permitir que o usuário faça quantas consultas desejar 
e só deverá terminar sua execução se o usuário solicitar. 
Obs.2: Toda entrada e saída de dados deve ser feita no programa principal (main).
 */
package lista13;
import java.util.Scanner;

public class Exercicio2_lista13 {
    
    static int mdc(int m, int n){
        if (m > 0 && n >=0)
            return mdc(n%m, m);
        else if (m == 0 && n > 0)
            return n;
        else if (n == 0 && m > 0)
            return m;
        return 0;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int m,n,entrada;
        
        do {
            System.out.print("Programa MDC.\n"
                    + "1. Calcular MDC: \n"
                    + "2. Sair. \n"
                    + "3. Opção: ");
            entrada = in.nextInt();
        } while (entrada != 1 && entrada != 2);
        
        switch (entrada){
            case 1:
                System.out.print("Num: ");
                m = in.nextInt();
                System.out.print("Num: ");
                n = in.nextInt();
                System.out.printf("MDC(%d, %d): %d. \n",m,n,mdc(m,n));
                break;
            case 2:
                System.out.println("Fim Programa.");
                break;
            default:
                System.out.println("Opção inválida.");
            
                    
        }
        
    }
}
