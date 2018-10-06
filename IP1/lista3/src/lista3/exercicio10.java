/*
Lista 3
Almir
10.Calcular e exibir, dado o valor do salário mínimo e o valor do 
salário de um funcionário, quantos salários mínimos este funcionário recebe. 
*/
package lista3;
import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        //Definir variáveis
        Scanner in = new Scanner (System.in);
        double salario_minimo,salario_func,calc;
        
        //Entrada
        System.out.println("Valor do salário mínimo: ");
        salario_minimo = in.nextDouble();
        System.out.println("Valor do funcionário: ");
        salario_func = in.nextDouble();
        
        //Processamento
        calc = ((int)salario_func) /((int)salario_minimo);
        
        //Saida
        System.out.printf("O funcionário recebe: %.0fx o salário mínimo ",calc);
    }
}
