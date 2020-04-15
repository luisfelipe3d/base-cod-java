/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogodavelha1;

import java.io.Serializable;
import javafx.scene.control.Alert;
import javafx.scene.text.Text;

/**
 *
 * @author home
 */
public class Alertas implements Serializable {

    Alert alert = new Alert(Alert.AlertType.INFORMATION);
    Alert placar = new Alert(Alert.AlertType.INFORMATION);
    final String t1 = "Quem começa é: ";
    final String t2 = "Jogo da Velha";
    final String v1 = "O vencedor é: ";
    final String v2 = "====DEU VELHA!=====";
    final String pl = "Placar";
    
    
    public void quemComeca(boolean jg1, Jogador n1, Jogador n2){
        alert.setTitle(t2);
        alert.setHeaderText(null);
        if(jg1){
            alert.setContentText(t1+n1.getNome()+" O");
        }else{
            alert.setContentText(t1+n2.getNome()+" X");
        }
        alert.showAndWait();
        
    }
    
    public void quemVenceu(int v, Jogador n1, Jogador n2, boolean jg1){
        alert.setTitle(t2);
        placar.setTitle(t2);
        placar.setHeaderText(pl);
        switch(v){
            case 1:
                alert.setContentText(v1+n1.getNome());
                alert.showAndWait();
                placar.setContentText(placar(n1,n2));
                placar.showAndWait();
                quemComeca(jg1, n1, n2);
                break;
            case 2:
                alert.setContentText(v1+n2.getNome());
                alert.showAndWait();
                placar.setContentText(placar(n1,n2));
                placar.showAndWait();
                quemComeca(jg1, n1, n2);
                break;
            case 3:
                alert.setContentText(v2);
                alert.showAndWait();
                placar.setContentText(placar(n1,n2));
                placar.showAndWait();
                quemComeca(jg1, n1, n2);
                break;
            default:
                System.out.println("quemVenceu4");
        }
    }
    
    public void sobre(){
        final String title = "Sobre o jogo";
        final String versão = "Versão 1.0";
        final String autor = "Author: Luis Queiroz";
        alert.setTitle(title);
        alert.setHeaderText(versão);
        alert.setContentText(autor);
        alert.showAndWait();
    }
    
    public String placar(Jogador p1, Jogador p2){
        String placarJogadores = ""+ p1.toString() +"\n"
                + "" + p2.toString() + "\n";
        return placarJogadores;
    }
    
}
