/*
Uma determinada empresa deseja dar um aumento de salário seus funcionário. O 
ajuste salarial deve obedecer à seguinte tabela: 
Salário Atual                           Ação
até R$ 900,00                           Aumento de 20%
Acima de R$ 900,00 até  R$ 1.300,00     Aumento de 15%
Acima de R$ 1300,00 até R$ 1800,00      Aumento de 10%
Acima de R$ 1800,00                     Aumento de 5%

Faça um programa em JAVA para ler o salário atual dos funcionários e calcular
seu aumento e seu novo salário. O programa deverá exibir, para cada funcionário,
a seguinte frase:“O funcionário terá aumento de  R$__________ e passará a 
receber  R$____________.”A cada cálculo de novo salário efetuado, o programa
deverá perguntar ao usuário se ele deseja continuar executando o programa. 
 */
package lista7;
import java.util.Scanner;
public class Exercicio12_lista7 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        double salario, reajuste;
        
        System.out.println("Informe seu salário: ");
        salario = in.nextDouble();
        while(salario >= 0){
            if(salario <= 900)
                reajuste = 0.2*salario;
            else if(salario <= 1300)
                reajuste = 0.15*salario;
            else if(salario <= 1800)
                reajuste = 0.1*salario;
            else
                reajuste = 0.05*salario;
            System.out.println("O funcionário terá aumento de "+reajuste+" e "
                    + "passará a receber "+(salario+reajuste));
            System.out.println("Informe seu salário: ");
            salario = in.nextDouble();
        }
    }
}
