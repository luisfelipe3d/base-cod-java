/*
1ª Questão: Faça um programa que permita o cadastramento de números e a consulta 
dos mesmos em um vetor de números reais. O vetor deve aceitar, no máximo, 100 números.
O programa deverá ter os seguintes subprogramas:

a)Um procedimento que receba como parâmetro o vetor onde ser feita a inserção dos 
números e a quantidade de posições já preenchidas nesse vetor. O procedimento deverá  
solicitar ao usuário números que serão armazenados no vetor. O usuário poderá 
informar quantos números desejar. Para isso, o procedimento deve perguntar ao usuário  
se ele deseja continuar inserindo números. O processo de inserção tem dois requisitos:  
deve existir espaço no vetor para inserção e o número a ser inserido não pode 
ser repetido, ou seja, no vetor um  valor não pode aparecer mais de uma vez.  
Para garantir o segundo requisito, o procedimento deverá fazer uso da função definida  
no item (b) abaixo. O inserção de um novo valor sempre ocorre na primeira posição  
livre do vetor;

b)Uma função que receba como parâmetro o vetor onde ser feita a busca, quantidade de 
posições preenchidas nesse vetor e o valor procurado. A função deverá retornar 0 se 
o valor não pertencer ao vetor. Caso contrário, deve retornar 1;

c)Um procedimento para exibir os valores armazenados no vetor. Este procedimento 
recebe como parâmetro o vetor a ser exibido e a quantidade de posições  preenchidas  
nesse vetor.

O programa deverá ter um menu que permitirá ao usuário executar as opções de inserção,
busca e exibiçãoa qualquer momento e quantas vezes desejar.
 */
package lista2;
import java.util.Scanner;
public class lista2_q1 {
    
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
}
