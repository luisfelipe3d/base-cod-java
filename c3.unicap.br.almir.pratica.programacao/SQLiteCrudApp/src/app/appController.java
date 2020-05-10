/*
 Paleta de cores
https://flatuicolors.com/
Collection Ui
https://collectui.com/
 */
package app;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 *
 * @author home
 */
public class appController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
        Node nd = (Node) (event.getSource());
        Stage stage = (Stage) nd.getScene().getWindow();
        
        try {
            Parent app2 = FXMLLoader.load(getClass().getResource("/app/ui/app2.fxml"));
            Scene scene = new Scene(app2);
            stage.setScene(scene);
        } catch (IOException ex) {
            Logger.getLogger(appController.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Código para trocar de janelas
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
