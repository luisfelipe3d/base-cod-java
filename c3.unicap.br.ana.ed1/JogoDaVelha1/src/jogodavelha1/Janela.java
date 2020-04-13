/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogodavelha1;

import java.io.File;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 *
 * @author home
 */
public class Janela extends Application {
    Jogo jg;
    Button bts[][] = new Button[3][3];
    Jogador p1;
    Jogador p2;
    Label placar = new Label("Placar");
    Label placarP1 = new Label();
    Label placarP2 = new Label();
    Label versao = new Label("Versão 1.0");
    
    @Override
    public void start(Stage primaryStage) {
        //Janela
        BorderPane root = new BorderPane();
        
        root.setTop(barraSup()); //OK
        root.setCenter(tabuleiro()); //Ok
        root.setLeft(barraEsq(this.placar, this.placarP1, this.placarP2)); // OK
        root.setBottom(barraInf(this.versao)); // OK
        
        Scene scene = new Scene(root, 500, 450);
        
        primaryStage.setTitle("Jogo da Velha");
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    public VBox barraSup() {
        
        MenuBar menuBar = new MenuBar();
        
        Menu arquivo = new Menu("Arquivo");
        
        MenuItem novoJogo = new MenuItem("Novo Jogo");
        novoJogo.setAccelerator(KeyCombination.keyCombination("Ctrl+N"));
        novoJogo.setOnAction(e -> {
            //NovoJogo();
            System.out.println("Novo jogo");
        });
        MenuItem carregarJogo = new MenuItem("Carregar Jogo");
        carregarJogo.setAccelerator(KeyCombination.keyCombination("Ctrl+O"));
        carregarJogo.setOnAction(e -> {
            carregarJogo();
            System.out.println("Carregando Jogo");
        });
        MenuItem salvarJogo = new MenuItem("Salvar Jogo");
        salvarJogo.setAccelerator(KeyCombination.keyCombination("Ctrl+S"));
        salvarJogo.setOnAction(e -> {
            //salvarJogo();
            System.out.println("Salvar jogo");
        });
        arquivo.getItems().addAll(novoJogo, carregarJogo, salvarJogo);
        
        Menu ajuda = new Menu("Ajuda");
        MenuItem sobre = new MenuItem("Sobre");
        sobre.setAccelerator(KeyCombination.keyCombination("Ctrl+K"));
        sobre.setOnAction(e -> {
            sobreJogo();
            System.out.println("Sobre o jogo");
        });
        ajuda.getItems().add(sobre);
        
        menuBar.getMenus().addAll(arquivo, ajuda);
        
        TextField jogador1 = new TextField();
        jogador1.setPromptText("Jogador1");
        TextField jogador2 = new TextField();
        jogador2.setPromptText("Jogador2");
        
        Button iniciar = new Button("Iniciar");
        iniciar.setOnAction(e -> {
            System.out.println(jogador1.getText());
            System.out.println(jogador2.getText());
            
            Jogador p1 = new Jogador(jogador1.getText());
            this.placarP1.setText(p1.toString());
            
            Jogador p2 = new Jogador(jogador2.getText());
            this.placarP2.setText(p2.toString());
            
            this.jg = new Jogo(p1,p2);
            
            ativarTabuleiro();
            
        });
        
        Button salvar = new Button("Salvar");
        
        VBox vbox = new VBox(menuBar);
        HBox hbox = new HBox(5);
        
        hbox.getChildren().addAll(jogador1, jogador2, iniciar, salvar);
        
        vbox.getChildren().add(hbox);
        return vbox;
    }
    
    public GridPane tabuleiro() {
        GridPane tabuleiro = new GridPane();
        tabuleiro.setHgap(10);
        tabuleiro.setVgap(10);
        tabuleiro.setPadding(new Insets(5, 5, 5, 5));
        
        for (int i = 0; i < bts.length; i++) {
            for (int j = 0; j < bts.length; j++) {
                bts[i][j] = new Button("");
                //bta[i][j]
                bts[i][j].setFont(new Font("Arial", 60));
                bts[i][j].setMinSize(100, 100);
                bts[i][j].setMaxSize(100, 100);
                bts[i][j].setDisable(true);
                tabuleiro.add(bts[i][j], j, i);
            }
        }
        tabuleiro.setAlignment(Pos.CENTER_RIGHT);
        return tabuleiro;
    }
    
    public VBox barraEsq(Label l1, Label l2, Label l3) {
        VBox vbox = new VBox(10);
        vbox.setPadding(new Insets(10, 50, 50, 50));
        vbox.setSpacing(10);
        vbox.getChildren().addAll(l1, l2, l3);
        return vbox;
    }
    
    public HBox barraInf(Label l1) {
        HBox hbox = new HBox();
        versao.setAlignment(Pos.CENTER_LEFT);
        hbox.getChildren().add(l1);
        return hbox;
    }
    
    public void ativarTabuleiro() {        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                bts[i][j].setDisable(false);
            }
        }
    }
   
    public void carregarJogo(){
        FileChooser fc = new FileChooser();
        fc.getExtensionFilters().add(new FileChooser.ExtensionFilter("JogoVelha", "*.jv"));
        File f = fc.showOpenDialog(null);
        if (f != null) {
            System.out.println("Qualquer coisa do arquivo: " 
                    + f.getAbsolutePath());
        }
    } 
    
    public void sobreJogo(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        final String title = "Sobre o jogo";
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText("Versão 1.0");
        alert.showAndWait();
    }
    
}


