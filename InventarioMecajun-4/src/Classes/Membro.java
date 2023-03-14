/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author manda
 */
public class Membro {
   private String nomeMembro;
   private String matriculaMembro;
   private String diretoriaMembro;
   private String emailInstitucionalMembro;
   private String senhaMembro;

    public Membro() {
    }

    public Membro(String nomeMembro, String matriculaMembro, String diretoriaMembro, String emailInstitucionalMembro, String senhaMembro) {
        this.nomeMembro = nomeMembro;
        this.matriculaMembro = matriculaMembro;
        this.diretoriaMembro = diretoriaMembro;
        this.emailInstitucionalMembro = emailInstitucionalMembro;
        this.senhaMembro = senhaMembro;
    }

    public String getNomeMembro() {
        return nomeMembro;
    }

    public void setNomeMembro(String nomeMembro) {
        this.nomeMembro = nomeMembro;
    }

    public String getMatriculaMembro() {
        return matriculaMembro;
    }

    public void setMatriculaMembro(String matriculaMembro) {
        this.matriculaMembro = matriculaMembro;
    }

    public String getDiretoriaMembro() {
        return diretoriaMembro;
    }

    public void setDiretoriaMembro(String diretoriaMembro) {
        this.diretoriaMembro = diretoriaMembro;
    }

    public String getEmailInstitucionalMembro() {
        return emailInstitucionalMembro;
    }

    public void setEmailInstitucionalMembro(String emailInstitucionalMembro) {
        this.emailInstitucionalMembro = emailInstitucionalMembro;
    }

    public String getSenhaMembro() {
        return senhaMembro;
    }

    public void setSenhaMembro(String senhaMembro) {
        this.senhaMembro = senhaMembro;
    }
   
   
}
