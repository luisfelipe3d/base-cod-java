/*
Acrescente ao programa da questão anterior a seguinte funcionalidade: 
calcular e exibir o total de ganhos, o total de gastos e o lucro total da 
empresa no ano de 2017. Este programa deverá ter o seguinte subprograma: 
uma função para somar os elementos de um vetor. Esta função deve receber 
como parâmetro o vetor cujos valores serão somados e deve retornar o valor
da soma calculada.
 */
package ip2.lista1;
import java.util.Scanner;
/**
 *
 * @author luisfelipe3d
 */
public class q2_lista1 {
    public static void main(String[] args) { 
        double[] vetGanhos = new double [12];
        double[] vetGastos = new double [vetGanhos.length];
        double[] vetLucros = new double [vetGanhos.length];
        
        preencheVetores(vetGanhos,vetGastos);
        calcLucros(vetGanhos,vetGastos,vetLucros);
        showResult(vetLucros);
        
        System.out.printf("Soma dos Ganhos: %.2f\n",somaElementos(vetGanhos));
        System.out.printf("Soma dos Gastos: %.2f\n",somaElementos(vetGastos));
        System.out.printf("Soma dos Lucros: %.2f\n",somaElementos(vetLucros));
        
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
    
    static double somaElementos(double[] x){
        double soma=0;
        for (double d : x) {
            soma += d;
        }
        return soma;
    }
}
