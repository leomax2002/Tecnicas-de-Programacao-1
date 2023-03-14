/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package corretorortografico;

import java.util.*;


public class CorretorOrtografico {
    
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int n;
        boolean comp = false;
        boolean flag = true;
        String pal;
        n = ent.nextInt();
        ent.nextLine();
        String[] pals = new String[n];
        for(int i = 0; i < n; i++){
            pals[i] = ent.nextLine();
        }
        
        pal = ent.nextLine();
        for(int i = 0; i < n;i++){
            if(pal.equals(pals[i])){
                comp = true;
                flag = false;
                break;
            }
    
        }
        if(comp){
            System.out.println("palavra correta");
        }
        else{
            System.out.println("palavra incorreta");
            for (String possibilidade : pals) {
                for(int i = 0; i < pal.length()-1; i++){
                    char[]aux3 = pal.toCharArray();
                    char aux4 = aux3[i];
                    aux3[i] = aux3[i+1];
                    aux3[i+1] = aux4;
                    String aux = String.valueOf(aux3);
                    if(aux.equals(possibilidade)){
                        
                        System.out.println(possibilidade+"?");
                        flag = false;
                        break;
                    }
                    
                }
            }
            

        }
        
        if(flag){
            System.out.println("nenhuma sugestão");
        }
    }
    
}