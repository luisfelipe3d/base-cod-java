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
import java.time.LocalDate;
import java.util.Collection;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
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
    private TableColumn<Aluno, String> sexo_aluno;
    @FXML
    private TableColumn<Aluno, LocalDate> nascimento_aluno;
    
    private ObservableList<Aluno> obsAlunos;
    @FXML
    private AnchorPane anchorAluno;
    
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
        this.aluno_cpf.setCellValueFactory(new PropertyValueFactory<>("cpf"));
        this.aluno_nome.setCellValueFactory(new PropertyValueFactory<>("nome"));
        this.nascimento_aluno.setCellValueFactory(new PropertyValueFactory<>("dataNascimento"));
        this.sexo_aluno.setCellValueFactory(new PropertyValueFactory<>("sexo"));
        this.telefone_aluno.setCellValueFactory(new PropertyValueFactory<>("telefone"));
        this.aluno_email.setCellValueFactory(new PropertyValueFactory<>("email"));
        this.endereco_aluno.setCellValueFactory(new PropertyValueFactory<>("endereco"));
    }
    
    @FXML
    private void cadastrar_aluno(MouseEvent event) throws IOException {
        //carregaUI("cadastrar.fxml");
        final String path = "/controle/academico/view/cadastrar.fxml";
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource(path));
        AnchorPane root = loader.load();
        UIcadastroController controller = loader.getController();
        controller.tipoCadastro(1);
        
        this.anchorAluno.getChildren().removeAll();
        this.anchorAluno.getChildren().setAll(root);
        
    }

    @FXML
    private void remover_aluno(MouseEvent event) {
        this.tabela_alunos.getItems().removeAll(this.tabela_alunos.getSelectionModel().getSelectedItem());
        UiPrincipal.logica.listarTodos();
    }

    @FXML
    private void alterar_alunos(MouseEvent event) throws IOException {
        Aluno alunoSelecionado = this.tabela_alunos.getSelectionModel().getSelectedItem();
        final String path = "/controle/academico/view/UiAlterarCadastro.fxml";
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource(path));
        AnchorPane root = loader.load();
        UiAlterarCadastroController controller = loader.getController();
        controller.initData(alunoSelecionado);
        
        this.anchorAluno.getChildren().removeAll();
        this.anchorAluno.getChildren().setAll(root);
    }
    
    private void carregaUI(String UI) {
        AnchorPane root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("/controle/academico/view/" + UI));
            this.anchorAluno.getChildren().removeAll();
            this.anchorAluno.getChildren().setAll(root);
           
        } catch (IOException ex) {
            Logger.getLogger(UiPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
