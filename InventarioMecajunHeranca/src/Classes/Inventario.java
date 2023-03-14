/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;
import java.lang.*;

/**
 *
 * @author leoma
 */
public class Inventario {
    ArrayList<Item> ItensDesejados;
    public Inventario(String nomedoInventario){
        ItensDesejados = new ArrayList();
        Item itemAux;
        File inventario = new File(nomedoInventario);
        if(inventario.exists()){
            try {
                Scanner txt = new Scanner(inventario);
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
                    ItensDesejados.add(itemAux);
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Estoque.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
            try {
                inventario.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(Estoque.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
       
    }
    
    
    public void adicionaItem(Item item){
        ItensDesejados.add(item);
    }
    
    
    public void removeItem(Item item){
        int it = ItensDesejados.indexOf(item);
        ItensDesejados.remove(it);
    }
    
    public ArrayList<Item> procuraItem(String nomeItem){
        ArrayList<Item> itensEncontrados = new ArrayList();
        String NomeItemAux;
        for(int i = 0; i < ItensDesejados.size();i++){
            NomeItemAux = ItensDesejados.get(i).getNome();
            if(NomeItemAux.contains(nomeItem)){
                itensEncontrados.add(ItensDesejados.get(i));
            }
        }
        return itensEncontrados;

    }
    /*
        public Item[] procuraItem(String nomeItem){
        Item[] itensEncontrados = new Item[1000];
        String NomeItemAux;
        for(int i = 0; i < ItensdoEstoque.size();i++){
            NomeItemAux = ItensdoEstoque.get(i).getNome();
            if(NomeItemAux.contains(nomeItem)){
                itensEncontrados[i] = ItensdoEstoque.get(i);
            }
        }
        return itensEncontrados;

    }
        */
    
    public ArrayList<Item> filtraItem(String[] tag, Projeto projeto){
        ArrayList<Item> itensEncontrados = new ArrayList();
        itensEncontrados = null;
        if(tag == null && projeto == null){
            itensEncontrados = ItensDesejados;
            return itensEncontrados;
        }
        for(int i = 0; i < tag.length;i++){
            for(int j = 0; j < ItensDesejados.size();j++){
                Item itemAux = ItensDesejados.get(j);
                String[] tagItemEstoque = itemAux.getTag();
                if(tag[i].equals(tagItemEstoque[j]) && !itensEncontrados.contains(itemAux)){
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
