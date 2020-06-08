/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle.academico.controller;

import controle.academico.aplicacao.Aplicacao;
import controle.academico.model.Aluno;
import controle.academico.model.ControleAcademico;
import controle.academico.model.Endereco;
import java.io.IOException;
import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

/**
 * FXML Controller class
 *
 * @author home
 */
public class UiPrincipal implements Initializable {
    
    public static ControleAcademico logica;
    @FXML
    public BorderPane borderpane;
    @FXML
    private Label userName;
    @FXML
    private AnchorPane anchornit;

    public UiPrincipal() {
        logica = new ControleAcademico();
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Aluno a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12;
        Endereco en1,en2,en3,en4,en5,en6,en7,en8,en9,en10,en11,en12;
        Date date = new Date();
        en1 = new Endereco("AP","Macapá","Avenida Quatorze de Julho","24","68904-730","");
        en2 = new Endereco("ES","Linhares","Avenida Vasco Fernandes Coutinho","34","29903-192","");
        en3 = new Endereco("PB","Bayeux","Rua Firmino Coutinho","124","58306-030","");
        en4 = new Endereco("SC","Florianópolis","Rua Deputado Walter Gomes","67","88050501","");
        en5 = new Endereco("PA","Altamira","Rua Raimundo Oliveira","98","68372612","");
        en6 = new Endereco("PE","Recife","Rua Pio IX","435","50710265","");  
        a1 = new Aluno("082.194.550-55","João","NS10",date.toString(), 'M', "81 99123-4443", "teste@teste.com", en1);
        a2 = new Aluno("550.975.830-94","Rafa","BK34",date.toString(),'M',"11 98124-2341","rafa@unicap.br",en2);
        a3 = new Aluno("676.743.930-46","Maria","SF20",date.toString(),'F',"41 98443-9807","maria@live.com",en3);
        a4 = new Aluno("382.520.140-62","Carla","VS64",date.toString(),'F',"51 98234-0098","carla@gmail.com",en4);
        a5 = new Aluno("744.236.600-75","Valter","PQ78",date.toString(),'M',"35 98123-7835","valter@uol.com.br",en5);
        a6 = new Aluno("662.883.980-04","Aline","FIFI",date.toString(),'F',"81 98844-1111","fifi@fifi.com.br",en6);
        en7 = new Endereco("AP","Macapá","Avenida Quatorze de Julho","24","68904-730","");
        en8 = new Endereco("ES","Linhares","Avenida Vasco Fernandes Coutinho","34","29903-192","");
        en9 = new Endereco("PB","Bayeux","Rua Firmino Coutinho","124","58306-030","");
        en10 = new Endereco("SC","Florianópolis","Rua Deputado Walter Gomes","67","88050501","");
        en11 = new Endereco("PA","Altamira","Rua Raimundo Oliveira","98","68372612","");
        en12 = new Endereco("PE","Recife","Rua Pio IX","435","50710265","");  
        a7 = new Aluno("082.194.550-55","João","NS10",date.toString(), 'M', "81 99123-4443", "teste@teste.com", en7);
        a8 = new Aluno("550.975.830-94","Rafa","BK34",date.toString(),'M',"11 98124-2341","rafa@unicap.br",en8);
        a9 = new Aluno("676.743.930-46","Maria","SF20",date.toString(),'F',"41 98443-9807","maria@live.com",en9);
        a10 = new Aluno("382.520.140-62","Carla","VS64",date.toString(),'F',"51 98234-0098","carla@gmail.com",en10);
        a11 = new Aluno("744.236.600-75","Valter","PQ78",date.toString(),'M',"35 98123-7835","valter@uol.com.br",en11);
        a12 = new Aluno("662.883.980-04","Aline","FIFI",date.toString(),'F',"81 98844-1111","fifi@fifi.com.br",en12);
        
        UiPrincipal.logica.cadastrar(a1);
        UiPrincipal.logica.cadastrar(a2);
        UiPrincipal.logica.cadastrar(a3);
        UiPrincipal.logica.cadastrar(a4);
        UiPrincipal.logica.cadastrar(a5);
        UiPrincipal.logica.cadastrar(a6);
        UiPrincipal.logica.cadastrar(a7);
        UiPrincipal.logica.cadastrar(a8);
        UiPrincipal.logica.cadastrar(a9);
        UiPrincipal.logica.cadastrar(a10);
        UiPrincipal.logica.cadastrar(a11);
        UiPrincipal.logica.cadastrar(a12);
        //UiPrincipal.logica.salvarLista();
        //UiPrincipal.logica.carregarLista();

    }
    private void fecha_app(MouseEvent event) {
        System.exit(0);
    }
    @FXML
    private void ui_dashboard(MouseEvent event) {
        //carregaUI("ui_Principal.fxml");
        //this.borderpane.setCenter(anchornit);
    }
    @FXML
    private void ui_alunos(MouseEvent event) {
        carregaUI("ui_Aluno.fxml");
    }
    @FXML
    private void ui_professor(MouseEvent event) {
        carregaUI("ui3.fxml");
    }
 
    private void clear(MouseEvent event){
        borderpane.setCenter(null);
    }
    
    private void carregaUI(String UI){
        Parent root = null;
        try {
           root = FXMLLoader.load(getClass().getResource("/controle/academico/view/"+UI));
           this.borderpane.setCenter(root);
        } catch (IOException ex) {
            Logger.getLogger(UiPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void close_app(MouseEvent event) {
        fecha_app(event);
    }

    @FXML
    private void painelSair(MouseEvent event) {
        AnchorPane pane = null;
        try {
           pane = FXMLLoader.load(getClass().getResource("/controle/academico/view/login.fxml"));
           this.borderpane.getChildren().removeAll();
           //TODO ADICIONAR SALVAR TUDO ANTES DE SAIR
           Scene scene = new Scene(pane);
           Aplicacao.stage.setScene(scene);
           Aplicacao.stage.show();
        } catch (IOException ex) {
            Logger.getLogger(UiPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
}
