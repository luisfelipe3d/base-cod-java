package totem;

import java.util.Scanner;

import administrativo.Loja;
import administrativo.Usuario;

public class InterfaceAdministrativa {

    Scanner in = new Scanner(System.in);
    Loja mercado;

    public InterfaceAdministrativa(Loja mercado) {
        this.mercado = mercado;
    }

    public void menu() {
        System.out.print("ÁREA ADMINISTRATIVA \n"
                + "1. Efetuar login \n"
                + "0. Sair\n"
                + "Opção: ");
        int op = in.nextInt();
        in.nextLine();

        switch (op) {
            case 0:
                break;
            case 1:
                System.out.println("Informe seu login: ");
                String login = in.nextLine();
                System.out.println("Informe sua senha: ");
                String senha = in.nextLine();

                Usuario usuario = efetuarLogin(login, senha);

                if (usuario != null) {
                    System.out.println("Bem-vindo " + usuario.getNome());
                    System.out.println("1- Cadastrar novo produto \n"
                            + "2- Reabastecer estoque \n"
                            + "0- Sair");
                    int opcao = in.nextInt();

                    switch (opcao) {
                        case 0:
                            break;

                        case 1:
                            //cadastrar novo produto
                            break;

                        case 2:
                            //reabastecer estoque
                            break;

                        default:
                            System.out.println("Opção inválida!");

                    }
                }
        }
    }

    public Usuario efetuarLogin(String login, String senha) {
        return mercado.validarLogin(login, senha);
    }

}
