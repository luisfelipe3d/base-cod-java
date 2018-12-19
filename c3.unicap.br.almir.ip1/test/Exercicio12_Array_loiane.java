
import java.util.Scanner;

public class Exercicio12_Array_loiane {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int[] vetA = new int[10];
        int soma = 0;
        for (int i = 0; i<vetA.length; i++){
            System.out.printf("Entre com o valor na posição(%d): ",i+1);
            vetA[i] = in.nextInt();
            soma = soma + vetA[i];
        }
        System.out.print("Vetor A: ");
        for (int i : vetA) {
            System.out.print(i+", ");
        }
        System.out.println("");
        
        System.out.println("Soma: "+soma);
        
    }
}
