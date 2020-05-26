/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle.academico.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import controle.academico.aplicacao.Aplicacao;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

/**
 * FXML Controller class
 *
 * @author home
 */
public class UiLogin implements Initializable {

    @FXML
    private AnchorPane parent;
    @FXML
    private Pane content_area;
    @FXML
    private JFXTextField cpf;
    @FXML
    private JFXPasswordField senha;
    @FXML
    private JFXButton btnEnter;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void entrar(MouseEvent event) {
        String user = this.cpf.getText();
        String pass = this.senha.getText();
        Aplicacao.users.forEach(User -> {
            if(User.getLogin().equals(user) && User.getSenha().equals(pass)){
                ui_dashboard(event);
            }
        });
    }

    @FXML
    private void open_registration(MouseEvent event) {
        Parent fxml = null;
        try {
            fxml = FXMLLoader.load(getClass().getResource("/controle/academico/view/RegistrationUi.fxml"));
            content_area.getChildren().removeAll();
            content_area.getChildren().setAll(fxml);
        } catch (IOException ex) {
            Logger.getLogger(UiPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @FXML
    private void close_app(MouseEvent event) {
        System.exit(0);
    }

    private void ui_dashboard(MouseEvent event) {
        BorderPane pane = null;
        try {
           pane = FXMLLoader.load(getClass().getResource("/controle/academico/view/ui_Principal.fxml"));
           parent.getChildren().removeAll();
           this.content_area.getChildren().removeAll(); 
           Scene scene = new Scene(pane);
           Aplicacao.stage.setScene(scene);
           Aplicacao.stage.show();
        } catch (IOException ex) {
            Logger.getLogger(UiPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
