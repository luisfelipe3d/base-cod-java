
import java.util.Scanner;

public class Exercicio14_Array_loiane {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int[] vetA = new int[10];
        double qtdImpar = 0;
        double somaImpar = 0;
        for (int i = 0; i<vetA.length; i++){
            System.out.printf("Entre com o valor na posição(%d): ",i+1);
            vetA[i] = in.nextInt();
            if (vetA[i] % 2 != 0){
                qtdImpar++;
                somaImpar += vetA[i];
            }
        }
        
        System.out.print("Vetor A: ");
        for (int i : vetA) {
            System.out.print(i+", ");
        }
        System.out.println("");
        
        System.out.println("Média aritimética: "+somaImpar/qtdImpar);
    }
}
