/*
Exercicio :
Entrar com um ângulo em graus e exibir o valor do seu seno, co-seno
e tangente. Dica: usar a biblioteca math.h
para as funções que calcular seno, cosseno e tangente. 
Obs.: Elas recebem o valor do ângulo em radianos! 
 */
package lista3;
import java.util.Scanner;

public class Exercicio11_lista3 {
    public static void main(String[] args) {
        //Definir variáveis
        Scanner in = new Scanner(System.in);
        double angulo,angulo_rad,sen_x,cos_x,tg_x;
        
        //Entrada
        System.out.println("Digite o ângulo em graus: ");
        angulo = in.nextInt();
        
        //Processamento
        angulo_rad = Math.toRadians(angulo); // Converte ângulo p/ rad
        sen_x = Math.sin(angulo_rad); // Calcula f(x) seno
        cos_x = Math.cos(angulo_rad); // Calcula f(x) cosseno
        tg_x = Math.tan(angulo_rad); // Calcula f(x) tangente
        
        //Saida
        System.out.println("O valor em graus: "+angulo);
        System.out.printf("O valor em radianos: %.2f \n",angulo_rad);
        System.out.printf("Função Sen: %.2f \n",sen_x);
        System.out.printf("Função Cos: %.2f \n",cos_x);
        System.out.printf("Função Tang: %.2f \n",tg_x);
    }
}
