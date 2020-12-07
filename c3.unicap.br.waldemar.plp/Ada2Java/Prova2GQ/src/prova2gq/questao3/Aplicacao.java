/*
Questão 3. (1,0 ponto) Considere o problema de conversão de temperaturas entre
Celsius e Fahrenheit em Java.
Crie duas exceções, TemperatureException que herda
de Exception e FahrenheitException que herda de TemperatureException.
Crie uma classe utilitária (Utils) com um método para converter  temperaturas 
em graus Fahrenheit para graus Celsius (toCelsius()),  ambas representadas em 
ponto-flutuante (double). Porém, caso o valor a  ser convertido seja menor que
zero absoluto (-459,67°F)  deve-se lançar a  exceção FahrenheitException. 
A formula para conversão é dada por: C=5(F-32)/9

 */
package prova2gq.questao3;


/**
 *
 * @author home
 */
public class Aplicacao {
    public static void main(String[] args) {
        double [] temperaturas = {-3.45,10,0,100,300, -500};
        Temperatura t;
        for(double s: temperaturas){
            t = new Temperatura(s);
            try{
                double transformacao = t.toCelsius();
                System.out.println("Valor: "+transformacao+" ºC");
            } catch (FahrenheitException ex) {
                System.err.println(ex.getMessage());
                System.err.println(ex.getClass());
            }  
        }
        
    }
}
