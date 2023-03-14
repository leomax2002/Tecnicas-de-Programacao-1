/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author leoma
 */
public class Gerente extends Membro {
    private boolean eGerente;
    public Gerente(String nomeMembro, String matriculaMembro, String diretoriaMembro, String emailInstitucionalMembro, String senhaMembro,boolean eGerente){
           
            super(nomeMembro, matriculaMembro, diretoriaMembro, emailInstitucionalMembro, senhaMembro);
            this.eGerente = eGerente;
            }
}
