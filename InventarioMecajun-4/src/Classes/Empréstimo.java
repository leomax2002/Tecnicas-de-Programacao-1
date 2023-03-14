/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author manda
 */
import Classes.Item;
public class Empréstimo {

    public Empréstimo() {
  
    }
    
    public void Empresta(Item item, Membro membro){
        if (item.isEmprestado()==(false)){
            item.setEmprestado(true);
        }
    
    }
    public void Devolve(Item item){
        if (item.isEmprestado()==(true)){
            item.setEmprestado(false);    
        }
    }
    
}
    
