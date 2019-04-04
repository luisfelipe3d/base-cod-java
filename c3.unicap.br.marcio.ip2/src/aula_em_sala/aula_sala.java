/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_em_sala;

public class aula_sala {
    public static void main(String[] args) {
        String s1 = "PERNAMBUCO";
        System.out.println(subs(s1,0,5)); 
    }
    // str.substring(0,5) - "PERNA"
    // str.indexOf("NAM") -> 3
    // str.indexOf("MAN") -> -1 caso não encontre
    // str.indexOf("NAM", 4(inicio de busca)) -> -1
    public static String subs (String str, int inicio, int fim){
        // incio = intervalo fechado ; fim = fim -1;
        int i;
        String result = "";
        if (fim > str.length()){
            fim = str.length();
        }
        for (i = inicio; i<fim; i++){
            result = result + str.charAt(i);
        }
        return result;
    }
    
    
    private static boolean testaSubstring(String str, String substr, int inicio){
        int i, j, fim = inicio + substr.length();
        if(fim > str.length() || inicio < 0){
            return false;
        }
        for(i = inicio, j = 0; i < fim; i++, j++){
            if(str.charAt(i) != substr.charAt(j)){
                return false;
            }
        } return true;
    }
    
    public static int indexOf(String str, String substr){
        return indexOf(str,substr,0);
    }
    public static int indexOf(String str, String substr, int inicio){
        int i, fim = str.length() - substr.length() +1;
        for(i = inicio; i < fim; i++){
            if(testaSubstring(str,substr,i)){
                return i;
            }
        }
        return -1;
    }
}
