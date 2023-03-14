/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package converte;

/**
 *
 * @author leoma
 */

class Temperatura {
    private double temperatura;
    private boolean flag = false;
    
    public Temperatura(double val){
        this.temperatura = val;
    }
    
    @Override
    public String toString(){
        if (this.flag){
        
            return String.format("temperatura: %1.1f graus fahrenheit", this.temperatura);
        }
        
        else{
            
            return String.format("temperatura: %1.1f graus celsius", this.temperatura);
        }
    }
    
    public void toFahrenheit(){
        this.flag = true;
        this.temperatura = (this.temperatura*9.0/5.0 + 32);
    }
    
    public void toCelsius(){
        this.flag = false;
        this.temperatura = (this.temperatura-32.0)*5.0/9.0;
    }
}

