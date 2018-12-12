/*
Exercicio :
Dois números inteiros são ditos primos entre si quando não existir um divisor  
maior do que 1(um) que divida ambos. Isto significa que o máximo divisor comum 
dos primos entre si é igual a 1. Por exemplo, 12 e 13 são primos entre si; 
porém, 12 e 14 não o são porque ambos são divísiveis por 2. 
Faça uma função que receba como parâmetro dois números inteiros positivos, ou 
seja, maiores que zero, e decida se os números dados são primos entre si. 
A função deve retornar 1(um), se os números forem primos entre si. Caso 
contrário, ela deve retornar 0 (zero). Faça também o programa principal que 
utilizará a função. Os valores dos dois números devem ser fornecidos pelo 
usuário no programa principal e a exibição do resultado deve ocorrer no programa 
principal. 
*/
package lista16;
import java.util.Scanner;

public class Exercicio6_lista16 {
    
    static boolean primos(int n, int m){
        return mdc(n,m) == 1;       
    }
    
    static int mdc(int x, int y){
        int cont;
        if (x > y)
            cont = y;
        else
            cont = x;
        while (cont > 1 && (x % cont != 0 || y % cont != 0)){
            cont--;
        }
        return cont;  
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int num1,num2;
        
        System.out.print("Num: ");
        num1 = in.nextInt();
        System.out.print("Num: ");
        num2 = in.nextInt();
        
        System.out.printf("MDC(%d,%d): %b\n",num1,num2,primos(num1,num2));
    }
}
