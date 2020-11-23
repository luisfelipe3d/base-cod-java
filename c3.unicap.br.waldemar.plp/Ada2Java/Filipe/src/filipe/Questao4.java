/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filipe;

import java.util.Scanner;

/**
 *
 * @author home
 */
public class Questao4 {
    public static void main(String[] args) {
        int[] v = {8,2,4,10,3,7};
        int aux = 0;
        
        for(int i = 0; i < v.length; i++){
            for(int j = 0; j< v.length - 1; j++){
                if(v[j] < v[j+1]){
                    aux = v[j];
                    v[j] = v[j+1];
                    v[j+1] = aux;
                }
            }
        }
        for(int x: v){
            System.out.println(x);
        }
    }
}
