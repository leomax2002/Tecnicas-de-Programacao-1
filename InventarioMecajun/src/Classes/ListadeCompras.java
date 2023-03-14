package Classes;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author leoma
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
public class ListadeCompras {
    
    static ArrayList<Item> itensDesejados;
   
    public ListadeCompras(String nomedaLista){
        itensDesejados = new ArrayList();
        Item itemAux;
        File estoque = new File(nomedaLista);
        if(estoque.exists()){
            try {
                Scanner txt = new Scanner(estoque);
                while(txt.hasNextLine()){
                    String[] dadosdoItem = txt.nextLine().split(" ");
                    int aux = dadosdoItem.length - 6;
                    String[] tagAux = new String[aux];
                    for(int i = 2; i < aux;i++){
                        int val = i-2;
                        tagAux[val] = dadosdoItem[i];
                    }
                    int fim = dadosdoItem.length;
                    Projeto projetoAux = new Projeto(dadosdoItem[fim-1]);
                    itemAux = new Item(dadosdoItem[0],dadosdoItem[1],tagAux ,Integer.parseInt(dadosdoItem[fim-4]),dadosdoItem[fim-3] ,Boolean.parseBoolean(dadosdoItem[fim-2]), projetoAux);
                    itensDesejados.add(itemAux);
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Estoque.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
            try {
                estoque.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(Estoque.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void adicionaItem(Item item){
        itensDesejados.add(item);
    }
    
    public boolean removeItem(Item item){
        if(itensDesejados.contains(item)){
        int it = itensDesejados.indexOf(item);
        itensDesejados.remove(it);
        }
        else{
            return false;
        }
        return true;
    }
    
    public void foiComprado(Item item){
      int indAux = itensDesejados.indexOf(item);
      itensDesejados.remove(indAux);
    }
    
    public ArrayList<Item> filtraItem(String[] tag, Projeto projeto){
        ArrayList<Item> itensEncontrados = new ArrayList();
        itensEncontrados = null;
        if(tag == null && projeto == null){
            itensEncontrados = itensDesejados;
            return itensEncontrados;
        }
        for(int i = 0; i < tag.length;i++){
            for(int j = 0; j < itensDesejados.size();j++){
                Item itemAux = itensDesejados.get(j);
                String[] tagItemDesejado = itemAux.getTag();
                if(tag[i].equals(tagItemDesejado[j]) && !itensEncontrados.contains(itemAux)){
                    itensEncontrados.add(itemAux);
                }
                if(i == 0 && itemAux.isProjeto()){
                   Projeto projetoAux = itemAux.getReferenciaAoProjeto();
                   if(projetoAux.getNome().equals(projeto.getNome()) && !itensEncontrados.contains(itemAux)){
                     itensEncontrados.add(itemAux);
                   }
                    
                }
            }
        }
        return itensEncontrados;
    }
    
}
