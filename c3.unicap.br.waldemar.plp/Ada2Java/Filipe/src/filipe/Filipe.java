/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filipe;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 *
 * @author home
 */
public class Filipe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x,a,b;
        x=0;
        b=10;
        a=0;
        
        for(int i = 0; i < 120; i++)
            x+=1;
        for (int j = 1; j <= 5; j+=2)
            a+=2;
        b = a+x+x(6);
        System.out.println(b);
        
    }
    
    public static int x(int k){
        System.out.println("entrou");
        if(k > 2)
            return 3+x(k-1);
        else
            return 0;
    }
}
