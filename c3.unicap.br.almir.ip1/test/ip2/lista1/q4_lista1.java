/*
Acrescente ao programa da questão anterior a seguinte funcionalidade:
procedimento para dizer quais meses tiveram lucro abaixo da média mensal calculada.
 */
package ip2.lista1;
import java.util.Scanner;
/**
 *
 * @author luisfelipe3d
 */
public class q4_lista1 {
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
        
        double mediaLucros = somaElementos(vetLucros)/12;
        System.out.printf("Média dos Lucros mensais: %.2f\n\n",mediaLucros);
        
        baixoMedia(vetLucros,mediaLucros);
    }
    
    static void preencheVetores(double[] xGanhos, double[] xGastos){
        Scanner in = new Scanner (System.in);
        for (int i = 0; i < xGanhos.length; i++){
            //System.out.printf("Ganhos do mês(%d): ",i+1);
            xGanhos[i] = Math.random() * (1000 - 1);
            //System.out.printf("Gastos do mês(%d): ",i+1);
            xGastos[i] = Math.random() * (1000 - 1);
        }
    }
    
    static void calcLucros(double[] xGanhos, double[] xGastos, double[] xLucros){
        
        for (int i = 0; i < xLucros.length; i++){
            xLucros[i] = xGanhos[i] - xGastos[i];
            
        }
    }
    
    static void showResult(double[] xSaida){
        for (int i = 0; i < xSaida.length; i++){
            if (xSaida[i] > 0)
            System.out.printf("Lucro no mês(%d): %.2f\n",i+1,xSaida[i]);
            else if (xSaida[i] == 0)
                System.out.printf("Sem lucros no mês(%d): %.2f\n",i+1,xSaida[i]);
            else
                System.out.printf("Prejuizo no mês(%d): %.2f\n",i+1,xSaida[i]);
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
    
    static void baixoMedia(double[] xLucros, double mediaM){
        for (int i = 0; i < xLucros.length; i++){
            if (xLucros[i] < mediaM)
                System.out.printf("Mês(%d): Lucro abaixo da média.\n",i+1);
        }
    }
}
