/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pesoideal;

import java.util.*;
        
public class PesoIdeal {

    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));
        float a,res;
        String sexo;
        Scanner entrada = new Scanner(System.in);      
        a = entrada.nextFloat();
        entrada.nextLine();
        sexo = entrada.nextLine();
        char s = sexo.charAt(0);
        if(a >= 0){
            if(s == 'm'){
                res = (float) ((72.7*a)-58.0);
                System.out.printf("%.1f kg\n", res);
            }
            else if(s == 'f'){
                res = (float) ((62.1*a)-44.7);
                System.out.printf("%.1f kg\n", res);
            }
            else{
                System.out.println("Entrada inválida!");
            }
        }
        else{
            System.out.println("Entrada inválida!");
        }
    }
    
}
