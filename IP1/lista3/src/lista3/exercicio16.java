/*
16.
Uma pessoa resolveu fazer uma aplicação em uma poupança programada. 
Calcule e exiba o rendimento que ela obterá, sabendo que deverá
ser fornecido o valor constante da aplicação mensal, a taxa e o 
número de meses. A fórmula usada para este cálculo é:
valor acumulado  =  P * (((1 + i)^n – 1)/i), onde i = taxa;
P = aplicação mensal; n = número de meses. 
Dica:usar a biblioteca math.h.
*/
package lista3;
import java.util.Scanner;

public class exercicio16 {
    public static void main(String[] args) {
        //Definir variávies
        Scanner in = new Scanner (System.in);
        
        double aplicacao_mensal,taxa,rendimento,n_meses,i,p,n,pot;
        
        //Entrada
        System.out.println("Valor para aplicação mensal: ");
        aplicacao_mensal = in.nextDouble();
        System.out.println("Taxa: ");
        taxa = in.nextDouble();
        System.out.println("Número de meses: ");
        n_meses = in.nextInt();
        
        //Processamento
        //rendimento = aplicacao_mensal * (((1+taxa)**n_meses - 1)/taxa);
        i = taxa/100;
        p = aplicacao_mensal;
        n = n_meses;
        pot = Math.pow(1+i, n) - 1;
        rendimento= p * (1+i) * (pot/i);
        //Saida
        System.out.printf("%.2f \n",rendimento);
    }
}
