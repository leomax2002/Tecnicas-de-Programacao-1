/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;
/**
 *
 * @author leoma
 */
public class Estoque extends Inventario { 
    public Estoque(String nomedoEstoque){
        super(nomedoEstoque);
    }
    public void DeletaEstoque(){
        super.ItensDesejados.clear();
    }
        
}
