/*

 */
package Outros;
import java.util.Scanner;
public class sequencia {
    
    public static double fatRecu(double x) {
        if (x == 0 || x == 1) {
            return 1;
        } else {
            return x * fatRecu(x - 1);
        }
    }

    public static double calculo() {
        Scanner in = new Scanner(System.in);
        double n, s = 0, d = 0, cont = 0;

        System.out.println("Informe n: ");
        n = in.nextInt();

        do{
            if (cont == 0){
                s = s + (fatRecu(n) / fatRecu(d * d));
                cont++;
            }
            else{
                s = s - (fatRecu(n) / fatRecu(d * d));
                cont--;
            }
            n--;
            d  = d + 2;
        }while(n >= 0);
        
        return s;
        
    }
    
    public static void main(String[] args) {
        double r;
        
        r = calculo();
        System.out.println(r);
    }
}

