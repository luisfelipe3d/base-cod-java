/*
Lista3
Almir
15.A concessionária de carros “Seu Melhor Negócio” paga aos seus 
funcionários um salário mínimo de R$350,00 por mês mais uma comissão
de R$ 25,00 por carro novo vendido e mais 3% do valor total de suas 
vendas.Calcular e exibir o salário total de um vendedor em um dado mês. 
*/
package lista3;
import java.util.Scanner;

public class exercicio15 {
    public static void main(String[] args) {
        //Definir variáveis
        Scanner in = new Scanner(System.in);
        int salario_minimo=350,comissao=25,carros_novos;
        double valor_total=1.03,salario,salario_final;
        
        //Entrada
        System.out.println("Quantidade de carros novos vendidos: ");
        carros_novos = in.nextInt();
        
        //Processamento
        comissao = comissao * carros_novos;
        salario = (salario_minimo+comissao);
        salario_final =  salario * valor_total;
        
        
        System.out.println("O seu salário será de: "+salario_final);
        
    }
}
