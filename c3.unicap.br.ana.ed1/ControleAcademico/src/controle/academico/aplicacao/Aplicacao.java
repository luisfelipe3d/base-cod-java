/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle.academico.aplicacao;

import controle.academico.model.UsuarioSistema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
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
    
    private double x, y;
    public static Stage stage = null;
    public static ArrayList<UsuarioSistema> users = new ArrayList<>();
    @Override
    public void start(Stage stage) {
        UsuarioSistema user1 = new UsuarioSistema("Luis","admin","admin","admin");
        users.add(user1);
        
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("/controle/academico/view/login.fxml"));
            Scene scene = new Scene(root);
            scene.setFill(Color.TRANSPARENT);
            stage.setScene(scene);
        } catch (IOException ex) {
            Logger.getLogger(Aplicacao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        this.stage = stage;
        
        
        root.setOnMousePressed((MouseEvent event) -> {
            x = event.getSceneX();
            y = event.getSceneY();
        });

        root.setOnMouseDragged((MouseEvent event) -> {
            stage.setX(event.getScreenX() - x);
            stage.setY(event.getScreenY() - y);
        });
        
        stage.initStyle(StageStyle.TRANSPARENT);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
