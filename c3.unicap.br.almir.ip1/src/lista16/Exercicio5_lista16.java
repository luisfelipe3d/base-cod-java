/*
Exercicio:

A função de Ackerman é definida recursivamente nos números não negativos como 
segue:

ack(m,n) = n + 1            se m = 0
ack(m,n) = ack(m-1,1)       se m!=0 e n = 0
ack(m,n) = ack(m-1, ack(m,n-1))     se m!= 0 e n != 0
Faça uma função recursiva para computar a função de Ackerman. Faça também o 
programa principal que utilizará a função. Os valores dos dois números m e n 
devem ser fornecidos pelo usuário no programa principal e o resultado obtido 
deve ser exibido pelo programa principal. 
*/
package lista16;
import java.util.Scanner;

public class Exercicio5_lista16 {
    
    static int serieAck(int m, int n){
        if (m == 0)
            return n+1;
        else if (m != 0 && n == 0)
            return serieAck(m-1,1);
        else
            return serieAck(m-1, serieAck(m,n-1));
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int num1, num2;
        
        System.out.print("Num: ");
        num1 = in.nextInt();
        System.out.print("Num: ");
        num2 = in.nextInt();
        
        System.out.printf("Série de Ackerman(%d/%d): %d \n",num1,num2,
                serieAck(num1,num2));
        
    }
}
