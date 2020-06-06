package aplicacao;

import java.util.Scanner;

import administrativo.Administrador;
import administrativo.Loja;
import administrativo.Usuario;
import estoque.Produto;
import totem.*;

public class Aplicacao {

    static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        int opcao = menuInicial();
        int menuCliente;
        int menuAdministrativo;
        
        Loja mercado = new Loja("10.847.721/0001-95", "Coronga-Market", "Rua Recife, 100");
        Usuario admin = new Administrador("000.000.000-00", "José Bezerra", "90000-0000", "admin", "admin", "rochedo");
        mercado.addUsuario(admin);

        Produto refrigerante = new Produto("Coca-Cola 2L", "Coca-Cola", "Refrigerante sabor cola", 7);
        mercado.getEstoque().cadastrarProduto(refrigerante);
        refrigerante.setCodigo(mercado.getEstoque().getProdutos().indexOf(refrigerante));

        Produto bolo = new Produto("Bolo de Rolo 500G", "Do Sertão", "Bolo típico pernambucano", 10);
        mercado.getEstoque().cadastrarProduto(bolo);
        bolo.setCodigo(mercado.getEstoque().getProdutos().indexOf(bolo));

        Produto arroz = new Produto("Arroz Integral 1KG", "Tio João", "Arroz integral", 10.5);
        mercado.getEstoque().cadastrarProduto(arroz);
        arroz.setCodigo(mercado.getEstoque().getProdutos().indexOf(arroz));

        //Scanner in = new Scanner(System.in);
        TotemPedidos totemPedidos = new TotemPedidos(mercado);
        InterfaceAdministrativa interfaceAdm = new InterfaceAdministrativa(mercado);
        do{
            switch (opcao) {
            case 1:
                //TODO mudar para uma forma melhor
//                menuCliente = menuCliente();
//                if(menuCliente == 1){
//                    System.out.println("Efetuar Login Cliente");
//                }else if (menuCliente == 2){
//                    System.out.println("Cadastro Cliente");
//                }else if (menuCliente == 3){
//                    System.out.println("Saindo.. Cliente");
//                }else{
//                    System.out.println("Inválido MenuCliente()");
//                }
                totemPedidos.menu();
                break;
            case 2:
                //TODO mudar para uma forma melhor
//                menuAdministrativo = menuAdministrativo();
//                if(menuAdministrativo == 1){
//                    System.out.println("Efetuar Login Cliente");
//                }else if (menuAdministrativo == 2){
//                    System.out.println("Cadastro Cliente");
//                }else if (menuAdministrativo == 3){
//                    System.out.println("Saindo.. Cliente");
//                }else{
//                    System.out.println("Inválido MenuCliente()");
//                }
                interfaceAdm.menu();
                break;
            default:
                System.out.println("Opção inválida!");
                menuInicial();
            }
        }while (opcao != 3);

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
        System.out.println("BEM VINDO AO CORONGA-MARKET!");
        System.out.print("Escolha a opção desejada: \n"
                    + "1. Efetuar login \n"
                    + "2. Realizar cadastro \n"
                    + "3. Sair\n"
                    + "Opção: ");
        opcao = in.nextInt();in.nextLine();
        return opcao;
    }
    
    public static int menuAdministrativo(){
        int opcao;
        System.out.print("ÁREA ADMINISTRATIVA \n"
                + "1. Efetuar login \n"
                + "2. Sair\n"
                + "Opção: ");
        opcao = in.nextInt();in.nextLine();
        return opcao;
    }
    
    
}
