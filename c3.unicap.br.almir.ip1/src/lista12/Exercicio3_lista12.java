/*
Exercicio :
A série de FETUCCINE é gerada da seguinte forma: os dois primeiros termos são 
fornecidos pelo usuário; a partir daí, os termos seguintes são gerados como a 
soma ou subtração dos dois termos anteriores, ou seja: 
ai = ai -1 + ai -2 ==> para i ímpar 
ai = ai -1 – ai -2 ==> para i par 
Faça um procedimento chamado serieFETUCCINE que imprima os n primeiros termos da 
série de FETUCCINE (infornecido pelo usuário e deve ser n>=2) e a soma dos 
termos impressos. O procedimento recebe três parâmetros: 
os dois primeiros termos inteiros e a quantidade de termos a serem impressos. 
*/
package lista12;
import java.util.Scanner;

public class Exercicio3_lista12 {
    
    static void serieFETUCCINE(int n, int m, int qtd){
        int termo,i;
        System.out.printf("S: %d, %d, ",n,m);
        for (i = 3; i<= qtd; i++){
            if (i % 2 == 0)
                termo= m - n;
            
            else
                termo = m + n;  
            
            n = m;
            m = termo;
            System.out.printf("%d, ",termo);
        }
        System.out.println("");
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int num1,num2,qtd=0;
        
        System.out.println("Série FETUCCINE: ");
        System.out.print("Num1: ");
        num1 = in.nextInt();
        System.out.print("Num2: ");
        num2 = in.nextInt();
        do {
            System.out.print("Qtd de termos: ");
            qtd = in.nextInt();
            if (qtd < 3)
                System.out.println("Qtd de termos tem que ser maior que 3.");
        } while (qtd < 3);
        
        serieFETUCCINE(num1,num2,qtd);
        
        
        
    }
}
