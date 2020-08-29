package unicap.uber.view;

import java.util.List;
import java.util.Scanner;

import unicap.uber.controller.I_Uber;
import unicap.uber.controller.Uber;
import unicap.uber.exceptions.NumeroExisteException;
import unicap.uber.exceptions.PlacaExisteException;
import unicap.uber.model.Motorista;

public class Aplicacao {
	
	static Scanner s = new Scanner(System.in);
	
	private static int menu() {
		
		System.out.println("Menu");
		System.out.println("1 - Para Novo Motorista");
		System.out.println("2 - Para Novo Passageiro");
		System.out.println("3 - Solicitar Corrida");
		System.out.println("4 - Lista Motorista");
		System.out.println("5 - Lista Passageiros");
		int opcao = s.nextInt();
		s.nextLine();
		return opcao;
	}
	
	public static void main(String[] args) {
		I_Uber logica = new Uber();
		int opcao;
		do {
			opcao = menu();
			
			switch (opcao) {
			case 1: {
				System.out.println("Digite um nome");
				String nome = s.nextLine();
				System.out.println("Digite o modelo do carro");
				String modelo = s.nextLine();
				System.out.println("Digite um telefone");
				int telefone = s.nextInt();
				s.nextLine();
				System.out.println("Digite a placa do carro");
				int placa= s.nextInt();
				s.nextLine();
				try {
					logica.adicionaMotorista(nome, modelo, telefone, placa);
					System.out.println("Motorista cadastrado com sucesso");
				} catch (PlacaExisteException e1) {
					System.out.println("Placa já cadastrada "+e1.getPlaca());
				} catch (NumeroExisteException e2) {
					System.out.println("Número já cadastrado "+e2.getNumero());
				}
				break;
			}
			case 2: {
				System.out.println("Digite um nome");
				String nome = s.nextLine();
				System.out.println("Digite um telefone");
				int telefone = s.nextInt();
				s.nextLine();
				try {
					logica.adicionaPassageiro(nome, telefone, false);
					System.out.println("Passageiro cadastrado com sucesso");
				} catch (NumeroExisteException e) {
					System.out.println("Numero já cadastrado "+e.getNumero());
				}
				break;
			}
			case 3: {
				System.out.println("Digite o numero do telefone do passageiro");
				int telefone = s.nextInt();
				s.nextLine();
				System.out.println("A origem da viagem");
				String origem = s.nextLine();
				System.out.println("O destino da viagem");
				String destino = s.nextLine();
				double valor = logica.solicitarCorrida(telefone, origem, destino);
				System.out.println("Sua corrida vai custar "+valor);
				break;
			}
			case 4: {
				System.out.println("Lista de Motorista");
				
				List<String> m = logica.listarMotoristas();
				for (String umaMensagem : m) {
					System.out.println(umaMensagem);
				}
				break;
			}
			case 5: {
				System.out.println("Lista de Passageiros");
				
				List<String> m = logica.listarPassageiros();
				for (String umaMensagem : m) {
					System.out.println(umaMensagem);
				}
				break;
			}
			case 6: {
				System.out.println("Lista de Corridas");
				System.out.println("Digite o numero do telefone do usuários");
				int telefone = s.nextInt();
				s.nextLine();
				List<String> m = logica.listarCorridas(telefone);
				for (String umaMensagem : m) {
					System.out.println(umaMensagem);
				}
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + opcao);
			}
		}while (opcao != 10);
	}

}
