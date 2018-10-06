/*
Lista 7
Almir
2.Faça um programa em JAVA para exibir todos os números 
inteiros divisíveis por 4, maiores ou iguais a 1050 e menores
ou iguais a 2400. 
 */
package lista7;

/**
 *
 * @author user
 */
public class exercicio2 {
    public static void main(String[] args) {
        int n=1050,aux,cont=0;
        
        while (n <=2400){
            if (n%4==0){
                System.out.println(""+n);
                cont++;
            }
            n++;
            
        }
        System.out.printf("Existem %d números divisiveis por 4: ",cont);
    }
    
}
