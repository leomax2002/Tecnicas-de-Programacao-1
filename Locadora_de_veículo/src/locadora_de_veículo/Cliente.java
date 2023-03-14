/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locadora_de_veículo;

class Cliente {
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
   
    
}
