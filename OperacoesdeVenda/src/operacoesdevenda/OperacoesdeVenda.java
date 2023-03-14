/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operacoesdevenda;

import java.util.*;

public class OperacoesdeVenda {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner ent = new Scanner(System.in);
        int n;
        n = ent.nextInt();
        ent.nextLine();
        String[] prod = new String[n];
        int[] numero_produtos = new int[n];
        for(int i = 0; i < n; i++){
            String temp = ent.nextLine();
            String[] temp_2 = temp.split(" ");
            prod[i] = temp_2[0];
            numero_produtos[i] = Integer.parseInt(temp_2[1]);
        }
        
        List<String> produtos = Arrays.asList(prod);
        while(ent.hasNext()){
            String temp_3 = ent.nextLine();
            if(produtos.contains(temp_3)){
                int num_retirado = ent.nextInt();
                ent.nextLine();
                int temp_4 = produtos.indexOf(temp_3);
                numero_produtos[temp_4] = numero_produtos[temp_4] - num_retirado;
                System.out.printf("%s %d\n",temp_3,num_retirado);
            }
            else if("fim".equals(temp_3)){
                break;
            }
            else{
                System.out.println(temp_3 + " produto não encontrado");
            }
        }
        for(int i = 0; i < n; i++){
            System.out.printf("%s %d\n",prod[i],numero_produtos[i]);
        }
    }
    
}
