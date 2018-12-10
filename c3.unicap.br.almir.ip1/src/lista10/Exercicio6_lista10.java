/*
Exercicio:
Faça um procedimento para calcular o valor aproximado de π através da série:
S = 1 - 1/3³+1/5³-1/7³+1/9³-....
sendo PI = ³raiz(32*s)

OBS.1: O número de termos da série deverá ser fornecido pelo usuário no programa  
principal e passado ao procedimento como parâmetro. 
OBS.2: Para calcular o valor de XY, não utilize a função pré-definida da  
biblioteca Math.pow(), implemente sua própria função, que deve receber como
parâmetro dois números: a base X e o expoente Y. 
OBS.3: Implemente uma função para calcular!. Esta função deve receber como 
parâmetro dois números X e Y. 
Utilize em sua implementação a função pré-definida da biblioteca Math.pow().
 */
package lista10;
import java.util.Scanner;

public class Exercicio6_lista10 {
    static double pow (double x, double y){
        double p = 1;
        for (int i = 1; i<=y ; i++){
            p = p * x;
        }
        return p;
    }
    
    static double raiz(double x, double y){
        return Math.pow(x, 1/y);
    }
    
    static double soma (int n){
        double s = 0;
        for (int i=1; i<=n; i = i + 2){
            s = s + pow(-1,i+1) * 1/pow(i,3);
        }
        return s;  
    }
    
    static double pi(int n){
        return raiz(32*soma(n), 3);
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n;
        System.out.print("Qtd de termos: ");
        n = in.nextInt();
        System.out.println("Pi = "+pi(n));
        
    }
}
