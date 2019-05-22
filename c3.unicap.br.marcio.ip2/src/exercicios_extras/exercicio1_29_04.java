/*
1.Valida números romanos: o seu programa deve receber uma lista de strings 
(string vazia encerra o programa) e para cada uma delas deverá imprimir se o 
algarismo romano é ou não válido. 
 */
package exercicios_extras;

public class exercicio1_29_04 {
    public static void main(String[] args) {
        int i;
        String [] entrada  = {"ola mundo", "recife", "teste", "hacking", ""};
        String [] input = {"IVXLC", "OOOOO", "PQOE", "XVIII", "vxIII"};
        
        for(i = 0; i < entrada.length; i++){
            System.out.println(entrada[i]);
        }
        //ehRomano(entrada);
    }

}
