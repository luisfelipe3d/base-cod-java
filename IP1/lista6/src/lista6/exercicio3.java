/*
Lista 6
Almir
3.Faça um programa em JAVA que receba o código do produto
comprado e a quantidade comprada de um produto. Em seguida
ele dever calcular e mostrar: 
a)O preço unitário do produto comprado seguindo a Tabela I, a seguir; 
b)O preço total da nota; 
c)O valor do desconto, seguindo a Tabela II, a seguir, e aplicado
sobre o preço total da nota; 
d)O preço final da nota após o desconto. 
Obs:O programa deve verificar se o código é válido, caso contrário,
exibir mensagem de erro e não realizar nenhum cálculo. 

TABELA I
Código  Preço
10 a 20 R$10,00
21 a 30 R$21,00
31 a 40 R$31,00
41 a 50 R$41,00

TABELA II 
Preço Total da Nota           % de Desconto 
Até R$ 250,00                      10%
Entre R$ 250,00 e R$ 500,00        15%
De R$ 500,00 para cima             20%
 */
package lista6;
import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cod_produto,qtd_produto,preco=0;
        double total,total_desc;
        
        System.out.print("Informe o código do produto: ");
        cod_produto = in.nextInt();
        //Valida cod digitado e dependendo do nº atribui um valor
        if (cod_produto < 10 || cod_produto > 20)
            System.out.println("Código inválido.");
        else if (cod_produto >=10 && cod_produto <=20)
            preco = 10;
        else if (cod_produto >20 && cod_produto <=30)
            preco = 21;
        else if (cod_produto >30 && cod_produto <=40)
            preco = 31;
        else
            preco = 51;
        
        System.out.print("Quantidade de produtos adquiridos: ");
        qtd_produto = in.nextInt();
        //Valida quantidade digitada
        if (qtd_produto <=0)
            System.out.println("Quantidade inválida.");
        
        total = preco * qtd_produto; // Valor bruto
        //Cal qtd de desconto 
        if (total <= 250)
            total_desc = total * 0.90;
        else if (total > 250 && total <= 500)
            total_desc = total * 0.85;
        else
            total_desc = total * 0.80;
        
        System.out.println("Preço unitário do produto: "+preco);
        System.out.println("Preço total da nota: "+total);
        System.out.println("Valor do desconto: "+(total-total_desc));
        System.out.println("Valor da nota final: "+total_desc);
    }
}
