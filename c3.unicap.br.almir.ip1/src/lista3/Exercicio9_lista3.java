/*
Exercicio: 
Converter um valor em real (R$) para dólar (US$) onde deverá ser obtido
o valor da cotação do dólar e também a quantidade de reais a serem 
convertidos. Exiba o valor em real (R$) e em dólar (US$). 
 */
package lista3;
import java.util.Scanner;

public class Exercicio9_lista3 {
    public static void main(String[] args) {
        //Definir variáveis
        Scanner in = new Scanner (System.in);
        double qtd_real,dolar,aux,cotacao;
        
        //Entrada
        System.out.println("Cotação US$: ");
        cotacao = in.nextDouble();
        System.out.println("Digite a qtd de R$ a ser convertido: ");
        qtd_real = in.nextDouble();
        
        //Processamento
        aux = qtd_real / cotacao;
        
        //Saida
        System.out.println("O valor em R$: "+qtd_real);
        System.out.printf("O valor em US$: %.2f \n",aux);
    }
}
