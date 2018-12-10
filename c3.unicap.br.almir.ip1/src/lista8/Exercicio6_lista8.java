/*
Exercicio :
A sequência abaixo é conhecida como série de fibonacci. Faça um programa
em JAVA para escrever esta série até o seu trigésimo termo. Série de fibonacci:
1,1,2,3,5,8,13,21,34,55,..
*/
package lista8;

public class Exercicio6_lista8 {
    public static void main(String[] args) {
        long fib1=1,fib2=1,fib_n=0,cont=3;
        
        System.out.print("Fib = "+fib1+" , "+fib2);
        do {
            fib_n = fib1+fib2;
            
            System.out.print(", "+fib_n);
            fib1 = fib2;
            fib2 = fib_n;
            cont++;
            
        } while (cont<=30);
        System.out.println("");
    }
}
