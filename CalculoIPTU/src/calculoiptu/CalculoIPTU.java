/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculoiptu;

import java.util.*;
public class CalculoIPTU {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner ent = new Scanner(System.in);
        int tipo, area;
        float res;
        tipo = ent.nextInt();
        area = ent.nextInt();
        if(area > 0 && area < 200){
            switch (tipo) {
                case 1:
                    res = (float) (area*1.0);
                    System.out.printf("%.2f\n",res);
                    break;
                case 2:
                    res = (float) (area*1.1);
                    System.out.printf("%.2f\n",res);
                    break;
                default:
                    System.out.println("Entrada inválida!");
                    break;
            }
        }
        else if(area >= 200){
            switch (tipo) {
                case 1:
                    res = (float) (area*1.2);
                    System.out.printf("%.2f\n",res);
                    break;
                case 2:
                    res = (float) (area*1.3);
                    System.out.printf("%.2f\n",res);
                    break;
                default:
                    System.out.println("Entrada inválida!");
                    break;
            }
        }
        else{
            System.out.println("Entrada inválida!");
        }
    }
    
}
