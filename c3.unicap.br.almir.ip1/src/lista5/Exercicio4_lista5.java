/*
Exercicio :
O Futebol Clube do Recife deseja aumentar o salário de seus jogadores.
O ajuste salarial deve obedecer à seguinte tabela: 
até 900     aumento de 20%
acima de 900 até 1300   aumento de 15%
acima de 1300 até 1800  aumento de 10%
acima 1800 aumento de 5%

Faça  um  programa  para  ler  o  salário  atual  de  um  jogador
e  calcular  seu  aumento  e  seu  novo  salário.  O  programa  deverá 
exibir a seguinte frase: O jogador terá aumento de R$ __________ e 
passará a receber R$____________. 
 */
package lista5;
import java.util.Scanner;
public class Exercicio4_lista5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double salario,novo_salario=0;
        
        //Receber salario atual
        System.out.println("Digite seu salario: ");
        salario = in.nextDouble();
        //Calcula o aumento percentual de aumento
        if (salario <= 900)
            novo_salario = 0.2*salario;
        else if (salario > 900 && salario <= 1300)
            novo_salario = 0.15*salario;
        else if (salario > 1300 && salario <=1800)
            novo_salario = 0.1*salario;
        else if (salario > 1800)
            novo_salario = 0.05*salario;
        System.out.printf("O jogador terá aumento de R$%.2f "
                + "e passara a receber R$%.2f\n",novo_salario,
                (salario+novo_salario));
    }
}
