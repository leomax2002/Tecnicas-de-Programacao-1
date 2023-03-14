/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author leoma
 */
class Conta {
    private int numeroConta, senha;
    private String nomeCliente;
    private double saldo;
    
    public Conta(int numeroConta, String nomeCliente, double saldo, int senha){
        
        this.numeroConta = numeroConta;
        this.senha = senha;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
               
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public double getSaldo(int senha) {
        if(senha == this.senha){
            return saldo;
        }
        return -1;
    }
    
    public boolean saque(double val_saque, int senha){
        
        if(val_saque > 0 && val_saque < this.saldo && senha == this.senha){
            
            this.saldo -= val_saque;
            return true;
        }
        
        else{
            
            return false;
        }
    }
    
    public boolean deposito(double val_deposito, int senha){
        
        if(val_deposito > 0 && senha == this.senha){
            
            this.saldo += val_deposito;
            return true;
        }
        
        else{
            
            return false;
        }
    }
    
    public boolean transferencia(double val_transferencia, int senha, Conta conta2){
        
        if(val_transferencia > 0 && val_transferencia < this.saldo && senha == this.senha){
            
            this.saldo -= val_transferencia;
            conta2.saldo += val_transferencia;
            return true;
        }
        
        else{
            
            return false;
        }
    }
    
}
