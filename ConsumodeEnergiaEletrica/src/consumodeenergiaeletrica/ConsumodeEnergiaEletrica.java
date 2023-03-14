/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package consumodeenergiaeletrica;

import java.util.*;
        
public class ConsumodeEnergiaEletrica {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner ent = new Scanner(System.in);
        float custo,tot,consumo;
        float tarifa = (float)(5.0);
        consumo = ent.nextFloat();
        if(consumo <= 500){
            custo = (float)(0.02*consumo);
        }
        else if (consumo > 500 && consumo <= 1000){
            custo = (float)(500*0.1 + (consumo-500)*0.05);
        }
        else{
            custo = (float)(1000*0.35 + (consumo-1000)*0.1);
        }
        tot = (float)(custo + tarifa);
        System.out.printf("%.2f %.2f %.2f\n",custo,tarifa,tot);
    }
    
}
