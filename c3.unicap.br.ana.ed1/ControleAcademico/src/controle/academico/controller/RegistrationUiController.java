/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle.academico.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.validation.RequiredFieldValidator;
import controle.academico.aplicacao.Aplicacao;
import controle.academico.model.UsuarioSistema;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
//import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import java.io.IOException;
import java.net.URL;
import java.util.Observable;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.input.DragEvent;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseDragEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author home
 */
public class RegistrationUiController implements Initializable {

    @FXML
    private AnchorPane pane;
    @FXML
    private JFXTextField nome;
    @FXML
    private JFXTextField email;
    @FXML
    private JFXPasswordField senha;
    @FXML
    private JFXPasswordField senhac;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        final String msg = "Este campo não pode ser vazio";
        RequiredFieldValidator vNome = new RequiredFieldValidator();
        vNome.setMessage(msg);
        
        nome.getValidators().add(vNome);
        nome.focusedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
                if(!newValue){
                    nome.validate();
                }
            }
        });
        email.getValidators().add(vNome);
        email.focusedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
                if(!newValue){
                    email.validate();
                }
            }
        });
        senha.getValidators().add(vNome);
        senha.focusedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
                if(!newValue){
                    senha.validate();
                }
            }
        });
        senhac.getValidators().add(vNome);
        senhac.focusedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
                if(!newValue){
                    senhac.validate();
                }
            }
        });
    }    

    @FXML
    private void close_app(MouseEvent event) {
        System.exit(0);
    }

    @FXML
    private void back_to_menu() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/controle/academico/view/login.fxml"));
        Aplicacao.stage.getScene().setRoot(root);
    }

    @FXML
    private void cadastrar(ActionEvent event) throws IOException {
        String tNome = this.nome.getText();
        String tEmail = this.email.getText();
        String tSenha = this.senha.getText();
        String tSenhac = this.senhac.getText();
        UsuarioSistema temp;
        if(validaCampos(tNome,tEmail,tSenha,tSenhac)){
            if(tSenha.compareToIgnoreCase(tSenhac) == 0){
                temp = new UsuarioSistema(tNome,tEmail,tSenha,tSenhac);
                Aplicacao.users.add(temp);
                System.out.println("Usuario: "+tNome+" cadastrado!");
                System.out.println("Senha: "+tSenha);
                back_to_menu();
                
            }
        }else{
            System.out.println("Não foi possível cadastrar");
        }
    }
    
    private boolean validaCampos(String n, String e, String s, String s1){
        if(n.isEmpty() || e.isEmpty() || s.isEmpty() || s1.isEmpty()){
            return false;
        }
        return true;
    }
    
}
