/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manipularfrase;

import java.util.Scanner;
public class ManipularFrase {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        String str1,str2;
        str1 = ent.nextLine();
        str2 = ent.nextLine();
        Frase frase1 = new Frase(str1);
        Frase frase2 = new Frase(str2);
        System.out.println(frase1.contarPalavras());
        System.out.println(frase2.contarVogais());
    }
    
}
