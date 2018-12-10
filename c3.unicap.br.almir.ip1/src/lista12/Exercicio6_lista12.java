/*
Exercicio:
Faça um procedimento que implemente o jogo da senha (para 2 pessoas). Esse 
procedimento deve apresentar as seguintes funcionalidades: 
a)O jogador 1 digita uma senha (valor inteiro entre 1 e 100, inclusivos) sem o  
conhecimento do jogador 2. Não permitir a entrada de valores fora da faixa 
especificada; 
b)O jogador 2 tem 5 tentativas para descobrir a senha
c)Se o valor digitado em uma tentativa tiver uma diferença igual a 1 
(para mais ou menos) para a senha, o programa deve avisar que “TÁ QUENTE!”. 
Exemplos: •Senha 43 e valor digitado 42. •Senha 43 e valor digitado 44. 
d)Se o jogador 2 acertar a senha, o programa não deve pedir mais nenhuma 
tentativa; 
e)Ao final do jogo exibir a mensagem “Você perdeu. Tente novamente depois!” ou
“Parabéns, você acertou!”; 
f)Não permita que o jogador 2 digite valores fora da faixa esperada 
(entre 1 e 100); 
g)Ao final de uma partida, permita aos usuários jogarem novamente. 
*/
package lista12;
import java.util.Scanner;
public class Exercicio6_lista12 {
    
    static void linha(){
        for (int i =1; i<=25; i++)
            System.out.print("*");
        System.out.println("");
    }
    
    static int p1(){
        Scanner in = new Scanner (System.in);
        int p1;
        do {
            System.out.println("Jogador 1: ");
            System.out.println("Digite senha (1/100): ");
            p1 = in.nextInt();
            if (p1 <1 || p1 > 100)
                System.out.println("Senha incorreta. Tente outro valor 1/100.");
        } while (p1 < 1 || p1 > 100);
        return p1;
    }
    
    static int p2(int p1){
        Scanner in = new Scanner (System.in);
        int p2=0,i;
        i=1;
        while (i<=5){
            do{
                System.out.println("Jogardor 2: ");
                System.out.print("Senha (1/100): ");
                p2 = in.nextInt();
                if (p2 < 1)
                    System.out.println("O número informado tem que ser maior. ");
                else if (p2 > 100)
                    System.out.println("O número informado tem que ser menor. ");
            } while (p2 < 1 || p2 > 100);
            
            if (p1 == (p2-1) || p1 == (p2+1))
                System.out.println("ESTÁ QUENTE!");
            else if (p1 == p2)
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
            System.out.println("Jogo da Senha: ");
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
                        System.out.println("Você Perdeu");
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
