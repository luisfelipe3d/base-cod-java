/*
Exercicio :
Joãozinho recebe seu salário e precisa pagar duas contas. Como estas contas 
estão atrasadas, Joãozinho terá de pagar multa de 2% sobre cada conta. Sabendo 
que é fornecido o valor de cada conta e o valor do salário de Joãozinho, calcule
e exiba quanto restará do salário de Joãozinho após o pagamento. 
 */
package lista1;
import java.util.Scanner;

public class Exercicio6_lista1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Definir variaveis
        float valor_conta,salario,valor_pagar,novo_salario;
        //Entradas
        System.out.print("Informe o salário: ");
        salario = in.nextFloat();
        System.out.print("Informe o valor da conta: ");
        valor_conta = in.nextFloat();
        //Processamento
        valor_pagar = valor_conta*1.02f;
        novo_salario = salario - valor_pagar;
        // Saida
        System.out.println("Seu saldo: "+novo_salario);
    }
}
