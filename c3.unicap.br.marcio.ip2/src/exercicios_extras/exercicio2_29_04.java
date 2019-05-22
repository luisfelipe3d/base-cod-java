/*
2.Dado 3 vetores de String contendo nomes de filmes 
vetor1:contém os filmes que você deseja assistir 
vetor2:contém todos os filmes disponíveis atualmente na Netflix 
vetor3:contém todos os filmes que estavam disponíveis na Netflix no mês passado
imprima as seguintes informações:
    Quais os novos filmes no catálogo
    Quais os filmes removidos do catálogo
    Quais os filmes da sua lista de desejos você pode assistir
    Quais os filmes da sua lista de desejos que você poderia ter assistido no 
    mês passado, mas não pode mais assistir.
link : vejasp.abril.com.br/blog/miguel-barbieri/
os-cem-melhores-filmes-de-2000-para-ca/
 */
package exercicios_extras;

public class exercicio2_29_04 {
    public static void main(String[] args) {
        
        String [] deseja_assisti = {"O Pianista", "O Segredo do Seus Olhos",
        "Longe do Paraíso", "Histórias que Contamos", "Guerra ao Terror"};
        
        String [] filmes_disp = {"A Origem", "A Assassina", "A Hora Mais Escura"
        , "Sob a Pele", "Os Excêntricos Tenenbaums", "O Cavalo de Turim"};
        
        String [] mes_passado_disp = {"O Retorno", "O Lobo de Wall Street",
            "Ela", "Longe do Paraíso", "O Cavalo de Turim"};
        
        info(deseja_assisti, filmes_disp, mes_passado_disp);
        String []saida = novosFilmes(filmes_disp, mes_passado_disp);
        
        System.out.print("Filmes novos: {");
        mostraVet(saida);
        
    }
    
    public static void info(String []str, String []str2, String []str3){
        int i, j;
        
        System.out.print("Novos filmes: {");
        for(i = 0; i < str2.length; i++){
            System.out.print(str2[i]+", ");
        } // Novos filmes no catálogo
        System.out.println("}");
        
        System.out.print("Filmes removidos: {");
        for(j = 0; j < str3.length; j++){
            System.out.print(str3[j]+", ");
        } // Filmes removidos
        System.out.println("}");
        
        
    }
    
    public static String [] novosFilmes(String []str2, String []str3){        
        int diff = Math.abs(str2.length - str3.length);
        int i, j, k=0;
        String [] result = new String [diff];
        
        for(i=0; i < str2.length; i++){
            
            for(j=0; j < str3.length; j++){
                if(str2[i].equalsIgnoreCase(str3[j])){
                    result[k] = str3[j];
                    k++;
                }
            }
        }
        return result;
    }
    
    public static void mostraVet(String []str){
        for(int i = 0; i < str.length; i++){
            System.out.print(str[i]+", ");
        }
        System.out.println("}");
    }
}
