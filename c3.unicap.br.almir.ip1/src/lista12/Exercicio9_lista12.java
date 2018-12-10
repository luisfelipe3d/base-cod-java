/*
Exercicio :
Faça uma função que verifica se um dado número passado como parâmetro é um 
número triangular. Um número é triangular quando é resultado do produto de três 
números consecutivos. Exemplo: 24 = 2 X 3 X 4. Essa função retorna 1 caso, o 
número seja triangular e 0, caso contrário.
*/
package lista12;
import java.util.Scanner;
public class Exercicio9_lista12 {
    static boolean triangulo(int n){
        for (int i =1; i*(i+1)*(i+2)<= n; i++){
            if (i*(i+1)*(i+2) == n)
                return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int entrada;
        
        System.out.print("Num: ");
        entrada = in.nextInt();
        
        System.out.println(entrada+": "+triangulo(entrada));
        
    }
}
