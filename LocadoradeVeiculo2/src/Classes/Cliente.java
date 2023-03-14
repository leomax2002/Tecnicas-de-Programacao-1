/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author leoma
 */
public class Cliente {
    private int id;
    private String RG;
    private String nome;
    private String telefone;
    private String CPF;
    
    public Cliente(int id, String RG, String nome, String telefone, String CPF){
        this.id = id;
        this.RG = RG;
        this.nome = nome;
        this.telefone = telefone;  
        this.CPF = CPF;
    }

    public int getId() {
        return id;
    }

    public String getRG() {
        return RG;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getCPF() {
        return CPF;
    }
    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    @Override
    public String toString() {
        return "id " + id + " , nome " + nome;
    }
    
   
    
}

