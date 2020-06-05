/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.ui;

import app.SQLiteCrudApp;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

/**
 * FXML Controller class
 *
 * @author home
 */
public class LoginController implements Initializable {

    private double xOffset = 0;
    private double yOffset = 0;
    
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
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        makeStageDrageable();
    }    
    
    @FXML
    private void open_registration(MouseEvent event) throws IOException {
        Parent fxml = FXMLLoader.load(getClass().getResource("RegistrationUi.fxml"));
        content_area.getChildren().removeAll();
        content_area.getChildren().setAll(fxml);
    }

    @FXML
    private void close_app(MouseEvent event) {
        System.exit(0);
    }

    private void makeStageDrageable() {
        parent.setOnMousePressed(event -> {
            xOffset = event.getSceneX();
            yOffset = event.getSceneY();
        });
        parent.setOnMouseDragEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event){
                SQLiteCrudApp.stage.setX(event.getScreenX() - xOffset);
                SQLiteCrudApp.stage.setY(event.getSceneY() - yOffset);
                SQLiteCrudApp.stage.setOpacity(0.7f);
            }
        });
        parent.setOnDragDone(e ->{
            SQLiteCrudApp.stage.setOpacity(1.0f);
        });
        parent.setOnMouseReleased(e -> {
            SQLiteCrudApp.stage.setOpacity(1.0f);
        });
    }

    @FXML
    private void entrar(MouseEvent event) throws IOException {
        String user = this.cpf.getText();
        String pass = this.senha.getText();
        System.out.println("User:"+user+"\npass:"+pass);
        if(user.equals("admin") && pass.equalsIgnoreCase("admin")){
            System.out.println("Logado");
            Parent root = FXMLLoader.load(getClass().getResource("/app/ui/app.fxml"));
            parent.getChildren().removeAll();
            parent.getChildren().setAll(root);
            
        }else{
            System.out.println("Erro.");
        }
    }
    
}
