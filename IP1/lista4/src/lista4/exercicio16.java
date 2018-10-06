/*
16.
Um funcionário recebe 250 dólares por mês. Se este salário,
depois de convertido em reais, for inferior a R$700,00, ele recebe 
ainda uma ajuda de custo de R$80,00. Faça um programa que obtenha
o valor do dólar e calcule e imprima seu salário final. 
 */
package lista4;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class exercicio16 {
    public static void main(String[] args) {
        //Definir variáveis
        Scanner in = new Scanner (System.in);
        double cotacao,salario=250,custo=80,salario_novo;
        
        //Entrada
        System.out.println("Digite o valor do dólar: ");
        cotacao = in.nextDouble();
        
        //Processamento e saida
        salario_novo = salario * cotacao ;
        if (salario_novo < 700 ) 
            System.out.printf("Seu salário final é:%.2f\n",(salario_novo+custo));
         else 
            System.out.printf("%.2f\n",salario_novo);
        
    }
}
