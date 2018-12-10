/*
Dois números inteiros são ditos primos entre si quando não existir um divisor 
maior do que 1(um) que divida ambos. Isto significa que o máximo divisor comum
dos primos entre si é igual a 1. Por exemplo, 12 e 13 são primos entre si; 
porém, 12 e 14 não o são porque ambos são divisíveis por 2. 
a)Faça  uma função que  receba  como  parâmetro  dois  números  inteiros  
positivos, ou seja, maiores que zero, e decida se os números dados são primos 
entre si. A função deve retornar True(verdade), se os números forem primos entre
si. Caso contrário, ela deve retornar False (falso).  
b)Faça também o programa principal que utilizará a função. Os valores dos dois 
números devem  ser fornecidos pelo usuário no programa principal e a exibição do 
resultado deve ocorrer no programa principal. 
*/
package prova2GQ;
import java.util.Scanner;

public class questao4 {
    
    static boolean saoprimos(int x, int y){
        return (mdc(x,y)== 1);
    }
    
    static int mdc(int m, int n){
        if (m < n)
            return mdc(n,m);
        else if (n == m)
            return n;
        else
            return mdc(m-n,n);
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int num1,num2;
        System.out.println("Digite inteiro: ");
        num1 = in.nextInt();
        System.out.println("Digite inteiro: ");
        num2 = in.nextInt();
        if (saoprimos(num1,num2))
            System.out.printf("%d e %d são primos.\n",num1,num2);
        else
            System.out.printf("%d e %d não são primos.\n",num1,num2);
    }
}
