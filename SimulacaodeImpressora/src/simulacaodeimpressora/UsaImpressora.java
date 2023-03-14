/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simulacaodeimpressora;

/**
 *
 * @author leoma
 */
import java.util.*;

public class UsaImpressora {


    public static void main(String[] args) {
     
        Locale.setDefault(Locale.ENGLISH);
        
        Impressora impressora = new Impressora();
        impressora.bluetooth = true;
        impressora.colorida = true;
        impressora.digitalizadora = true;
        impressora.papel = true;
        impressora.wifi = true;
        
        String pal;
        String[] aux;
        Scanner ent = new Scanner(System.in);
        
        pal = ent.nextLine();
        aux = pal.split(" ");
        impressora.modelo = aux[0];
        impressora.cor = aux[1];
        impressora.tipoPapel = aux[2];
        
        impressora.status();
        impressora.ligar();
        impressora.digitalizar();
        impressora.copiar();
        impressora.desligar();
        impressora.imprimir();
    }
    
}
