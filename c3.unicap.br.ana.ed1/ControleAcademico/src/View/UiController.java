/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;

/**
 * FXML Controller class
 *
 * @author home
 */
public class UiController implements Initializable {

    @FXML
    private BorderPane borderpane;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void fecha_app(MouseEvent event) {
        System.exit(0);
    }

    @FXML
    private void ui_dashboard(MouseEvent event) {
        carregaUI("ui1");
    }

    @FXML
    private void ui_alunos(MouseEvent event) {
        carregaUI("ui2");
    }

    @FXML
    private void ui_professor(MouseEvent event) {
        carregaUI("ui3");
    }

    @FXML
    private void ui_disciplina(MouseEvent event) {
    }

    @FXML
    private void ui_turma(MouseEvent event) {
    }
    
    @FXML
    private void clear(MouseEvent event){
        borderpane.setCenter(null);
    }
    
    private void carregaUI(String UI){
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource(UI+".fxml"));
        } catch (IOException ex) {
            Logger.getLogger(UiController.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.borderpane.setCenter(root);
    }
    
}
