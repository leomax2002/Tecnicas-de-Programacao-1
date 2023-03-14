/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author leoma
 */
public class Chamado {
    private int id_chamado;
    private String data;
    private String tipo;
    private String origem;
    private String destino;
    private float horario_partida;
    private float horario_retorno;
    private double quilometragem_inicial;
    private double quilometragem_final;
    private double valor_total;
    private Cliente clt;
    
    public Chamado(int id_chamado, String data, String tipo, String origem, String destino, float horario_partida, float horario_retorno, double quilometragem_inicial, double quilometragem_final, double valor_total, Cliente clt){
        this.id_chamado = id_chamado;
        this.data = data;
        this.tipo = tipo;
        this.origem = origem;
        this.destino = destino;
        this.horario_partida = horario_partida;
        this.horario_retorno = horario_retorno;
        this.quilometragem_inicial = quilometragem_inicial;
        this.quilometragem_final = quilometragem_final;
        this.valor_total = calcula_valor_total(valor_total);   
        this.clt = clt;
    }

    public int getId_chamado() {
        return id_chamado;
    }

    public String getData() {
        return data;
    }

    public String getTipo() {
        return tipo;
    }

    public String getOrigem() {
        return origem;
    }

    public String getDestino() {
        return destino;
    }

    public float getHorario_partida() {
        return horario_partida;
    }

    public float getHorario_retorno() {
        return horario_retorno;
    }

    public double getQuilometragem_inicial() {
        return quilometragem_inicial;
    }

    public double getQuilometragem_final() {
        return quilometragem_final;
    }

    public double getValor_total() {
        return valor_total;
    }

    public void setHorario_retorno(float horario_retorno) {
        this.horario_retorno = horario_retorno;
    }

    public Cliente getClt() {
        return clt;
    }

    public void setId_chamado(int id_chamado) {
        this.id_chamado = id_chamado;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setHorario_partida(float horario_partida) {
        this.horario_partida = horario_partida;
    }

    public void setQuilometragem_inicial(double quilometragem_inicial) {
        this.quilometragem_inicial = quilometragem_inicial;
    }

    public void setQuilometragem_final(double quilometragem_final) {
        this.quilometragem_final = quilometragem_final;
    }

    public void setValor_total(double valor_total) {
        this.valor_total = valor_total;
    }

    public void setClt(Cliente clt) {
        this.clt = clt;
    }
    
    public final double calcula_valor_total(double valor_total){
        return valor_total;
    }
}
