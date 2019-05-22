/*
2ª Questão - Implemente os seguintes métodos relacionados a strings 
(você deve implementar tudo, não pode utilizar os métodos já disponíveis em 
String, com exceção do método length()): 
A. char[] consoantes(String str) retorna um vetor de caracteres que contém 
todas as consoantes pertencentes à str, todas em maiúsculas e em 
ordem crescente (2,0 pontos).
B. boolean ehSubstring(String str1, String str2) que retorna true str1 for 
substring de str2 ou vice-versa (2,0 pontos).
 */
package prova_gq1;


public class q2_provagq1 {
    public static void main(String[] args) {
        System.out.println(maiusculaConsoantes("Alo Mundo!"));
        System.out.println(consoantes("Alo Mundo!"));
        String str1 = "PERNAMBUCO";
        String str2 = "BUC";
        String str3 = "CUB";
        System.out.println(ehSubstring(str1, str2));
        System.out.println(ehSubstring(str2, str1));
        System.out.println(ehSubstring(str1, str3));
    }
    
    public static String maiusculaConsoantes(String str) {
        int i, dif = (int) ('A' - 'a');
        String result = "";
        char c;
        for (i = 0; i < str.length(); i = i + 1) {
            c = str.charAt(i);
            if (c >= 'a' && c <= 'z') {
                c = (char) (c + dif);
            }
            if (c >= 'B' && c <= 'Z' && c != 'E' && c != 'I'
                    && c != 'O' && c != 'U') {
                result = result + c;
            }
        }
        return result;
    }
    
    public static char[] consoantes(String str) {
        str = maiusculaConsoantes(str);
        char[] result = new char[str.length()];
        int i, j, tam = 0;
        for (i = 0; i < str.length(); i = i + 1) {
            j = i;
            while (j > 0 && result[j-1] > str.charAt(i)) {
                result[j] = result[j - 1];
                j = j - 1;
            }
            result[j] = str.charAt(i);
        }
        return result;
    }
    
    public static boolean ehSubstring(String str1, String str2) {
        int i, j, dif;
        String aux;
        boolean flag;
        if (str1.length() < str2.length()) {
            aux = str1;
            str1 = str2;
            str2 = aux;
        }
        dif = str1.length() - str2.length();
        for (i = 0; i <= dif; i = i + 1) {
            flag = true;
            for (j = 0; j < str2.length(); j = j + 1) {
                if (str1.charAt(i + j) != str2.charAt(j)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                return true;
            }
        }
        return false;
    }
}
