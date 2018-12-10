/*
Exercicio :
Escrever um programa que lê o número do vendedor de uma empresa,
seu salário fixo e o total de vendas por ele efetuadas. Cada 
vendedor recebe um salário fixo, mais uma comissão proporcional
às vendas por ele efetuadas. A comissão é de 3% sobre o total 
de suas vendas até 1.000.000 e 5% sobre o que ultrapassar este
valor. Escrever o número do vendedor, o total de suas vendas, seu 
salário fixo e o seu salário total. 
 */
package lista4;
import java.util.Scanner;

public class Exercicio11_lista4 {
    public static void main(String[] args) {
        //Definir variávies
        Scanner in = new Scanner(System.in);
        int num_vendedor;
        double comissao,salario_fixo,
                total_vendas;
        //Entrada
        System.out.println("Sua identificação: ");
        num_vendedor = in.nextInt();
        System.out.println("Informe seu salário fixo(R$): ");
        salario_fixo = in.nextDouble();
        System.out.println("Total de vendas efetuadas(R$): ");
        total_vendas = in.nextDouble();
      
        //Processamento e saida
        
        comissao = (total_vendas <= 1000000)? total_vendas*0.03:total_vendas*0.05;
        //ou
        //if (total_vendas <= 1000000)
        //    comissao = total_vendas * 0.03; 
        // else
        //    comissao = total_vendas * 0.05;
        
        System.out.printf("ID: %d\n"
                + "Salário: %.2f\n"
                + "Vendas: %.2f\n"
                + "Comissão: %.2f\n"
                + "Total a receber: %.2f\n"
                + "",num_vendedor,salario_fixo,total_vendas,comissao,
                (salario_fixo+comissao));
    }
}
