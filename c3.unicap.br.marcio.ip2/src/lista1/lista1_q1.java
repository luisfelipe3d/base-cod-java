/*
Lista 1
1ª Questão:  Dado o vetor Vetde caracteres abaixo:
Qual será a sua configuração depois de executados os comandos abaixo:
        [T] [R] [X] [S] [ ] [E] [O] [B] [A] [!]
intmain  ( ) {
    char Aux, Vet  [10];
    int i;
... // código de preenchimento
    Aux = Vet[5];
    Vet[5] = Vet[8];
    Vet[8] = Aux;
    for (i = 0; i <= 3; i++){
        Aux = Vet[i];
        Vet[i] = Vet[7-i];
        Vet[7-i]=  Aux;
    }
    Vet[5]  = Vet[1];
    for (i = 0; i <= 9; i++){
        printf(“%i”,&Vet[i]);
        printf(“/n”);
    }
    return 0;
}
 */
package lista1;

public class lista1_q1 {

    public static void main(String[] args) {
        System.out.println("REPOSTA: BOA SORTE!");
    }
    
}
