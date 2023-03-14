package Classes;

import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author leoma
 */
public class ListadeComprasClasse extends Inventario {
    
    public ListadeComprasClasse(){
    }
    
    public ListadeComprasClasse(String nomedaLista){
        super(nomedaLista);
    }
    
    public ListadeComprasClasse(ArrayList<Item> Itens){
        super(Itens);
    }
    
    public void foiComprado(Item item){
      int aux = item.getQtd();
      aux++;
      item.setQtd(aux);
    }
 
    public void clear(){
        super.ItensDesejados.clear();
    }
    
}
