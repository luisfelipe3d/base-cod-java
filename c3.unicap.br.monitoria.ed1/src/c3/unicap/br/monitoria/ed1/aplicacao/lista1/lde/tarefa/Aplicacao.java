/*
Questão única: Imagine a seguinte situação: um funcionário de uma empresa 
organiza a lista de suas tarefas por ordem decrescente de prioridade. 
Sempre que ele vai escolher uma nova tarefa para executar, ele pega a primeira
tarefa da lista, ou seja, a de prioridade mais alta. Quando enviam a ele uma
nova tarefa, ele a insere na lista, de acordo com a prioridade da mesma. 
Observe que é possível ter várias tarefas com a mesma prioridade. Neste caso, 
o critério utilizado para ordenação de tarefas de mesma prioridade é a ordem 
de chegada das tarefas. Ou seja, quando chega uma tarefa de prioridade já existente,
ela é inserida após as tarefas de prioridade igual. Implemente um programa, 
para controlar a lista de tarefas deste funcionário. A lista de tarefas do
funcionário deve ser implementada utilizando uma lista duplamente encadeada. 
Cada nó da lista deve armazenar uma tarefa. Sobre uma tarefa matem-se as 
seguintes informações: a descrição e a prioridade da tarefa. A prioridade da 
tarefa deve ser um número inteiro de um a dez. O programa deve fornecer as
seguintes funcionalidades:
(a) Inserir uma nova tarefa na lista na posição correta de acordo com sua 
prioridade. Não pode existir na lista mais de uma tarefa com a mesma descrição;
(b) Dada a descrição de uma tarefa, procurá-la na lista e, caso encontre, 
informar quantas tarefas existem para serem executadas antes dela. Caso não 
encontre a tarefa procurada, o usuário deve ser informado;
(c) Executar a tarefa que está na vez, o que é representado removendo a tarefa 
da lista para simbolizar que ela foi executada. Lembre-se que o funcionário 
sempre executa a tarefa de mais alta prioridade;
(d) Dada a descrição de uma tarefa, cancelar a sua execução, ou seja, removê-la
da lista de tarefas a serem executadas;
(e) Exibir a descrição de todas as tarefas que possuem uma dada uma prioridade,
informando também quantas são ao todo;
(f) Exibir a descrição e a prioridade de todas as tarefas cadastradas;
(g) Dada a descrição de uma tarefa, alterar sua prioridade. Isso vai implicar
em alteração da posição
da tarefa dentro da lista;
OBS1: Implemente um menu e um loop no programa principal para permitir que o 
usuário execute as funcionalidades definidas nos itens de (a) e (g) quantas 
vezes desejar.
OBS2: O programador é livre para implementar outros procedimentos/funções 
auxiliares que julgue necessário.
OBS3: O programa deverá validar a prioridade da tarefa para ser um valor 
inteiro de 1 a 10.
OBS4: Este programa irá utilizar cinco classes: LDENode, LDE, Tarefa,
CadastroTarefas e a classe
ControleDeTarefa (aplicação).
 */
package c3.unicap.br.monitoria.ed1.aplicacao.lista1.lde.tarefa;

import java.util.Scanner;

/**
 *
 * @author home
 */
public class Aplicacao {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opcao = 0, entrada;
        
        do{
            menu();
            System.out.print("Opção: ");
            opcao = in.nextInt();
            
            switch (opcao) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }while(opcao != 0);
    }
    
    public static void menu(){
        System.out.println("1. Cadastrar nova tarefa");
        System.out.println("2. Procurar descricao");
        System.out.println("3. Executar tarefa");
        System.out.println("4. Remover tarefa");
        System.out.println("5. Buscar por prioridade");
        System.out.println("6. Mostrar todas as tarefas");
        System.out.println("7. Alterar prioridade da tarefa");
        System.out.println("0. Sair");
    }
}
