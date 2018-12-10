/*
Exercicio:
A série de RICCI gerada da seguinte forma: os dois primeiros termos são 
fornecidos pelo usuário, a partir daí, os demais termos são gerados como a soma  
dos dois termos anteriores, ou seja, ai = ai – 1 + ai - 2 para i >= 3. Faça um 
procedimento chamado serieRICCI que imprima os n primeiros termos da série de 
RICCI (n fornecido pelo usuário e deve ser n>=2) e a soma dos termos impressos.  
O procedimento recebe três parâmetros: os dois primeiros termos inteiros e a 
quantidade de termos a serem impressos.
 */
package lista12;
import java.util.Scanner;

public class Exercicio1_lista12 {

    static void linha(){
        for(int i = 1; i<=25 ; i++)
            System.out.print("*");
        System.out.println("");
    }
    
    static void serieRICCI(int num1, int num2, int qtd){
        int ai;
        linha();
        System.out.print("n: "+num1+", "+num2+", ");
        for (int i=2; i <= qtd;i++){
            ai = num1 + num2;
            System.out.print(ai+", ");
            num1=num2;
            num2=ai;
        }
        System.out.println("");
        linha();
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1,num2,qtd;
        char op;
        
        do {
            linha();
            System.out.println("Serie de RICCI");
            System.out.println("OBS: QTD de termos deverá ser maior que 2.");
            System.out.println("Os números informados devem ser igual ou maior a 3");
            System.out.print("Num: ");
            num1 = in.nextInt();
            num2 = in.nextInt();
            if (num1 < 3 && num2 < 3)
                System.out.println("Números deverá ser maior ou igual a 3.");
            System.out.print("Qtd de termos: ");
            qtd = in.nextInt();
            if(qtd < 2)
                System.out.println("O número de termos deve ser maior que 2.");
            serieRICCI(num1,num2,qtd);
            System.out.println("Deseja continuar? (s/n): ");
            op = in.next().charAt(0);
        } while (op != 'n' && op != 'N');
    }
    
}
