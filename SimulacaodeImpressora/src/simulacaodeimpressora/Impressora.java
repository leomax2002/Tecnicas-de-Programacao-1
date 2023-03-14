/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulacaodeimpressora;

/**
 *
 * @author leoma
 */
class Impressora {
    
    public String modelo;
    public String cor;
    public String tipoPapel;
    public boolean bluetooth;
    public boolean wifi;
    public boolean colorida;
    public boolean ligada;
    public boolean papel;
    public boolean digitalizadora;
    public boolean copiadora;
    
    void ligar(){
        if (ligada == false){
            System.out.println("ligando...");
            this.ligada = true;
        }
    }
    
    void desligar(){
        if (ligada == true){
            System.out.println("desligando...");
            this.ligada = false;
        }
    }
    
    void imprimir(){
        if(ligada == true && papel == true){
            System.out.println("imprimindo...");
            
        }
        else if(ligada == true && papel == false){
            System.out.println("sem papel");
        }
        else{
            System.out.println("impressora desligada");
        }
    }
    
    void digitalizar(){
        if(ligada == true && digitalizadora == true){
            System.out.println("digitalização sendo realizada...");
            
        }
        else if(ligada == true && digitalizadora == false){
            System.out.println("não é possível digitalizar");
        }
        else{
            System.out.println("impressora desligada");
        }
    }
    
    void copiar(){
        if(ligada == true && copiadora == true){
            System.out.println("cópia sendo realizada...");
            
        }
        else if(ligada == true && copiadora == false){
            System.out.println("não é possível copiar");
        }
        else{
            System.out.println("impressora desligada");
        }
    }
    
    void status(){
        System.out.println(this.modelo);
        System.out.println(this.cor);
        System.out.println(this.tipoPapel);
        System.out.println( bluetooth ? "bluetooth on" : "bluetooth off");
        System.out.println( wifi ? "wifi on" : "wifi off");
        System.out.println( colorida ? "impressão colorida" : "impressão preto e branco");
        System.out.println( ligada ? "impressora on" : "impressora off");
        System.out.println( papel ? "tem papel" : "não tem papel");
        System.out.println( digitalizadora ? "digitalizadora on" : "digitalizadora off");
        System.out.println( copiadora ? "copiadora on" : "copiadora off");
    }
    

    
}
