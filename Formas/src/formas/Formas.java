/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package formas;

import java.util.*;
public class Formas {


    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int comp1,larg1,comp2,larg2;
        
        comp1 = ent.nextInt();
        larg1 = ent.nextInt();
        comp2 = ent.nextInt();
        larg2 = ent.nextInt();
        
        Retangulo ret1 = new Retangulo();
        Retangulo ret2 = new Retangulo();
        
        ret1.setComprimento(comp1);
        ret1.setLargura(larg1);
        ret2.setComprimento(comp2);
        ret2.setLargura(larg2);
        
        System.out.println(ret1.getComprimento() + " " + ret1.getLargura() + " " + ret1.perimetro() + " " + ret1.area());
        System.out.println(ret2.getComprimento() + " " + ret2.getLargura() + " " + ret2.perimetro() + " " + ret2.area());
            
        
        
    }
    
}
