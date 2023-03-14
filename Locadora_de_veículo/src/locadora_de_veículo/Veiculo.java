/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locadora_de_veículo;

/**
 *
 * @author leoma
 */
public class Veiculo {
    private String placa;
    private String marca;
    private String modelo;
    private String cor;
    private int ano;
    
    public Veiculo(String placa, String marca, String modelo, String cor, int ano){
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public int getAno() {
        return ano;
    }
    
    
}
