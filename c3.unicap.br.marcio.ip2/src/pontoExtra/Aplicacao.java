package pontoExtra;
import java.util.Scanner;
public class Aplicacao{
    public static void main(String[] args){
        int qtd, op;
        Scanner in = new Scanner(System.in);
        System.out.println("Informe a quantidade de filmes que deseja cadastrar: ");
        qtd = in.nextInt();
        
        CadastroFilmes f1 = new CadastroFilmes(qtd);
        
        do{
            System.out.print("1- Cadastrar filme \n"
                    + "2- Consultar filme \n"
                    + "3- Remover filme \n"
                    + "4- Listar todos os filmes \n"
                    + "5- Listar filmes mais relevantes por categoria \n"
                    + "0- Sair \n"
                    + "Escolha a opção desejada: ");
            op = in.nextInt(); in.nextLine();
            
            switch(op){
                case 1:
                    String titulo, diretor, categoria;
                    int likes, dislikes;
                    System.out.println("Título: ");
                    titulo = in.nextLine();
                    System.out.println("Diretor: ");
                    diretor = in.nextLine();
                    System.out.println("Categoria; ");
                    categoria = in.nextLine();
                    Filme f2 = new Filme(titulo, diretor, categoria);
                    System.out.println("Quantidade de likes: ");
                    likes = in.nextInt();
                    f2.setLikes(likes);
                    System.out.println("Quantidade de dislikes: ");
                    dislikes = in.nextInt();
                    f2.setDislikes(dislikes);
                    f1.inserirOrdenado(f2);
                    break;
                case 2:
                    if(f1.isEmpty())
                        System.out.println("Nenhum filme cadastrado!");
                    else{
                        String nome;
                        Filme f;
                        System.out.println("Informe o título para consulta: ");
                        nome = in.nextLine();
                        f = f1.consulta(nome);
                        if(f == null)
                            System.out.println("Filme não cadastrado!");
                        else
                            System.out.println(f);
                    }
                    break;
                case 3:
                    if(f1.isEmpty())
                        System.out.println("Nenhum filme cadastrado!");
                    else{
                        System.out.println("Informe o título do filme a ser removido: ");
                        String t = in.nextLine();
                        f1.removerFilme(t);
                    }
                    break;
                case 4:
                    if(f1.isEmpty())
                        System.out.println("Nenhum filma cadastrado!");
                    else
                        f1.listarFilmes();
                    break;
                case 5:
                    //listar por categoria
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }while(op != 0);
    }
    
}
