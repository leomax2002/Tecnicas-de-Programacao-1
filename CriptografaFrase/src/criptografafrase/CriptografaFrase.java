/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package criptografafrase;

import java.util.Scanner;

public class CriptografaFrase {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        String str1,str2;
        str1 = ent.nextLine();
        str2 = ent.nextLine();
        Criptografia frase1 = new Criptografia(str1);
        Criptografia frase2 = new Criptografia(str2);
        str1 = ent.nextLine();
        frase1.setFrase(str1);
        System.out.println(frase2.getFrase());
        System.out.println(frase1.criptografarFrase());
    }
    
}
