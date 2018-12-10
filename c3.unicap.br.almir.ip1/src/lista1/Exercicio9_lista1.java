/*
Exercicio :
Dados a quantidade de fitas que uma locadora de vídeo possui e o valor que ela 
cobra por cada locação, calcule o que se pede em cada item abaixo:
 Quando o cliente atrasa a entrega, é cobrada uma multa de 10% sobre o valor da
locação. Sabendo-se que um décimo das fitas alugadas no mês são devolvidas com 
atraso, calcule o valor ganho com multas por mês.
 Sabendo-se que um terço das fitas são alugadas por mês, exiba o faturamento 
anual da locadora incluindo o ganho com multas.
 Sabendo-se ainda que 2% das fitas de estragam ao longo do ano e que apenas um 
décimo desse total é comprado para reposição, exiba a quantidade de fitas que a 
locadora terá no final do ano. 
 */
package lista1;
import java.util.Scanner;

public class Exercicio9_lista1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Definir variaveis
        int qtd_fitas,valor_locacao;
        float multa,fitas_atrasadas,faturamento,estrago,reposicao,stock;
        //Entrada
        System.out.println("Quantidade de fitas na locadora: ");
        qtd_fitas = in.nextInt();
        System.out.println("Valor por locação: ");
        valor_locacao = in.nextInt();
        //Processamento
        multa = valor_locacao*1.10f;
        fitas_atrasadas = (qtd_fitas/10) * multa; // Item 1
        faturamento = ((qtd_fitas/3) + fitas_atrasadas)*12; //Item 2
        estrago = qtd_fitas*0.02f; // Calcula a qtd de fitas estragadas
        reposicao = estrago/10; // Calcula qtd de fitas compradas para reposicao
        stock = qtd_fitas-estrago+reposicao; //Calcula quantas fitas terao ao final do ano
        // Saida
        System.out.println("O valor ganho com multas no mês foi de R$: "+fitas_atrasadas);
        System.out.println("O faturamento anual R$: "+faturamento);
        System.out.println("Stock de fitas ao final do ano: "+stock);
    }
}
