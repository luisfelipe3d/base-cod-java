/*
Exercicio:
Um banco concederá um crédito pessoal aos seus clientes de acordo com seu 
saldo médio no último ano. Faça uma função que receba por parâmetro o valor
do saldo médio do cliente no último ano, calcule e retorne o valor do crédito
que será dado a ele. O cálculo deve ser feito de acordo com a tabela abaixo.
Para cada cliente, o programa principal deverá exibir a seguinte frase: “Para
um valor de saldo médio igual a R$_________, será dado um crédito 
de R$_________.” 
Valor do Saldo Médio                    Valor do Crédito
Até R$ 200,00                           10% do saldo médio
Acima de R$ 200,00 até R$ 300,00        20% do saldo médio
Acima de R$ 300,00 até R$ 400,00        25% do saldo médio
Acima de R$ 400,00                      30% do saldo médio
Obs.1: Para o fornecimento do crédito, o saldo médio do cliente não pode ser
negativo. Caso seja, deve ser informado ao cliente que ele não terá direito
ao benefício;
Obs.2: A quantidade de clientes que utilizarão o programa para fazer o cálculo
de seu crédito pessoal não é previamente conhecida. Desta forma, a cada novo
cálculo realizado, deve-se perguntar ao usuário se ele deseja efetuar um novo
cálculo. A esta pergunta o usuário deverá responder S ou N. O programa não
deve aceitar nenhum outro valor. 
*/
package lista16;
import java.util.Scanner;

public class Exercicio1_lista16 {
    
    static double retorno(double saldo_medio){
        if (saldo_medio <= 200)
            return saldo_medio*0.1;
        else if (saldo_medio <= 300)
            return saldo_medio*0.2;
        else if (saldo_medio <= 400)
            return saldo_medio*0.25;
        else
            return saldo_medio*0.3;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        double salario;
        char op=0;        
        do{
            System.out.println("***Crédito Pessoal***");
            System.out.print("Saldo médio anual: ");
            salario = in.nextDouble();
            
            if (salario <= 0)
                System.out.println("Sem direito ao benefício.");
            else{
                System.out.printf("Para um valor de saldo médio igual a "
                        + "R$%.2f , será dado um crédito de R$%.2f.\n"
                        ,salario,retorno(salario));
            }
            
            do{
                System.out.print("Deseja efetuar um novo cálculo? \n"
                        + "S/N: ");
                op = in.next().charAt(0);
                if (op != 'S' && op != 'N' && op != 's' && op != 'n')
                    System.out.println("Valor incorreto.");
                    
            } while (op != 'S' && op != 'N' && op != 's' && op != 'n');
            
        } while (op != 'n' && op != 'N');
        System.out.println("Fim Programa.");
    }
}
