/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manipularfrase;

import java.text.Normalizer;
import java.util.regex.Pattern;

class Frase {
    private String frase;
    public Frase(String fr){
        this.frase = fr;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String fr) {
        this.frase = fr;
    }
    
    public int contarVogais(){
      int n_vog = 0;
      String fr = this.frase.toLowerCase();
      String norm_fr = Normalizer.normalize(fr,Normalizer.Form.NFD);
      Pattern pad = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
      String fr_final = pad.matcher(norm_fr).replaceAll("");
      for(int i = 0; i < fr_final.length();i++){
          char aux = fr_final.charAt(i);
          if(aux == 'a' || aux == 'e' || aux == 'i' || aux == 'o' || aux == 'u'){
              n_vog++;
          }
      }
      return n_vog;
    }
    
    public int contarPalavras(){
        String[] pals = this.frase.split(" ");
        int n_pals = pals.length;
        return n_pals;
    }
}
