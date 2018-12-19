
import java.util.Scanner;

public class Exercicio11_Array_loiane {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int[] vetA = new int [10];
        int qtdPares=0;
        
        for (int i = 0; i <vetA.length; i++){
            System.out.printf("Entre com o valor na posição(%d): ",i+1);
            vetA[i] = in.nextInt();
            if (vetA[i] % 2 == 0)
                qtdPares++;
        }
        
        System.out.print("VetorA: ");
        for (int i : vetA) {
            System.out.print(i+", ");
        }
        System.out.println("");
        System.out.println("Qtd de números pares: "+qtdPares);
    }
}
