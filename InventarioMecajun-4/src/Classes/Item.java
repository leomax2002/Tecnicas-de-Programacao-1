package Classes;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author leoma
 */
import java.util.ArrayList;

public class Item {
    private String nome;
    private String desc;
    private ArrayList<String> tags;
    private int qtd;
    private String dtst;
    private boolean temProjeto;
    private Projeto projeto;
    private boolean emprestado;

    public Item() {
    }
    
    public Item(String nome,String desc,ArrayList<String> tags,int qtd,String dtst,boolean temProjeto,Projeto projeto, boolean emprestado){
        this.nome = nome;
        this.desc = desc;
        this.tags = tags;
        this.qtd = qtd;
        this.temProjeto = temProjeto;
        this.projeto = projeto;
        this.emprestado = emprestado;
        this.dtst = dtst;
    }
  
    public boolean isProjeto() {
        
        return temProjeto;
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
    public Projeto getProjeto() {
        return projeto;
    }
    public ArrayList<String> getTags() {
        return tags;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public boolean isEmprestado() {
        return emprestado;
    }
    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }
    
    
    public void AdicionaTag(String tag){
         this.tags.add(tag);
    }
    public void RemoveTag(String tag){
         this.tags.remove(tag);
    }
    public void AddProjeto(Projeto projeto){
        if (this.temProjeto==false){
            this.temProjeto=true;
            this.projeto=projeto;
        }
        else{
        
        }
    }
    public void RemoveProjeto(){
        if (this.temProjeto==true){
            this.projeto=null;
        }
    }
    public void AdicionaDtst(String dtst) {
        this.dtst = dtst;
    }
    public void RemoveDtst() {
        this.dtst = null;
    }
    
    
    
    
}
