/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locadora_de_veículo;

/**
 *
 * @author leoma
 */
public class Motorista {
    private int id_motorista;
    private String nome;
    private String telefone;
    private String CNH;
    
    public Motorista(int id_motorista, String nome, String telefone, String CNH){
        this.id_motorista = id_motorista;
        this.nome = nome;
        this.telefone = telefone;
        this.CNH = CNH;
    }
    public int getId_motorista() {
        return id_motorista;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getCNH() {
        return CNH;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
