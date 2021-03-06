/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogodavelha1;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCombination;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Janela extends Application {
    BorderPane root = new BorderPane();
    GridPane tabuleiro = new GridPane();
    Alertas alt = new Alertas();
    Button bts[][] = new Button [3][3];
    Jogador p1 = new Jogador();
    Jogador p2 = new Jogador();
    Label versao = new Label("Versão 1.0");
    Jogo jg;
    String simbolo;
    boolean vezJogador; 
    
    @Override
    public void start(Stage primaryStage) {
        root.setOnKeyPressed(e -> {
            keyPressed(e);
        });
        root.setTop(barraSup());
        root.setCenter(tabuleiro());
        root.setBottom(barraInf(this.versao));
        Scene scene = new Scene(root, 500, 450);
        primaryStage.setTitle("Jogo da Velha");
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
    
    public VBox barraSup() {
        MenuBar menuBar = new MenuBar();
        Menu arquivo = new Menu("Arquivo");
        MenuItem novoJogo = new MenuItem("Novo Jogo");
        novoJogo.setAccelerator(KeyCombination.keyCombination("Ctrl+N"));
        novoJogo.setOnAction(e -> {
            limparTabuleiro();
            System.out.println("Novo jogo");
        });
        MenuItem carregarJogo = new MenuItem("Carregar Jogo");
        carregarJogo.setAccelerator(KeyCombination.keyCombination("Ctrl+O"));
        carregarJogo.setOnAction(e -> {
           carregarJogo();
        });
        MenuItem salvarJogo = new MenuItem("Salvar Jogo");
        salvarJogo.setAccelerator(KeyCombination.keyCombination("Ctrl+S"));
        salvarJogo.setOnAction(evt -> {
            try{
                jg.salvarJogo();
            } catch(Exception err){
                err.addSuppressed(err);
            }
        });
        arquivo.getItems().addAll(novoJogo, carregarJogo, salvarJogo);
        
        Menu ajuda = new Menu("Ajuda");
        MenuItem sobre = new MenuItem("Sobre");
        sobre.setAccelerator(KeyCombination.keyCombination("Ctrl+K"));
        sobre.setOnAction(e -> {
            alt.sobre();
        });
        ajuda.getItems().add(sobre);
        menuBar.getMenus().addAll(arquivo, ajuda);
        
        TextField jogador1 = new TextField();
        jogador1.setPromptText("Jogador1");
        
        TextField jogador2 = new TextField();
        jogador2.setPromptText("Jogador2");
        
        Button iniciar = new Button("Iniciar");
        iniciar.setOnAction(e -> {
            iniciarJogo(jogador1, jogador2);
        });
        iniciar.setAlignment(Pos.BOTTOM_CENTER);
        
        Button salvar = new Button("Salvar");
        salvar.setOnAction(e ->{
            jg.salvarJogo();
        });
        
        VBox vbox = new VBox(menuBar);
        HBox hbox = new HBox(5);
        //hbox.setAlignment(Pos.CENTER_RIGHT);
        hbox.getChildren().addAll(jogador1, jogador2, iniciar, salvar);
        
        vbox.getChildren().add(hbox);
        return vbox;
    }
    
    public GridPane tabuleiro() { 
        tabuleiro.setHgap(10);
        tabuleiro.setVgap(10);
        tabuleiro.setPadding(new Insets(5, 5, 5, 5));
        
        for (int linha = 0; linha < bts.length; linha++) {
            for (int coluna = 0; coluna < bts.length; coluna++) {
                bts[linha][coluna] = new Button(" ");
                bts[linha][coluna].setFont(new Font("Arial", 30));
                bts[linha][coluna].setStyle("-fx-background-color: -fx-outer-border,"
                        + "-fx-inner-border, -fx-body-color;\n"
                        + "-fx-background-insets: 0, 1, 2;\n"
                        + "-fx-background-radius: 5, 4, 3;");
                bts[linha][coluna].setMinSize(100, 100);
                bts[linha][coluna].setMaxSize(100, 100);
                bts[linha][coluna].setDisable(true);
                tabuleiro.add(bts[linha][coluna], coluna, linha);
            }
        }
        tabuleiro.setAlignment(Pos.CENTER_RIGHT);
        return tabuleiro;
    }
      
    public HBox barraInf(Label l1) {
        HBox hbox = new HBox();
        versao.setAlignment(Pos.CENTER_LEFT);
        hbox.getChildren().add(l1);
        return hbox;
    }
    
    private void ativarTabuleiro() {        
        
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                bts[linha][coluna].setDisable(false);
            }
        }
        ativarJogada();
        
    }
   
    public void ativarJogada(){
        bts[0][0].setOnAction(e ->{
            Jogada(0,0);
        });
        bts[0][1].setOnAction(e ->{
            Jogada(0,1);
        });
        bts[0][2].setOnAction(e ->{
            Jogada(0,2);
        });
        bts[1][0].setOnAction(e ->{
            Jogada(1,0);
        });
        bts[1][1].setOnAction(e ->{
            Jogada(1,1);
        });
        bts[1][2].setOnAction(e ->{
            Jogada(1,2);
        });
        bts[2][0].setOnAction(e ->{
            Jogada(2,0);
        });
        bts[2][1].setOnAction(e ->{
            Jogada(2,1);
        });
        bts[2][2].setOnAction(e ->{
            Jogada(2,2);
        });
    }
    
    public void Jogada(int linha, int coluna) { 
        jg.Jogada(linha, coluna);
        if (vezJogador) {
            simbolo = "O";
            vezJogador = false;     
        } else {
            simbolo = "X";
            vezJogador = true;     
        }
        bts[linha][coluna].setText(simbolo);
        bts[linha][coluna].setDisable(true);
        
        int vencedor = jg.verificaVencedor();
        verificaVencedor(vencedor);
    }
    
    public void limparTabuleiro(){
        tabuleiro.getChildren().clear();
        tabuleiro();
        ativarTabuleiro();
        jg.limparMatriz();
    }
    
    public void verificaVencedor(int v){
        //Retorna jogador 1 = 1; jogador 2 = 2; velha = 3; continua = 4;
        switch(v){
            case 1:
                alt.quemVenceu(v, jg.p1, jg.p2, jg.ePrimeiroJogador);
                alt.placar(jg.p1, jg.p2);
                limparTabuleiro();
                break;
            case 2:
                alt.quemVenceu(v, jg.p1, jg.p2, jg.ePrimeiroJogador);
                alt.placar(jg.p1, jg.p2);
                limparTabuleiro();
                break;
            case 3:             
                alt.quemVenceu(v, jg.p1, jg.p2, jg.ePrimeiroJogador);
                alt.placar(jg.p1, jg.p2);
                limparTabuleiro();
                break;
            case 4:
                break;
            default:
                System.err.println("opção inválida. - verificaVencedor()");
        }
        
    }
    
    public void keyPressed(KeyEvent event) {
        if (event.getCode().equals(KeyCode.ENTER)) {
            //iniciarJogo();
        } else if (event.getCode().equals(KeyCode.ESCAPE)) {
            System.exit(0);
        }
    }
    
    public void iniciarJogo(TextField jogador1, TextField jogador2){
        if(jogador1.getText().equals("") && jogador2.getText().equals("")){
                jg = new Jogo();
                this.p1 = jg.getP1();
                this.p2 = jg.getP2();
            }else{
                this.p1 = new Jogador(jogador1.getText());
                this.p2 = new Jogador(jogador2.getText());
            }
            this.jg = new Jogo(this.p1,this.p2);
            jg.defineJogador(this.p1, this.p2);
            this.vezJogador = jg.getPrimeiroJogador();
            alt.quemComeca(vezJogador, this.p1, this.p2);
            limparTabuleiro();
    }
    
    public void atualizarTabuleiro(){
        int rodada = 0;
        int [][] mtz = jg.getMatriz();
        
        System.out.println(jg.p1.toString());
        System.out.println(jg.p2.toString());
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                
                if(mtz[i][j] == 1){
                    bts[i][j].setText("X");
                    bts[i][j].setDisable(true);
                    rodada++;
                }else if(mtz[i][j] == -1){
                    bts[i][j].setText("O");
                    bts[i][j].setDisable(true);
                    rodada++;
                }
            }
        }
        jg.setRodadas(rodada);
        ativarJogada();
        int vencedor = jg.verificaVencedor();
        verificaVencedor(vencedor);
    }
    
    public void carregarJogo(){
         try {
            jg.carregarJogo();
        } catch (IOException ex) {
            Logger.getLogger(Janela.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Janela.class.getName()).log(Level.SEVERE, null, ex);
        }
         atualizarTabuleiro();
         
    }
}