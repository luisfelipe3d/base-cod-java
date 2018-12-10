/*
Exercicio :
Implementar um procedimento para o jogo do tiro ao alvo com dois jogadores 
onde um será o alvo e escolhe a sua posição e o outro será o atirador que irá 
tenta acertar o alvo. O jogo apresenta as seguintes funcionalidades: 
a)O alvo escolhe uma das 100 posições para ocupar (considere que as posições 
são numeradas de 1 a 100). Não deve permitir a escolha de uma posição fora 
desse intervalo. 
b)O atirador só tem 6 chances para acertar o alvo em cheio. Cada vez que ele 
atira, e não acerta, uma dica é dada: “O alvo está mais à direita” ou 
“O alvo está mais à esquerda”. Esta mensagem é dita de acordo com a posição 
do alvo e de acordo com o número em que o atirador atira. 
•Exemplos:Se o alvo está na posição 50 e o atirador atirou na posição 70, 
a mensagem é “Alvo mais à esquerda”. Se o alvo está na posição 50 e o atirador 
atirou na posição 10, a mensagem é “Alvo mais à direita”. 
c)Se o atirador acertar o alvo, o programa não deve pedir mais nenhuma tentativa
d)Ao final do jogo exibir a mensagem “Você perdeu. Ruim de mira!” ou 
“Parabéns, você acertou o alvo em cheio!”; 
e)Não permita que o atirador atire em posições fora da faixa esperada 
(entre 1 e 100); 
f)Ao final de uma partida, permita aos usuários jogarem novamente. 
 */
package lista12;
import java.util.Scanner;

public class Exercicio5_lista12 {
    
    static void linha(){
        for(int i = 1; i<= 25; i++){
            System.out.print("*");
        }
        System.out.println("");
    }
    
    static int p1(){
        Scanner in = new Scanner (System.in);
        int p1;
        do {
            System.out.println("Jogador 1: ");
            System.out.println("Posição do alvo (1/100): ");
            p1 = in.nextInt();
            if (p1 <1 || p1 > 100)
                System.out.println("Posição incorreta. Tente outro valor 1/100.");
        } while (p1 < 1 || p1 > 100);
        return p1;
    }
    
    static int p2(int p1){
        Scanner in = new Scanner (System.in);
        int p2=0,i;
        i=1;
        while (i<=6){
            do{
                System.out.println("Jogardor 2: ");
                System.out.print("Escolha uma posição (1/100): ");
                p2 = in.nextInt();
                if (p2 < 1)
                    System.out.println("O número informado tem que ser maior. ");
                else if (p2 > 100)
                    System.out.println("O número informado tem que ser menor. ");
            } while (p2 < 1 || p2 > 100);
            
            if (p1 > p2)
                System.out.println("Está mais a esquerda");
            else if (p1 < p2)
                System.out.println("Está mais a direita");
            else
                i=6;
            linha();
            i++;
        }
        return p2;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int op,pl1,pl2;
        do {
            linha();
            System.out.println("Tiro ao alvo: ");
            System.out.println("1. Inicar jogo.");
            System.out.println("2. Sair.");
            System.out.print("Opção: ");
            op = in.nextInt();
            linha();
            switch (op) {
                case 1:
                    pl1 = p1();
                    pl2 = p2(pl1);
                    if (pl1 == pl2)
                        System.out.println("Você acertou!");
                    else
                        System.out.println("Você é Ruim de Mira");
                    break;
                case 2:
                    System.out.println("Fim de Jogo. ");
                    linha();
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (op != 2);
    }
}
