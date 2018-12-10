/*
Exercicio :
Pedro comprou um saco de ração com peso em quilogramas. Pedro possui dois gatos
para os quais ele fornece a quantidade de ração em gramas. Sabendo que são 
fornecidos o peso do saco de ração (Kg) e a quantidade de ração fornecida a cada
gato (g), calcule e mostre quanto restará de ração no saco após cinco dias. 
 */
package lista1;
import java.util.Scanner;

public class Exercicio7_lista1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //definir variaveis
        int peso_saco,qtd_racao,calc_racao,qtd_racao2,calc_5dia;
        //Entradas
        System.out.print("Qual o peso do saco KG: ");
        peso_saco = in.nextInt();
        System.out.print("Quantidade de ração para o gato em gramas: ");
        qtd_racao = in.nextInt();
        System.out.print("Quantidade de ração para o segundo gato em gramas: ");
        qtd_racao2 = in.nextInt();
        //Processamento
        calc_racao = (qtd_racao+qtd_racao2)*5;
        calc_5dia = (peso_saco*1000)-calc_racao;
        //Saida
        System.out.println("Aṕos cinco dias resta: "+calc_5dia);
    }
}
