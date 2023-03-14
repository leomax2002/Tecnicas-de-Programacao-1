/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controledeacessodepessoas;

import java.util.*;

public class ControledeAcessodePessoas {


    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        int h = 0;
        int m = 0;
        String pal;
        Scanner ent = new Scanner(System.in);
        while(ent.hasNext()){
            pal = ent.nextLine();
            char temp = pal.charAt(0);
            if(temp == 'h'){
                h++;
            }
            else if(temp == 'm'){
                m++;
            }
            else if(temp == 'q'){
                break;
            }
        }
        float val_h = (float)(12.5*h);
        float val_m = (float)(7.4*m);
        float arrecadacao = (float)(val_h + val_m);
        System.out.printf("%d %d\n",h,m );
        System.out.printf("%.2f %.2f %.2f\n",val_h,val_m,arrecadacao);
    }
    
}
