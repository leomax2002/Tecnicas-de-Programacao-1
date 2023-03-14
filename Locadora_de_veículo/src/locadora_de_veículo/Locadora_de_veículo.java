/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package locadora_de_veículo;

import java.util.*;

public class Locadora_de_veículo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        String[] aux;
        String pal;
        
        pal = ent.nextLine();
        aux = pal.split(" ");
        
        Veiculo carro = new Veiculo(aux[0],aux[1],aux[2],aux[3],Integer.parseInt(aux[4]));
        
        pal = ent.nextLine();
        aux = pal.split(" ");
        
        Motorista mot = new Motorista(Integer.parseInt(aux[0]),aux[1],aux[2],aux[3]);
        
        pal = ent.nextLine();
        aux = pal.split(" ");
        
        Cliente cliente = new Cliente(Integer.parseInt(aux[0]),aux[3],aux[1],aux[2],aux[4]);
        
        pal = ent.nextLine();
        aux = pal.split(" ");
        
        Chamado cham = new Chamado(Integer.parseInt(aux[0]),aux[1],aux[2],aux[3],aux[4],Float.parseFloat(aux[5]),Float.parseFloat(aux[6]),Double.parseDouble(aux[7]),Double.parseDouble(aux[8]),Double.parseDouble(aux[9]));
        
        System.out.println(cham.getId_chamado());
        System.out.println(cham.getDestino());
        System.out.println(carro.getPlaca());
        System.out.println(cliente.getRG());
        System.out.println(mot.getNome());
        
    }
    
}
