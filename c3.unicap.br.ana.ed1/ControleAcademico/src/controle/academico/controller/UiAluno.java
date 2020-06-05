/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle.academico.controller;

import controle.academico.model.Aluno;
import controle.academico.model.Endereco;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author home
 */
public class UiAluno implements Initializable {
    
    @FXML
    private AnchorPane anchorpane;
    @FXML
    private TableView<Aluno> tabela_alunos;
    @FXML
    private TableColumn<Aluno, String> aluno_cpf;
    @FXML
    private TableColumn<Aluno, String> aluno_nome;
    @FXML
    private TableColumn<Aluno, String> aluno_email;
    @FXML
    private TableColumn<Aluno, String> telefone_aluno;
    @FXML
    private TableColumn<Endereco, String> endereco_aluno;
    @FXML
    private TableColumn<Aluno, Character> sexo_aluno;
    @FXML
    private TableColumn<Aluno, String> nascimento_aluno;
    
    private ObservableList<Aluno> obsAlunos;
    
    public UiAluno (){
        this.obsAlunos = FXCollections.observableList(UiPrincipal.logica.getAlunos());
        this.tabela_alunos = new TableView();
    }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        initTable();  
    }    
       
    private void initTable(){      
        initCols();
        this.tabela_alunos.setItems(obsAlunos);
        
    }
    
    private void initCols() {
//String cpf, String nome, String dataNascimento, 
//            Character sexo, String telefone, String email, Endereco endereco
        
        this.aluno_cpf.setCellValueFactory(new PropertyValueFactory<>("cpf"));
        this.aluno_nome.setCellValueFactory(new PropertyValueFactory<>("nome"));
        this.nascimento_aluno.setCellValueFactory(new PropertyValueFactory<>("dataNascimento"));
        this.sexo_aluno.setCellValueFactory(new PropertyValueFactory<>("sexo"));
        this.telefone_aluno.setCellValueFactory(new PropertyValueFactory<>("telefone"));
        this.aluno_email.setCellValueFactory(new PropertyValueFactory<>("email"));
        this.endereco_aluno.setCellValueFactory(new PropertyValueFactory<>("endereco"));
        //editableCols();
    }
    
    @FXML
    private void cadastrar_aluno(MouseEvent event) {
        carregaUI("cadastroAluno.fxml");
    }

    @FXML
    private void remover_aluno(MouseEvent event) {
    }

    @FXML
    private void alterar_alunos(MouseEvent event) {
    }

    private void editableCols() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private void carregaUI(String UI) {
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("/controle/academico/view/" + UI));
            this.anchorpane.getChildren().setAll(root);
        } catch (IOException ex) {
            Logger.getLogger(UiPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
