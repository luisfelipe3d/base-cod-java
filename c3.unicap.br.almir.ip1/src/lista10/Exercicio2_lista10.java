/*
Exercicio:
Faça um programa para fazer conversão de temperaturas de graus Fahrenheit  
para graus Celsius e vice-versa.O programa deverá apresentar os seguintes
subprogramas: 
a)Função para converter temperaturas em graus Fahrenheit para graus Celsius.    
Esta função receberá como parâmetro o valor da temperatura em graus Fahrenheit
a ser convertido e deverá calcular e retornar para o programa o valor 
correspondente em graus Celsius.O programa se encarregará de exibir o resultado
ao usuário.  
b)Procedimento para converter temperaturas em graus Celsius para graus 
Fahrenheit. Este procedimento receberá como parâmetro o valor da temperatura em
graus Celsius a ser convertido e deverá calcular e exibir o valor correspondente
em graus Fahrenheit. 
OBS.1: O programa deverá permitir que o usuário faça quantas conversões ele 
desejar e só deverá terminar sua execução se o usuário solicitar.  
OBS.2: Toda entrada de dados deve ser feita pelo programa principal. 
OBS.3: Para as conversões, utilize as fórmulas abaixo:
F = 9/5*C + 32      C = 5/9(F-32)
 */
package lista10;
import java.util.Scanner;
public class Exercicio2_lista10 {
    static void linha(){
        for (int i = 1; i<=20; i++)
            System.out.print("*");
        System.out.println("");
    }
    
    static double FahtoCel(double x){
        return (x-32) * 5/9;
    }
    
    static void CeltoFah(){
        Scanner in = new Scanner (System.in);
        double fah,cel;
        linha();
        System.out.print("Temp em graus Celsius: ");
        cel = in.nextDouble();
        fah = (cel * 9/5) + 32;
        System.out.println("Temp em Fah: "+fah);
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int op;
        double temp;
        do {
            linha();
            System.out.println("Conversor de Temperatura");
            System.out.println("1. Fahrenheit para Celsius");
            System.out.println("2. Celsius para Fahrenheit");
            System.out.println("3. Sair");
            System.out.print("Opção: ");
            op = in.nextInt();
            
            switch(op){
                case 1:
                    System.out.println("Temp em Fahrenheit: ");
                    temp = in.nextDouble();
                    System.out.println(FahtoCel(temp));
                    break;
                case 2:
                    CeltoFah();
                    break;
                case 3:
                    System.out.println("Fim Program.");
                    linha();
            }
        } while (op != 3);
        
    }
}
