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
import controle.academico.model.Aluno;
import controle.academico.model.Pessoa;
import controle.academico.model.Professor;
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

/**
 * FXML Controller class
 *
 * @author home
 */
public class UiAlterarCadastroController implements Initializable {

    @FXML
    private AnchorPane pane;
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
    private JFXComboBox<String> estado;
    @FXML
    private JFXTextField cep;
    @FXML
    private JFXTextField endereco;
    @FXML
    private JFXTextField numero;
    @FXML
    private JFXTextField cidade;
    @FXML
    private JFXTextField complemento;
    @FXML
    private JFXButton cadastrar;

    private Aluno alunoSelecionado;
    private Professor professorSelecionado;
        
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
       //MaskFormatter mf = new MaskFormatter();
       carregaSexo();
       carregaEstado();
    }    

    @FXML
    private void btnCadastrar(MouseEvent event) {
        
    }

    @FXML
    private void voltarCadastro(MouseEvent event) {
        carregaUI("ui_Aluno.fxml");
    }
    
    private void carregaEstado(){
        String[] estado = {
            "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS",
             "MG", "PA", "PR", "PB", "PE", "PI", "RJ", "RN", "RS", "RO", "RR",
             "SC", "SP", "SE", "TO"
        };
        this.estado.getItems().addAll(estado);
    }
    
    private void carregaSexo(){
        this.sexo.getItems().addAll("Masculino", "Feminino", "Outro");
    }
    
    private void limparCampos() {
        JFXTextField[] campos = {
            this.nome, this.cpf, this.email, this.telefone, this.endereco,
            this.cep, this.cidade, this.numero, this.complemento
        };
        for (JFXTextField f1 : campos) {
            f1.clear();
        }
        this.data.getEditor().clear();
        this.estado.getEditor().clear();
        this.sexo.getEditor().clear();
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
    
    public <T extends Pessoa> void initData(T obj) {
        if(obj instanceof Aluno){
            if(obj != null){
                Aluno tmp = (Aluno) obj;
                alunoSelecionado = tmp;
                this.nome.setText(alunoSelecionado.getNome());
                this.cpf.setText(alunoSelecionado.getCpf());
                this.email.setText(alunoSelecionado.getEmail());
                this.telefone.setText(alunoSelecionado.getTelefone());
                this.endereco.setText(alunoSelecionado.getEndereco().getRua());
                this.cep.setText(alunoSelecionado.getEndereco().getCep());
                this.cidade.setText(alunoSelecionado.getEndereco().getCidade());
                this.numero.setText(alunoSelecionado.getEndereco().getNumero());
                this.complemento.setText(alunoSelecionado.getEndereco().getComplemento());
                this.estado.setValue(alunoSelecionado.getEndereco().getEstado());
                this.sexo.setValue(alunoSelecionado.getSexo());
                this.data.setValue(alunoSelecionado.getDataNascimento());         
            }
        }else if (obj instanceof Professor){
            
        }

    }
}
