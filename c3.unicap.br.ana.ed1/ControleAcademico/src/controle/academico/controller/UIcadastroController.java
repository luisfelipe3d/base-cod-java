package controle.academico.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextField;
import controle.academico.model.Aluno;
import controle.academico.model.Endereco;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class UIcadastroController implements Initializable {

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
    private JFXComboBox<String> sexo;
    @FXML
    private JFXTextField endereco;
    @FXML
    private JFXComboBox<String> estado;
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
    @FXML
    private JFXTextField complemento;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        carregaEstados();
        carregaSexo();
    }    

    @FXML
    private void btnCadastrar(MouseEvent event) {
        String tnome = this.nome.getText();
        String tcpf = this.cpf.getText();
        //String tdata = this.data.toString();
        String temail = this.email.getText();
        String ttelefone = this.telefone.getText();
        String tendereco = this.endereco.getText();
        String tcep = this.cep.getText();
        String tcidade = this.cidade.getText();
        String tnum = this.numero.getText();
        String tcomplemento = this.complemento.getText();
        LocalDate date = this.data.getValue();
        Endereco endereco = new Endereco(this.estado.getValue(), tcidade,tendereco,tnum, tcep, tcomplemento);
        Aluno tAlu = new Aluno(tcpf, tnome,date,this.sexo.getValue(),ttelefone,temail,endereco);
        UiPrincipal.logica.cadastrar(tAlu);
        limparCampos();
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

    private void carregaEstados() {
        String[] estado = {
            "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS",
             "MG", "PA", "PR", "PB", "PE", "PI", "RJ", "RN", "RS", "RO", "RR",
             "SC", "SP", "SE", "TO"
        };
        this.estado.getItems().addAll(estado);
    }

    private void carregaSexo() {
        this.sexo.getItems().addAll("Masculino", "Feminino", "Outro");
    }
    
    private void limparCampos(){
        JFXTextField []campos = {
            this.nome,this.cpf,this.email,this.telefone,this.endereco,
            this.cep,this.cidade,this.numero,this.complemento
        };
        for(JFXTextField f1: campos){
            f1.clear();
        }
        this.data.getEditor().clear();
        this.estado.getEditor().clear();
        this.sexo.getEditor().clear();
    }
    
    public void tipoCadastro(int ia){
        if (ia == 1){
            //Aluno
        }else if(ia == 2){
            //professor
        }
    }
    
}
