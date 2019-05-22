/*
Complexidade Pior Caso: O(n²)
Complexidade Caso Médio: O(n²)
Complexidade Melhor Caso: O(n)
O melhor caso ocorre quando todos os elementos já estão ordenados e o pior 
caso é exatamente o contrário, quando todos os elementos estão desordenados.
 */
package metodos_de_ordenacao;
import java.lang.*;

public class insertion_sort {
    public static void main(String[] args) {
        int []Desordenado = {1,9,7,0,5,2,4,6,8,3};
        int []MeioOrdenado = {0,1,2,3,4,9,7,6,8,5};
        int []Ordenado = {0,1,2,3,4,5,6,7,8,9};
        int []x = new int [10];
        int []y = new int [10];
        int []z = new int [10];
        preencheVetor(x);
        preencheVetor(y);
        preencheVetor(z);
        System.out.println();
        
        
        
          
    }
    
    public static void InsertionSort(int []vet, int n){
        int i, j=0, tmp=0;
        
        for(i = 1; i < n; i++){
            tmp = vet[i];
            j = 1;
            while(j> 0 && vet[j-1] > tmp){
                vet[j] = vet[j-1];
                j = j - 1;
            }
        } // end for
        vet[j] = tmp;
    }
    
    public static void preencheVetor(int []x){
        for (int i = 0; i <x.length - 1; i++) {
            x[i] = (int)(Math.random() * 10);
        }
    }
}
