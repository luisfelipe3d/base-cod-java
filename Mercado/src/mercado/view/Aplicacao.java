
package mercado.view;

import java.util.Scanner;
import mercado.Interface.IFachada;
import mercado.controller.Fachada;
import mercado.model.UsuarioCliente;

public class Aplicacao {
    private static IFachada fachada = new Fachada();
    
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int menuIni = menuInicial();
        int menuCli, menuAdm, menuCliAuth;
        String nome,telefone,cpf,senha;
        
        do{
            switch(menuIni){
                case 1:
                menuCli = menuCliente();
                if(menuCli == 1){
                    System.out.println("Efetuar Login Cliente");
                    System.out.println("CPF:");
                    cpf = in.nextLine();
                    System.out.println("Senha:");
                    senha = in.nextLine();
                    System.out.println(fachada.loginCliente(cpf, senha));
                    if(fachada.loginCliente(cpf, senha)){
                        menuCliAuth = menuClienteAutenticado();
                    }
                }else if (menuCli == 2){
                    System.out.println("Cadastro Cliente");
                    System.out.println("CPF:");
                    cpf = in.nextLine();
                    System.out.println("Nome:");
                    nome = in.nextLine();
                    System.out.println("Telefone:");
                    telefone = in.nextLine();
                    System.out.println("Senha:");
                    senha = in.nextLine();
                    UsuarioCliente novoCliente = new UsuarioCliente(cpf, nome, telefone, senha);
                    System.out.println(fachada.cadastrarCliente(novoCliente));
                    
                }else if (menuCli == 3){
                    System.out.println("Saindo.. Cliente");
                    
                }else{
                    System.out.println("Inválido MenuCliente()");
                }
                break;
            case 2:
                menuAdm = menuAdministrativo();
            switch (menuAdm) {
                case 1:
                    System.out.println("Efetuar Login ADM");
                    System.out.println("CPF:");
                    cpf = in.nextLine();
                    System.out.println("Senha:");
                    senha = in.nextLine();
                    fachada.loginAdministrador(cpf, senha);
                    break;
                case 2:
                    System.out.println("Cadastro ADM");
                    System.out.print("Nome: ");
                    nome = in.nextLine();
                    System.out.print("CPF: ");
                    cpf = in.nextLine();
                    System.out.print("Telefone: ");
                    telefone = in.nextLine();
                    System.out.print("Senha: ");
                    senha = in.nextLine();
                    
                    break;
                case 3:
                    System.out.println("Saindo.. ADM");
                    menuIni = menuInicial();
                    break;
                default:
                    System.out.println("Inválido MenuADM()");
                    break;
            }
                break;
            default:
                System.out.println("Opção inválida!");
                menuIni = menuInicial();
            }
            
        }while(menuIni != 3);
    }
    
    public static int menuInicial(){
        int opcao;
        System.out.print("Mercado Intelejumento v1.0\n"
                + "1. Àrea do Cliente\n"
                + "2. Área do Administrador\n"
                + "Opção: ");
        opcao = in.nextInt();in.nextLine();
        return opcao;
    }
    
    public static int menuCliente(){
        int opcao;
        System.out.println("Área do cliente. \n");
        System.out.print("Escolha a opção desejada: \n"
                    + "1. Efetuar login \n"
                    + "2. Realizar cadastro \n"
                    + "3. Sair\n"
                    + "Opção: ");
        opcao = in.nextInt();in.nextLine();
        return opcao;
    }
    
    public static int menuClienteAutenticado(){
        int opcao;
        System.out.println("Área do cliente.");
        System.out.print("Escolha a opção: \n"
                + "1. Visualizar catálogo. \n"
                + "2. Adicionar item ao carrinho. \n"
                + "3. Remover item do carrinho. \n"
                + "4. Visualizar carrinho. \n"
                + "Opção: ");
        opcao = in.nextInt();in.nextLine();
        return opcao;
    }
    
    public static int menuAdministrativo(){
        int opcao;
        System.out.print("Área do Administrador \n"
                + "1. Efetuar login \n"
                + "2. Cadastrar Administrador\n"
                + "3. Sair\n"
                + "Opção: ");
        opcao = in.nextInt();in.nextLine();
        return opcao;
    }
    
}
