/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;
import java.util.ArrayList;
/**
 *
 * @author leoma
 */
public class Projeto {
    
    private String nome;
    private String descricao;
    private ArrayList membros;
    
    public Projeto() {
        this. nome = "";
        this.descricao = "";
    }
    
    public Projeto(String nome, String descricao, ArrayList<Membro> membros){
        this. nome = nome;
        this.descricao = descricao;
        this.membros = membros;
    }
    public Projeto(String nome){
        this. nome = nome;
    }

    public ArrayList getMembros() {
        return membros;
    }

    public void setMembros(ArrayList<Membro> membros) {
        this.membros = membros;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public String[] getNomesMembros(){
        ArrayList<Membro> membrosAux = this.membros;
        String[] res = new String[this.membros.size()];
        for(int i = 0; i < this.membros.size();i++){
            Membro memAux = membrosAux.get(i);
            res[i] = memAux.getNomeMembro();
        }
        return res;
    }

}
