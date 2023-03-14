/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author leoma
 */
public class Diretor extends Membro {
    
    private boolean eDiretor;
    public Diretor(String nomeMembro, String matriculaMembro, String diretoriaMembro, String emailInstitucionalMembro, String senhaMembro,boolean eDiretor){
           
            super(nomeMembro, matriculaMembro, diretoriaMembro, emailInstitucionalMembro, senhaMembro);
            this.eDiretor = eDiretor;
            }
    
    public void removeMembro(Membro mem){
        mem = null;
    }
    
    public void alteraDiretoria(Membro mem, String Diretoria){
        mem.setDiretoriaMembro(Diretoria);
    }
    
}
