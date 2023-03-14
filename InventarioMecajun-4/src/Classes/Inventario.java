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
import java.util.Arrays;

/**
 *
 * @author leoma
 */
public class Inventario {
    protected ArrayList<Item> ItensDesejados;

    public Inventario() {
        ItensDesejados = new ArrayList();
    }
    
    public Inventario(ArrayList<Item> itens) {
        ItensDesejados = itens;
    }
    
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
                    ArrayList<String> tagAux = new ArrayList<>();
                    if(dadosdoItem[2].equals("[]")){
                       tagAux = new ArrayList<String>(Arrays.asList(""));
                    }
                    else{
                    dadosdoItem[2] = dadosdoItem[2].replaceAll("\\[", "");
                    dadosdoItem[2] = dadosdoItem[2].replaceAll("\\]", "");
                    dadosdoItem[2] = dadosdoItem[2].replaceAll(",", "");
                    String[] auxiliar = dadosdoItem[2].split(" ");
                       tagAux = new ArrayList<String>(Arrays.asList(auxiliar));
                    }
                    
                    int fim = dadosdoItem.length;
                    Projeto projetoAux = new Projeto(dadosdoItem[6]);
                    itemAux = new Item(dadosdoItem[0],dadosdoItem[1],tagAux ,Integer.parseInt(dadosdoItem[3]),dadosdoItem[4] ,Boolean.parseBoolean(dadosdoItem[5]), projetoAux, Boolean.parseBoolean(dadosdoItem[7]));
                    ItensDesejados.add(itemAux);
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(EstoqueClasse.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
            try {
                inventario.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(EstoqueClasse.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
       
    }
    
    
    public void adicionaItem(Item item){
        ItensDesejados.add(item);
    }
    
    public int tamanho(){
        return ItensDesejados.size();
    }
    
    public Item getItem(int i ){
        if(i < ItensDesejados.size()){
        return ItensDesejados.get(i);
        }
        return null;
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
    
    public ArrayList<Item> filtraItem(ArrayList<String> tag, Projeto projeto, ArrayList<String> nomes){
        ArrayList<Item> itensEncontrados = new ArrayList<Item>();
        if(tag == null && projeto == null){
            itensEncontrados = ItensDesejados;
            return itensEncontrados;
        }
        for(int i = 0; i < ItensDesejados.size();i++){
            Item itemAux = ItensDesejados.get(i);
            ArrayList<String> tagItemEstoque = itemAux.getTags();
            String itemProjeto = itemAux.getProjeto().getNome();
            if(nomes.contains(itemAux.getNome()) && tagItemEstoque.containsAll(tag) && (itemProjeto.equals(projeto.getNome()) || projeto.getNome().equals(""))){
                itensEncontrados.add(itemAux);
            }

        }
        return itensEncontrados;
    }
        
}
