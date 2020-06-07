/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle.academico.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author home
 */
public class UIcadastroAlunoController implements Initializable {

    @FXML
    private JFXTextField nome;
    @FXML
    private JFXTextField cpf;
    @FXML
    private JFXDatePicker data;
    @FXML
    private JFXTextField email;
    @FXML
    private JFXTextField telefone;
    @FXML
    private JFXComboBox<?> sexo;
    @FXML
    private JFXTextField endereco;
    @FXML
    private JFXComboBox<?> estado;
    @FXML
    private JFXTextField cidade;
    @FXML
    private JFXTextField cep;
    @FXML
    private JFXTextField numero;
    @FXML
    private JFXButton cadastrar;
    @FXML
    private AnchorPane pane;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void btnCadastrar(MouseEvent event) {
        String tnome = this.nome.getText();
        String tcpf = this.cpf.getText();
        String tdata = this.data.toString();
        String temail = this.email.getText();
        String ttelefone = this.telefone.getText();
        String tendereco = this.endereco.getText();
        String tcep = this.cep.getText();
        String tcidade = this.cidade.getText();
        String tnum = this.numero.getText();
        System.out.println();
    }

    @FXML
    private void voltarCadastro(MouseEvent event) {
        
    }
    
}
