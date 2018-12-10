/*
Exercicio :
Uma agência bancária possui vários tipos de investimentos com rendimentos
mensais, conforme a tabela abaixo: 
Valor minímo        Descrição                   Rentabilidade Mensal
R$ 100,00           Poupança                            0,5%
R$ 1000,00          Fundos de R.Fixa                    1%
R$ 2500,00          CDBs                                1,5%

Faça um programa em JAVA que leia o valor que o cliente deseja investir e
calcule e exiba os tipos de aplicação que ele pode fazer e qual será sua 
rentabilidade (lucro) em cada uma delas (se for mais de uma). O programa 
termina quando for digitado um valor de investimento nulo ou negativo. 
 */
package lista7;
import java.util.Scanner;

public class Exercicio11_lista7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double valor;

        System.out.println("Informe o valor que deseja investir: ");
        valor = in.nextDouble();
        while(valor >= 0){
        if (valor <= 0)
            System.out.println("Fim do programa.");
        else if (valor < 100)
            System.out.println("Valor insuficiente para investimento.");
        else if (valor < 1000)
            System.out.println("Você pode investir na poupança. Sua "
                    + "rentabilidade mensal será de 0,5%.");
        else if (valor < 2500)
            System.out.println("Você pode investir na poupança e/ou em fundos "
                    + "de renda fixa. Sua rentabilidade mensal será de, "
                    + "respectivamente 0,5% e 1%.");
        else
            System.out.println("Você pode investir na poupança, fundos de renda"
                    + "fixa e/ou CDBs. Sua rentabilidade mensal será de, "
                    + "respectivamente 0,5%, 1% e 1,5%.");
                System.out.println("Informe o valor que deseja investir: ");
        valor = in.nextDouble();
        }
    }
}
