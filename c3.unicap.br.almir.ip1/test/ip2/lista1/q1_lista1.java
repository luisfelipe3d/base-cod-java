/*
1ª Questão: João tem uma empresa de venda de celulares. Sua empresa cresceu 
bastante em 2017. Agora ele necessita de um programa para gerenciar os ganhos 
da empresa. Faça um programa para criar e preencher três vetores cada um com 
12 componentes do tipo double: vetGanhos (que armazenará os ganhos da empresa
em cada mês do ano de 2017), vetGastos (que armazenará os gastos da empresa em
cada mês do ano de 2017) e vetLucros  (que armazenará os lucros da empresa em 
cada mês do ano de 2017). Os vetores vetGanhos e vetGastos serão preenchidos 
com valores digitados pelo usuário. O vetor vetLucros será preenchido com os 
lucros da empresa em cada mês do ano de 2017 que deverão ser calculados pelo 
programa a partir dos ganhos e gastos de cada mês. Ao final, o programa deverá
exibir o lucro da empresa em cada mês de 2017. O programa deverá ter os 
seguintes subprogramas:
(a) Procedimento para preencher um dado vetor com valores informados pelo 
usuário. Este procedimento deve receber como parâmetro o vetor a ser preenchido;
(b) Procedimento para calcular os lucros da empresa em cada mês do ano de 2017
e armazenar os resultados no vetor vetLucros. Este procedimento deve receber 
como parâmetros os vetores vetGanhos, vetGastos e vetLucros;
(c) Procedimento para exibir os valores de um dado vetor. Este procedimento 
deve receber como parâmetro o vetor a ser exibido.
 */
package ip2.lista1;
import java.util.Scanner;

public class q1_lista1 {
    public static void main(String[] args) { 
        double[] vetGanhos = new double [12];
        double[] vetGastos = new double [vetGanhos.length];
        double[] vetLucros = new double [vetGanhos.length];
        
        preencheVetores(vetGanhos,vetGastos);
        calcLucros(vetGanhos,vetGastos,vetLucros);
        showResult(vetLucros);
        
    }
    
    static void preencheVetores(double[] xGanhos, double[] xGastos){
        Scanner in = new Scanner (System.in);
        for (int i = 0; i < xGanhos.length; i++){
            //System.out.printf("Ganhos do mês(%d): ",i+1);
            xGanhos[i] = Math.random() * 1000;
            //System.out.printf("Gastos do mês(%d): ",i+1);
            xGastos[i] = Math.random() * 1000;
        }
    }
    
    static void calcLucros(double[] xGanhos, double[] xGastos, double[] xLucros){
        
        for (int i = 0; i < xLucros.length; i++){
            xLucros[i] = xGanhos[i] - xGastos[i];
        }
    }
    
    static void showResult(double[] xSaida){
        for (int i = 0; i < xSaida.length; i++){
            System.out.printf("Lucro no mês (%d): %.2f\n",i+1,xSaida[i]);
        }
        System.out.println("");
    }
}
