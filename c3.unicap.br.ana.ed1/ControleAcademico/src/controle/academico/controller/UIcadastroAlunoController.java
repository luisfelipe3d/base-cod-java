package controle.academico.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

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
        String[] aux = {tnome,tcpf,tdata,temail,ttelefone,tendereco,tcep,tcidade,tnum};
        
        for(String p: aux){
            System.out.println(p);
        }
    }

    @FXML
    private void voltarCadastro(MouseEvent event) {
        carregaUI("ui_Aluno.fxml");
    }
    
    private void carregaUI(String UI) {
        AnchorPane root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("/controle/academico/view/" + UI));
            this.pane.getChildren().removeAll();
            this.pane.getChildren().setAll(root);
           
        } catch (IOException ex) {
            Logger.getLogger(UiPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
