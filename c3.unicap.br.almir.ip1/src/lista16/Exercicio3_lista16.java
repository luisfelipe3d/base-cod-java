/*
Exercicio:
A invenção do jogo de xadrez se relaciona diretamente com a matemática, 
a partir de um antigo pergaminho que relata o seguinte: Estava enfermo certo Rei
na Índia e lhe indicaram que deveria se distrair com algo agradável. Para ele, 
Dahir al-Hindi elaborou o jogo de xadrez. Depois de ter expressado sua alegria
pela invenção, o Rei disse: "Peça uma recompensa". Dahir al-Hindi pediu um 
dirhem (moeda  de  prata  utilizada  pelos  árabes  na  Idade  Média)  para  a  
primeira  casa  do  tabuleiro  e  que  fosse  dobrando progressivamente  este  
número  a  cada  uma  das  casinhas  restantes,  a  que  o  Rei  comentou:  
"Me  assombra  que  um  homem  como você, capaz de criar um jogo tão maravilhoso
, aceite recompensa tão pequena. Que receba o que pede". Faça um programa para 
calcular e exibir quantos dirhens devem ser pagos a Dahir al-Hindi.
 */
package lista16;
public class Exercicio3_lista16 {
    static double somartio(){
        double soma = 0;
        for (int i = 0; i < 64; i++)
            soma = soma + Math.pow(2, i);
        return soma;
    }
    
    public static void main(String[] args) {
        System.out.println("Soma: "+somartio());
    }
}
