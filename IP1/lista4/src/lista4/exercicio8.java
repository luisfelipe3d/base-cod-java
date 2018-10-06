/*
Lista 4
Almir
8.
O cálculo do peso ideal de um homem (em quilos) é dado pela
fórmula (72.7 * h) - 58, onde h é a altura em metros, ou seja,
se uma pessoa tem 1m e 80 cm de altura, o valor de h é 1.8,
e assim por diante. Baseado nesta fórmula faça um programa que 
receba a altura de um homem e seu peso. O programa vai calcular
o peso ideal deste homem e comparar com o peso fornecido
pelo usuário, imprimindo "Você está com o peso correto.", ou 
"Você está acima do peso ideal." ou "Você está abaixo do peso ideal." 
caso o peso fornecido seja respectivamente igual, maior ou menor 
que o peso ideal calculado. 
 */
package lista4;
import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        //Definir variáveis
        Scanner in = new Scanner(System.in);
        double peso,altura,imc,peso_ideal,formula;
        
        //Entrada
        System.out.println("Peso (50): ");
        peso = in.nextDouble();
        System.out.println("Altura (1.8): ");
        altura = in.nextDouble();
        
        //Processamento ; fórmula (72.7 * h) - 58
        peso_ideal = (72*altura) - 58;
        
        if (peso_ideal < peso)
            System.out.println("Você está acima do peso ideal.");
        else if (peso_ideal == peso)
            System.out.println("Você está com o peso correto.");
        else
            System.out.println("Você está abaixo do peso ideal.");
        
    }
}
