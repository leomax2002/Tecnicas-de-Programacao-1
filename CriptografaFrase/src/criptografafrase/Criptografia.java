/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package criptografafrase;

import java.text.Normalizer;
import java.util.regex.Pattern;


class Criptografia {
    
    private String frase;
    
    public Criptografia(String fr){
        this.frase = fr;
    }

    public String getFrase() {
        return frase;
    }
    

    public void setFrase(String frase) {
        this.frase = frase;
    }
    
    public String criptografarFrase(){
        String fr = this.frase;
        StringBuffer sbf = new StringBuffer();
        String norm_fr = Normalizer.normalize(fr,Normalizer.Form.NFD);
        Pattern pad = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        String fr_final = pad.matcher(norm_fr).replaceAll("");
        for(int i = 0; i < fr_final.length();i++){
          char aux = fr_final.charAt(i);
          if(aux == 'a' || aux == 'e' || aux == 'i' || aux == 'o' || aux == 'u'){
              sbf.append('*');
          }
          else{
              sbf.append(aux);
          }
        }
        return sbf.toString();
    }
    
    
}
