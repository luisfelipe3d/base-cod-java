/*
Exercicio :
Dados o valor do salário mínimo, o número de horas trabalhadas, o número 
dependentes e a quantidade de horas extras trabalhadas por um funcionário,
calcular e exibir o salário a receber do funcionário de acordo com
as regras a seguir: 
•O valor da hora trabalhada é igual a 1/10 do salário mínimo; 
•O salário do mês é igual ao número de horas trabalhadas multiplicado
pelo valor da hora trabalhada; 
•O salário bruto é igual ao salário do mês mais o valor do salário 
família recebido por cada dependente e mais o valor total recebido 
pelas horas extras trabalhadas; 
•O salário família é 5% do salário mínimo; 
•O valor de uma hora extra trabalhada é igual a uma vez e meia o 
valor da hora trabalhada; 
•O salário a receber do funcionário (salário líquido) é igual ao 
salário bruto menos o IRRF; 
•O valor do imposto de renda retido na fonte (IRRF) é de 10% 
do salário bruto.  
 */
package lista3;
import java.util.Scanner;

public class Exercicio19_lista3 {
    public static void main(String[] args) {
        //Definir variáveis
        Scanner in = new Scanner(System.in);
        int horas_trabalhadas, numero_dependentes,qtd_hora_extra;
        double salario_minimo,salario_mes,valor_hora,salario_bruto,
                salario_familia,valor_extra, imposto=0.1,salario_liquido;
        
        //Entrada
        System.out.println("Saĺário mínimo: ");
        salario_minimo = in.nextDouble();
        System.out.println("Qtd horas trabalhadas: ");
        horas_trabalhadas = in.nextInt();
        System.out.println("Número de dependentes: ");
        numero_dependentes = in.nextInt();
        System.out.println("Qtd horas extras: ");
        qtd_hora_extra = in.nextInt();
        
        //Processsamento
        valor_hora = horas_trabalhadas + (salario_minimo/10); //Item 1
        salario_mes = horas_trabalhadas * valor_hora; // Item 2
        salario_familia = salario_minimo * 0.05; // Item 4
        valor_extra = 1.5 * horas_trabalhadas; //Item 5
        salario_bruto = salario_mes + (salario_familia*numero_dependentes) +
                valor_extra; // Item 3
        salario_liquido = salario_bruto - (salario_bruto*imposto); //Item 6
        
        //Saida
        System.out.println("Seu salário bruto: "+salario_bruto);
        System.out.println("Seu saĺario com descontos: "+salario_liquido);
    }
}
