/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package formas;

/**
 *
 * @author leoma
 */
class Retangulo {
    
    private int comprimento = 1;
    private int largura = 1;
    
    public int perimetro(){
        return (int)(2*(this.comprimento + this.largura));
    }
    public int area(){
        return (int)(this.comprimento*this.largura);
    }

    public void setComprimento(int comprimento) {
        if(comprimento > 0 && comprimento < 20){
            this.comprimento = comprimento;
        }
    }

    public void setLargura(int largura) {
        if(largura > 0 && largura < 20){
            this.largura = largura;
        }
    }

    public int getComprimento() {
        return comprimento;
    }

    public int getLargura() {
        return largura;
    }
    
}
