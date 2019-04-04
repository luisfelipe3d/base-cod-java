/*
Lista 2
2ª Questão: Refaça a questão anterior. Desta vez, o procedimento de inserção deve 
inserir o novo valor de forma que o vetor fique ordenado em ordem crescente de 
valores.
*/
package lista2;

import java.util.Scanner;

public class lista2_q2 {
    public static void main(String[] args) {
        double []vet = new double[100];
        int preenchido=0;
        insercao(vet,preenchido);
    }
    
    public static void insercao(double[] v, int posicao){
        Scanner in = new Scanner(System.in);
        double valor;
        char flag = 's';
        
        do{
            if(posicao <= v.length){
                System.out.print("Digite um valor: ");
                valor = in.nextDouble();
                if(verifica(v, posicao, valor) == 0){
                    System.out.printf("Valor: %.2f adicionado no vetor. Posicao[%d].",
                            valor,posicao);
                    v[posicao] = valor;
                    posicao++;
                }else{
                    System.out.println("Esse valor já se encontra dentro do vetor");
                }
                System.out.print("Desja continuar?(S/N): ");
                flag = in.next().charAt(0);
            } // fim if
        }while(flag == 'S' || flag == 's');
        showArray(v,posicao);
        ordenarVetor(v);
        showArray(v,posicao);
        
    }
    
    public static int verifica(double[] vet, int qtd, double valor){
        for(int i = 0; i <= qtd; i++){
            if (vet[i] == valor){
                return 1; 
            }
        } // funcao retorna 1 se encontrou valor no vetor e 0 se não.
        return 0;
    }
    
    public static void showArray(double[] x, int preenchido){
        System.out.print("Vet:{");
        for(int i = 0; i < preenchido; i++){
            System.out.printf(" %.2f,",x[i]);
        }
        System.out.println("}");
    }
    
    public static void ordenarVetor(double []v){
        //Ordena vetor usando o metodo bolha
	int n = v.length;
	double temp = 0;
	for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - 1); j++) {
                if (v[j - 1] > v[j]) {
		temp = v[j - 1];
		v[j - 1] = v[j];
		v[j] = temp;
		}
            }
	}
	/*for (int g = 0; g < v.length; g++) {
            System.out.print(v[g] + " ");
	}*/
    }

    
}
