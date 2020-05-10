/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author home
 */
public class UiController implements Initializable {


    private Label label;
    
    private void handleButtonAction(ActionEvent event){
        System.out.println("You clicked me!");
        label.setText("Ola mundo");
        Node nd = (Node) (event.getSource());
        Stage stage = (Stage) nd.getScene().getWindow();
        Parent ui2;
        
        try {
            ui2 = FXMLLoader.load(getClass().getResource("/View/ui2.fxml"));
            Scene scene = new Scene(ui2);
        } catch (IOException ex) {
            Logger.getLogger(UiController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
