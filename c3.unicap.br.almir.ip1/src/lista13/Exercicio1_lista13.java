/*
Exercicio :
Faça um programa que contenha uma função que dado o número real corresponde,
de acordo com as regras matemáticas.
OBs: Utiliza as funções pré-definidas Math.ceil(x) para maior inteiro e
Math.floor(x) para menor inteiro. Elas pertencem ao pacote "java.lang"
OBS: Todas entradas e saidas deve ser feitas no programa principal(main).
 */
package lista13;
import java.util.Scanner;
public class Exercicio1_lista13 {

    static double arredondamento(double numero, double fracionado){
        if (fracionado >= 0.50)
            return Math.ceil(numero);
        else
            return Math.floor(numero);
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int partInteira;
        double entrada, partFracionada;
       
        System.out.print("Informe um número real: ");
        entrada = in.nextDouble();
        partInteira = (int) entrada;
        partFracionada = entrada - partInteira;
        System.out.println(partFracionada);
        System.out.println("Arredondado: "+arredondamento(entrada, partFracionada));
        
        
    }
    
}
