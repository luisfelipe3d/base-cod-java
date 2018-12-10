/*
Exercicio :
Calcule o salário líquido de um professor e o imprima na tela. Os dados 
fornecidos são: valor da hora aula,número de aulas dados no mês e percentual de
desconto do INSS (Instituto Nacional de Seguro Social). 
 */
package lista1;
import java.util.Scanner;

public class Exercicio3_lista1 {
    public static void main(String[] args) {
        //Chamada da classe Scanner
            Scanner in = new Scanner(System.in);
            //Definir as variaveis
            int qtd_aulas;
            double hora_aula,percentual,calculo_b,descontos;
            // Entrada
            System.out.print("Digite o valor da hora aula: ");
            hora_aula = in.nextDouble();
            System.out.print("Digite o número de aulas dada no mês: ");
            qtd_aulas = in.nextInt();
            System.out.print("Percentual de desconto do INSS: ");
            percentual = in.nextDouble();
            //Processamento
            descontos = percentual/100 * hora_aula * qtd_aulas;
            calculo_b = (hora_aula*qtd_aulas);
            //Saida
            System.out.printf("O salário bruto: R$ %.2f.\n",calculo_b);
            System.out.printf("Descontos: R$: %.2f \n",descontos);
            System.out.printf("Salário bruto: R$ %.2f. \n",(calculo_b-descontos));
            
    }
}
