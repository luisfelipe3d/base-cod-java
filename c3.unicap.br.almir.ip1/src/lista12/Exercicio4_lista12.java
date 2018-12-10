    /*
Exercicio :
Faça um procedimento que receba como parâmetro o valor de n, imprima a 
    sequência a seguir e o resultado da soma dos n + 1 termos. 
    s = n!/0²! - (n-1)!/2²! + (n-2)!/4²! - (n-3)!/6²! +...0!/(2n²)!
    */
    package lista12;
    import java.util.Scanner;

    public class Exercicio4_lista12 {

        static double fatRecu(double x){
            if (x == 0 || x == 1)
                return 1;
            else
                return x * fatRecu(x-1); 
        }

        static double fatNrecu(double y){
            int f = 1;
            for (int i = 1 ; i <= y; i++)
                f = f * i;
            return f;
        }
// (fatRecu(i))/ (fatRecu((int) Math.pow(j, 2)));
        
        static void sequencia(int n){
            double termo,i,j;
            double soma=0;
            double k=1;
            System.out.print("S: ");
            for (i = n, j = 0 ;i >= 0 ; i--, j = j + 2){
                termo = fatRecu(i)/fatRecu(Math.pow(j, 2));
                termo = termo * k;
                soma = soma + termo;
                k = k * (-1);
                System.out.print(termo+", ");
            }
            System.out.println(""+soma);
        }

        public static void main(String[] args) {
            Scanner in = new Scanner (System.in);
            int entrada;

            System.out.print("Informe N: ");
            entrada = in.nextInt();
            sequencia(entrada);
            
        }
    }
