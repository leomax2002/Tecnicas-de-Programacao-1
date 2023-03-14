/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package converte;

/**
 *
 * @author leoma
 */

import java.util.*;

public class Converte {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner ent = new Scanner(System.in);
        double temp;
        temp = ent.nextDouble();
        
        Temperatura temperatura = new Temperatura(temp);
        temperatura.toFahrenheit();
        System.out.println(temperatura.toString());
        temperatura.toCelsius();
        System.out.println(temperatura.toString());       
    }
    
}
