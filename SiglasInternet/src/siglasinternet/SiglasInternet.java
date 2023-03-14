/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package siglasinternet;

import java.util.*;

public class SiglasInternet {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in, "UTF-8");
        int n;
        String frase, frase_verdadeira, temp, temp2;
        String resp = "";
        String[] aux = new String[2]; 
        n = ent.nextInt();
        ent.nextLine();
        String[] chaves = new String[n];
        String[] valores = new String[n];
        for(int i = 0; i < n; i++){
           frase = ent.nextLine();
           aux = frase.split(" ");
           chaves[i] = aux[0];
           valores[i] = aux[1];
        }
        
        frase_verdadeira = ent.nextLine();
        frase = frase_verdadeira.toLowerCase();
        String[] palavras = frase.split(" ");
        String[] palavras_verdadeiras = frase_verdadeira.split(" ");
        for (int i = 0; i < palavras.length; i++) {
            temp = palavras_verdadeiras[i];
            for(int j = 0; j < n; j++){
                if(chaves[j].equals(palavras[i])){
                    temp = valores[j];
                    break;
                }
            }
            if(i == palavras.length - 1){
                resp = resp + temp;
            }
            else{
            resp = resp + temp + " ";
            }
        }
        System.out.println(resp);

        
    }
    
}
