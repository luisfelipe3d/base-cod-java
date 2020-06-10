/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle.academico.controller;

import controle.academico.model.Endereco;
import controle.academico.model.Professor;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
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
public class UiProfessor implements Initializable {

    @FXML
    private TableColumn<Professor, String> professor_cpf;
    @FXML
    private TableColumn<Professor, String> professor_nome;
    @FXML
    private TableColumn<Professor, String> professor_email;
    @FXML
    private TableColumn<Endereco, String> endereco_professor;
    @FXML
    private TableColumn<Professor, String> sexo_professor;
    @FXML
    private TableColumn<Professor, LocalDate> nascimento_professor;
    @FXML
    private TableView<Professor> tabela_professor;
    @FXML
    private AnchorPane anchorProfessor;
    
    private ObservableList<Professor> obsProfessor;
    @FXML
    private TableColumn<Professor, String> telefone_professor;
    
    public UiProfessor(){
        this.obsProfessor = FXCollections.observableList(UiPrincipal.logica.getProfessores());
        this.tabela_professor = new TableView();
    }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        initTable(); 
    }    

    @FXML
    private void cadastrarProfessor(MouseEvent event) throws IOException {
        final String path = "/controle/academico/view/cadastrar.fxml";
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource(path));
        AnchorPane root = loader.load();
        UIcadastroController controller = loader.getController();
        controller.tipoCadastro(2);
        
        this.anchorProfessor.getChildren().removeAll();
        this.anchorProfessor.getChildren().setAll(root);
    }

    @FXML
    private void removerProfessor(MouseEvent event) {
        this.tabela_professor.getItems().removeAll(this.tabela_professor.getSelectionModel().getSelectedItem());
        UiPrincipal.logica.listarTodos();
    }

    @FXML
    private void alterarProfessor(MouseEvent event) throws IOException {
        Professor professorSeleciando = this.tabela_professor.getSelectionModel().getSelectedItem();
        final String path = "/controle/academico/view/UiAlterarCadastro.fxml";
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource(path));
        AnchorPane root = loader.load();
        UiAlterarCadastroController controller = loader.getController();
        controller.initData(professorSeleciando);
        controller.tipoCadastro(2);
        
        this.anchorProfessor.getChildren().removeAll();
        this.anchorProfessor.getChildren().setAll(root);
    }

    private void initTable() {
        initCols();
        this.tabela_professor.setItems(obsProfessor);
    }

    private void initCols() {
        this.professor_cpf.setCellValueFactory(new PropertyValueFactory<>("cpf"));
        this.professor_nome.setCellValueFactory(new PropertyValueFactory<>("nome"));
        this.nascimento_professor.setCellValueFactory(new PropertyValueFactory<>("dataNascimento"));
        this.sexo_professor.setCellValueFactory(new PropertyValueFactory<>("sexo"));
        this.telefone_professor.setCellValueFactory(new PropertyValueFactory<>("telefone"));
        this.professor_email.setCellValueFactory(new PropertyValueFactory<>("email"));
        this.endereco_professor.setCellValueFactory(new PropertyValueFactory<>("endereco"));
    }
    
    
    private void carregaUI(String UI) {
        AnchorPane root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("/controle/academico/view/" + UI));
            this.anchorProfessor.getChildren().removeAll();
            this.anchorProfessor.getChildren().setAll(root);

        } catch (IOException ex) {
            Logger.getLogger(UiPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
