package Classes;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author leoma
 */
public class Item {
    private String nome;
    private String desc;
    private String[] tag;
    private int qtd;
    private String dtst;
    private boolean projeto;
    private Projeto referenciaAoProjeto;
    
    public Item(String nome,String desc,String[] tag,int qtd,String dtst,boolean projeto,Projeto ref){
        this.nome = nome;
    }
    public boolean isProjeto() {
        return projeto;
    }

    public void setProjeto(boolean projeto) {
        this.projeto = projeto;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public String getDtst() {
        return dtst;
    }

    public void setDtst(String dtst) {
        this.dtst = dtst;
    }

    public Projeto getReferenciaAoProjeto() {
        return referenciaAoProjeto;
    }

    public void setReferenciaAoProjeto(Projeto referenciaAoProjeto) {
        this.referenciaAoProjeto = referenciaAoProjeto;
    }

    public String[] getTag() {
        return tag;
    }

    public void setTag(String[] tag) {
        this.tag = tag;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
