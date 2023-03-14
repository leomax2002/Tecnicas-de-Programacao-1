/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package banco;

/**
 *
 * @author leoma
 */
import java.util.*;
public class Banco {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner ent = new Scanner(System.in);
        String[] pal;
        int comando, aux;
        double aux2;
        String aux3;
        
        pal = ent.nextLine().split(" ");
        
        int numero_conta = Integer.parseInt(pal[0]);
        int senha = Integer.parseInt(pal[1]);
        String cliente = pal[2];
        double saldo = Double.parseDouble(pal[3]);
        
        Conta conta1 = new Conta(numero_conta,cliente,saldo,senha);
        
        pal = ent.nextLine().split(" ");
        
        numero_conta = Integer.parseInt(pal[0]);
        senha = Integer.parseInt(pal[1]);
        cliente = pal[2];
        saldo = Double.parseDouble(pal[3]);
        
        Conta conta2 = new Conta(numero_conta,cliente,saldo,senha);
        
        
        while(true){
            comando = ent.nextInt();
            
            if(comando == 1){
                
                aux = ent.nextInt();
                aux2 = conta1.getSaldo(aux);
                
                if (aux2 == -1){
                    System.out.println("senha incorreta");
                }
                else{
                    System.out.printf("%.2f\n",aux2);
                }
                
            }
            
            else if(comando == 2){
                aux2 = ent.nextDouble();
                aux = ent.nextInt();
                
                if(conta1.saque(aux2, aux)){
                    System.out.println("saque realizado");
                }
                else{
                    System.out.println("saque não realizado");
                }
                
            }
            else if(comando == 3){
                aux2 = ent.nextDouble();
                aux = ent.nextInt();
                
                if(conta1.deposito(aux2, aux)){
                    System.out.println("depósito realizado");
                }
                else{
                    System.out.println("depósito não realizado");
                }
            }
            else if(comando == 4){
                ent.nextLine();
                aux3 = ent.nextLine();
                String aux4 = conta2.getNomeCliente();
                
                if(aux4.equals(aux3)){
                    
                    aux2 = ent.nextDouble();
                    aux = ent.nextInt();
                    
                    if(conta1.transferencia(aux2, aux, conta2)){              
                        System.out.println("transferência realizada");
                    }
                    
                    else{
                        System.out.println("transferência não realizada");
                    }
                }
                
                else{
                    
                    System.out.println("nenhum usuário encontrado"); 
                }
                
            }
            else if(comando == 5){
                break;
            }
            
        }
   
    }
    
}
