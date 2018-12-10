/*
Exercicio :
Dois carros percorreram diferentes distâncias em diferentes tempos.
Sabendo-se que a velocidade média é a razão entre a distância percorrida
e o tempo levado para percorrê-la, faça um programa para ler a distância
que cada carro percorreu, o tempo que cada um levou, e indicar o carro 
que teve maior velocidade média. 
OBS:    Vm = dist/t
 */
package lista4;
import java.util.Scanner;

public class Exercicio15_lista4 {
    public static void main(String[] args) {
        //Definir variaveis
        Scanner in = new Scanner(System.in);
        double distancia_1,distancia_2,tempo_1,tempo_2,vm_1,vm_2;
        
        //Entrada
        System.out.println("Distância do carro 1: ");
        distancia_1 = in.nextDouble();
        System.out.println("Tempo do carro 1: ");
        tempo_1 = in.nextDouble();
        System.out.println("Distância do carro 2: ");
        distancia_2 = in.nextDouble();
        System.out.println("Tempo do carro 2: ");
        tempo_2 = in.nextDouble();
        
        //Processamento
        vm_1 = distancia_1/tempo_1;
        vm_2 = distancia_2/tempo_2;
        if (vm_1 > vm_2) {
            System.out.printf("O carro 1 obteve a maior velocidade "
                    + "média %.2f\n",vm_1);
        } else if (vm_2 > vm_1){
            System.out.printf("O carro 2 obteve maior velocidade "
                    + "média %.2f \n",vm_2);
        } else {
            System.out.println("Velocidade média do carro 1 e 2 são iguais. ");
        }
    }
}
