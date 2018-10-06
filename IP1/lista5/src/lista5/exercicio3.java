/*
Recomendam-se estudantes para bolsas de estudo em função de
seu desempenho. A natureza das recomendações é baseada na
seguinte tabela: 
Média >= 9  / Altamente recomendado
Média 8<=Media<9    / Fortemente recomendado
Média 7<=Media<8    / Recomendado
Média < 7   / Não recomendado
Faça  um  programa  para  ler  a  média  de  um  aluno 
e  determinar  sua  recomendação.  O  programa  deverá
exibir  a  seguinte mensagem:  
O aluno é __________________. 
*/
package lista5;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class exercicio3 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        double media;
        
        //Receber media
        System.out.println("Digite sua média: ");
        media = in.nextDouble();
        
        if(media >=9)
            System.out.println("O aluno é Altamente Recomendado.");
        else if (media < 9 && media >= 8)
            System.out.println("O aluno é Fortemente Recomendado.");
        else if (media <8 && media >= 7)
            System.out.println("O aluno é recomendado.");
        else
            System.out.println("Aluno não recomendado.");
    }
}
