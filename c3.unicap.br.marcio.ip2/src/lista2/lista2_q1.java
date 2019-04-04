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
busca e exibição a qualquer momento e quantas vezes desejar.
 */
package lista2;
import java.util.Scanner;
public class lista2_q1 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double []vet = new double[100];
        int preenchido=0,op;
        double entrada;
        do{
            System.out.println("Manipulação de vetores\n"
                    + "1. Inserir valor no vetor\n"
                    + "2. Buscar valor no vetor\n"
                    + "3. Exibir vetor\n"
                    + "4. Finalizar programa");
            System.out.print("Opção: ");
            op = in.nextInt();
            switch(op){
                case 1:
                    preenchido=insercao(vet,preenchido);
                    break;
                case 2:
                    System.out.print("Valor para busca: ");
                    entrada = in.nextDouble();
                    if(verifica(vet, insercao(vet, preenchido)) == 1){
                        System.out.printf("%.2f está dentro do vetor\n",entrada);
                    } else{
                        System.out.println("O valor não está no vetor.");
                    }
                    break;
                case 3:
                    showArray(vet, preenchido);
                    break;
                case 4:
                    System.out.println("Fim do programa.");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (op != 4);
    }
    
    public static int insercao(double[] v, int posicao){
        Scanner in = new Scanner(System.in);
        double valor;
        char flag = 's';

        do{
            if(posicao < v.length){
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
        return posicao;
        
    }
    
    public static int verifica(double[]vet, double valor){
        return verifica(vet, vet.length, valor);
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
