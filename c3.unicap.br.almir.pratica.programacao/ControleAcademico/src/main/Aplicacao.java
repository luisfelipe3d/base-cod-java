/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.IOException;
import java.util.Date;
import java.util.Scanner;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
/**
 *
 * @author home
 */
public class Aplicacao extends Application {
    
    private double x;
    private double y;

    static Scanner in = new Scanner(System.in);
    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/View/ui.fxml"));
        Scene scene = new Scene(root);
        scene.setFill(Color.TRANSPARENT);
        root.setOnMouseClicked((MouseEvent event) -> {
            x = event.getSceneX();
            y = event.getSceneY();
        });

        root.setOnMouseDragged((MouseEvent event) -> {
            primaryStage.setX(event.getSceneX() - x);
            primaryStage.setY(event.getSceneY() - y);
        });
        primaryStage.setScene(scene);
        primaryStage.initStyle(StageStyle.TRANSPARENT);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
//        Aluno a1,a2,a3,a4,a5,a6,aux;
//        Endereco en1,en2,en3,en4,en5,en6;
//        Date date = new Date();
//        ControleAcademico listaAlunos;
//        listaAlunos = new ControleAcademico();
//        int opcao;
//        en1 = new Endereco("AP","Macapá","Avenida Quatorze de Julho","24","68904-730","");
//        en2 = new Endereco("ES","Linhares","Avenida Vasco Fernandes Coutinho","34","29903-192","");
//        en3 = new Endereco("PB","Bayeux","Rua Firmino Coutinho","124","58306-030","");
//        en4 = new Endereco("SC","Florianópolis","Rua Deputado Walter Gomes","67","88050501","");
//        en5 = new Endereco("PA","Altamira","Rua Raimundo Oliveira","98","68372612","");
//        en6 = new Endereco("PE","Recife","Rua Pio IX","435","50710265","");
//        
//        a1 = new Aluno("082.194.550-55","João","NS10",date.toString(), true, "81 99123-4443", "teste@teste.com", en1);
//        a2 = new Aluno("550.975.830-94","Rafa","BK34",date.toString(),true,"11 98124-2341","rafa@unicap.br",en2);
//        a3 = new Aluno("676.743.930-46","Maria","SF20",date.toString(),false,"41 98443-9807","maria@live.com",en3);
//        a4 = new Aluno("382.520.140-62","Carla","VS64",date.toString(),false,"51 98234-0098","carla@gmail.com",en4);
//        a5 = new Aluno("744.236.600-75","Valter","PQ78",date.toString(),true,"35 98123-7835","valter@uol.com.br",en5);
//        a6 = new Aluno("662.883.980-04","Aline","FIFI",date.toString(),false,"81 98844-1111","fifi@fifi.com.br",en6);
//        
//        listaAlunos.cadastrar(a1);
//        listaAlunos.cadastrar(a2);
//        listaAlunos.cadastrar(a3);
//        listaAlunos.cadastrar(a4);
//        listaAlunos.cadastrar(a5);
//        listaAlunos.cadastrar(a6);
       /* 
        do{
            opcao = menu();
            switch(opcao){
                case 1:
                    //Cadastrar novo aluno
                    break;
                case 2:
                    //alterar dados de um aluno
                    break;
                case 3:
                    //exibir dados de um aluno
                    break;
                case 4:
                    //remover um aluno
                    break;
                case 5:
                    //listar todos alunos
                    break;
                case 6:
                    //buscar aluno cpf
                    break;
                case 0:
                    System.out.println("FIM PROGRAMA");
                default:
                    System.err.println("Opção inválida.");
            }
            
        }while(opcao != 0);
        */
        
//        System.out.println("Teste ForEach com lambda");
//        listaAlunos.listarTodos();
//        System.out.println("Fim ForEach lambda");
//        
//        System.out.println("Teste ForEach");
//        listaAlunos.listarTodos1();
//        System.out.println("Fim forEach");
//        
//        System.out.println("Teste vetor com .size");
//        listaAlunos.listarTodos2();
//        System.out.println("Fim teste vetor .size");
//        
//        System.out.println("Teste vetor com int size");
//        listaAlunos.listarTodos3();
//        System.out.println("Fim teste vetor int size");
//        
//        System.out.println("Test vetor decremeto");
//        listaAlunos.listarTodos4();
//        System.out.println("Fim vetor decremento");
        //listaAlunos.listarTodos();
       // listaAlunos.salvarLista();
        
        //listaAlunos.carregarLista();
        //System.out.println(a1.toString());
    }
    
    /*public static int menu(){
        System.out.println("Menu");
        System.out.println("1. Cadastrar Aluno");
        System.out.println("2. Alterar dados de um aluno");
        System.out.println("3. Exibir dados de um aluno");
        System.out.println("4. Remover aluno");
        System.out.println("5. Listar todos os alunos");
        System.out.println("6. Buscar aluno");
        System.out.println("0. Sair");
        System.out.print("Opção: ");
        int opcao = in.nextInt();
        in.nextLine();
        return opcao;
    }*/
}
