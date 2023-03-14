package Classes;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author leoma
 */
public class ListadeCompras extends Inventario {
    
    public ListadeCompras(String nomedaLista){
        super(nomedaLista);
    }
    
    public void foiComprado(Item item){
      int indAux = super.ItensDesejados.indexOf(item);
      super.ItensDesejados.remove(indAux);
    }
    
}
