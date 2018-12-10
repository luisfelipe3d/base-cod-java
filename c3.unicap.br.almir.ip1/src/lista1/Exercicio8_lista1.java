/*
Exercicio :
Antes do racionamento de energia ser decretado, quase ninguém falava em 
quilowatts, mas agora todos incorporam essa palavra em seu vocabulário. 
Sabendo-se que 100 quilowatts de energia custam um sétimo do salário mínimo e 
que são fornecidos o valor do salário mínimo e a quantidade de quilowatts gasta 
por uma determinada residência, calcule e imprima:
• O valor em reais de cada quilowatt.
• O valor em reais a ser pago pelo responsável por essa residência.
• O novo valor a ser pago pelo responsável por essa residência, se o pagamento 
em dia tiver um desconto de 10%. 
 */
package lista1;
import java.util.Scanner;

public class Exercicio8_lista1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Definir variaveis
        float salario_minimo, qtd_quilowat,valor_quilowat,consumo,calc,calc_desc;
        //Entrada
        System.out.println("Digite o valor do salário mínimo: ");
        salario_minimo = in.nextFloat();
        System.out.println("Digite o consumo em quilowatts: ");
        consumo = in.nextFloat();
        //Processamento
        valor_quilowat = salario_minimo/7; // valor do quilowatt com base no salário minimo
        qtd_quilowat = valor_quilowat/100; // Valor em reais de cada quilowatt
        calc = consumo * qtd_quilowat; // Valor a pagar
        calc_desc = calc* 0.90f; // Valor a pagar com desconto de 10%
        //Saida
        System.out.println("O valor em reais de cada quilowatt R$: "+valor_quilowat);
        System.out.println("O valor a ser pago R$: "+calc);
        System.out.println("O valor a ser pago com desconto R$: "+calc_desc);
    }
}
