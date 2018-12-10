/*
Exercicio :
Faça um programa em JAVA para solicitar ao usuário o peso (em quilos) e a 
altura (em metros) de 15 pessoas e calcular o índice de massa corpórea (IMC)
de cada uma delas. Após calcular o IMC de uma pessoa, o programa deve informar
sua situação segundo a tabela abaixo. Dica: IMC = peso / altura²
IMC
De 20 a 24,9        = Peso normal
25 a 30             = Um pouco acima de peso ideal
30 a 40             = Obesidade
Acima 40            = Obesidade mórbida
OBSERVAÇÃO
Agora, resolva as questões utilizando o comando do-while e compare os 
resultados obtidos.
 */
package lista7;
import java.util.Scanner;

public class Exercicio13_lista7 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        double peso, altura, imc;
        
        System.out.println("Informe seu peso: ");
        peso = in.nextDouble();
        System.out.println("Informe sua altura: ");
        altura = in.nextDouble();
        
        imc = peso / (altura*altura);
        
        if(imc < 20)
            System.out.println("Abaixo do peso.");
        else if(imc < 24.9)
            System.out.println("Peso normal.");
        else if(imc < 30)
            System.out.println("Um pouco acima do peso ideal.");
        else if(imc < 40)
            System.out.println("Obesidade.");
        else
            System.out.println("Obesidade mórbida.");
    }
}
