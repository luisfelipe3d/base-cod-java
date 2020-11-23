/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filipe;

/**
 *
 * @author home
 */
public class Main {
    public static void main(String[] args) {
        int a,b,ART,CONTA,CONTB,XP;
        
        a = 4;
        b = 2;
        ART = b;
        
        for(CONTA = 2; CONTA <= a; CONTA+=2){
            XP = b;
            CONTB = 1;
            for(CONTB = 1; CONTB <= CONTA - 1; CONTB++){
                XP = XP * b;
            }
            ART = ART + XP;
        }
        System.out.println(ART);
    }
}
