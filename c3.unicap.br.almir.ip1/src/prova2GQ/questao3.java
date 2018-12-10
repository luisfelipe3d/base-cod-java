/*
Faça um programa para calcular e exibir o resultado da soma de duas frações 
inteiras  e positivas - simplificadas ao máximo. O mesmo deve conter os 
seguintes subprogramas: 
a) Função para calcular e retornar o MDC de dois números inteiros. 
b) Procedimento para calcular, simplificar e imprimir a fração resultante. 
Exemplo: 
Entrada: 2/5 e 3/6 (No seu programa não deve conter as "/" na entrada) 
Saída: 9/10 
 */
package prova2GQ;
import java.util.Scanner;

public class questao3 {
    
    static int mdc(int x, int y){
        if (x < y)
            return mdc(y,x);
        else if (x == y)
            return x;
        else
            return mdc(x-y,y);
    }
    
    static void calcule(int x, int y, int z, int w){
        int numerador,denominador,divisor;
        numerador = x*w + z * y;    // x/y + z/w = (x*W + z*y) / y*w
        denominador = y*w;
        System.out.printf("%d/%d + %d/%d = %d /%d \n",x,y,z,w,numerador,denominador);
        divisor = mdc(numerador,denominador);
        numerador = numerador/divisor;
        denominador = denominador/divisor;
        System.out.printf("%d/%d",numerador,denominador);
    }
    
    
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int a,b,c,d;
        
        System.out.println("Digite A: ");
        a = in.nextInt();
        System.out.println("Digite B: ");
        b = in.nextInt();
        System.out.println("Digite C: ");
        c = in.nextInt();
        System.out.println("Digite D: ");
        d = in.nextInt();
        
        calcule(a,b,c,d);
    }
}
