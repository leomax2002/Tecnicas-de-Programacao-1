/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locadora_de_veículo;

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
    
    public Chamado(int id_chamado, String data, String tipo, String origem, String destino, float horario_partida, float horario_retorno, double quilometragem_inicial, double quilometragem_final, double valor_total){
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
    
    public final double calcula_valor_total(double valor_total){
        return valor_total;
    }
}
