/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova2gq.questao3;

/**
 *
 * @author home
 */
public final class Temperatura  {
    private final double ZERO_ABSOLUTO = -459.67;     
    private double temperatura;

    /**
     *
     * @param temperatura double - Valor em graus Fahrenheit
     */
    public Temperatura(double temperatura) {
        this.temperatura = temperatura;
    }
    
    public double getTemperatura() {
        return temperatura;
    }

    @Override
    public String toString() {
        return "Temperatura = " + temperatura +" ºF";
    }
    
    /**
     *
     * @return Converte a temperatura em graus Celsius
     * @throws FahrenheitException
     */
    public double toCelsius() throws FahrenheitException {
        if(this.temperatura < this.ZERO_ABSOLUTO){
            throw new FahrenheitException("FahrenheitException");
        }
        return 5 * (this.temperatura - 32) / 9;
    }
}
