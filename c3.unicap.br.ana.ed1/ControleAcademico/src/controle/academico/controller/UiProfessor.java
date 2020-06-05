/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle.academico.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author home
 */
public class UiProfessor implements Initializable {

    @FXML
    private TableView<?> tabela_alunos;
    @FXML
    private TableColumn<?, ?> aluno_cpf;
    @FXML
    private TableColumn<?, ?> aluno_nome;
    @FXML
    private TableColumn<?, ?> aluno_email;
    @FXML
    private TableColumn<?, ?> telefone_aluno;
    @FXML
    private TableColumn<?, ?> endereco_aluno;
    @FXML
    private TableColumn<?, ?> sexo_aluno;
    @FXML
    private TableColumn<?, ?> nascimento_aluno;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void cadastrar_aluno(MouseEvent event) {
    }

    @FXML
    private void remover_aluno(MouseEvent event) {
    }

    @FXML
    private void alterar_alunos(MouseEvent event) {
    }
    
}
