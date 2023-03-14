/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;
/**
 *
 * @author leoma
 */
import java.util.*;
public class EstoqueClasse extends Inventario { 

    public EstoqueClasse() {
        super();
    }
    
    public EstoqueClasse(String nomeEstoque){
        super(nomeEstoque);
    }
    
    public EstoqueClasse(ArrayList<Item> Itens){
        super(Itens);
    }
    
    public void DeletaEstoque(){
        super.ItensDesejados.clear();
    }
        
}
