/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package siglasinternet;

/**
 *
 * @author leoma
 */
class Dict {
    
    private String chave;
    private String val;
    
    public Dict(String ch, String v){
        
        this.chave = ch;
        this.val = v;
}

    public String getChave() {
        return chave;
    }
    
    public void setChave(String chave) {
        this.chave = chave;
    }

    public void setVal(String val) {
        this.val = val;
    }
    
    String getVal(String ch){
        if(ch.equals(this.chave)){
            return this.val;
        }
    return ch;
    }
    
}
