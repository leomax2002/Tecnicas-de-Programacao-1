/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testacirculo;


import java.util.*;
        
class Circulo{
    private int x,y,raio;
    public static final double PI = 3.14159;
    public Circulo(int x, int y, int raio){
        this.x = x;
        this.y = y;
        this.raio = raio;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getRaio() {
        return raio;
    }
    public void setRaio(int raio){
        this.raio = raio;
    }
    public double circunferencia(){
        return 2 * PI * raio;
    }
}

public class TestaCirculo {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        
        int x,y, raio;
        Circulo[] circulo1 = new Circulo[3];
        x = ent.nextInt();
        y = ent.nextInt();
        raio = ent.nextInt();
        circulo1[0] = new Circulo (x,y,raio);
        x = ent.nextInt();
        y = ent.nextInt();
        raio = ent.nextInt();
        circulo1[1] = new Circulo (x,y,raio);
        x = ent.nextInt();
        y = ent.nextInt();
        raio = ent.nextInt();
        circulo1[2] = new Circulo (x,y,raio);
        
        Circulo[] circulo2 = circulo1;
        
        Circulo[] circulo3 = new Circulo[3];
        circulo3[0] = new Circulo(circulo1[0].getX(),circulo1[0].getY(),circulo1[0].getRaio());
        circulo3[1] = new Circulo(circulo1[1].getX(),circulo1[1].getY(),circulo1[1].getRaio());
        circulo3[2] = new Circulo(circulo1[2].getX(),circulo1[2].getY(),circulo1[2].getRaio());
        
        x = ent.nextInt();
        y = ent.nextInt();
        raio = ent.nextInt();
        
        circulo1[0].setRaio(x);
        circulo1[1].setRaio(y);
        circulo1[2].setRaio(raio);
        System.out.println("vetor1:");
        for(int i = 0; i < 3; i++){
            System.out.printf("%d %d %d\n",circulo1[i].getX(),circulo1[i].getY(),circulo1[i].getRaio());
        }
        
        System.out.println("vetor2:");
        for(int i = 0; i < 3; i++){
            System.out.printf("%d %d %d\n",circulo2[i].getX(),circulo2[i].getY(),circulo2[i].getRaio());
        }
        
        System.out.println("vetor3:");
        for(int i = 0; i < 3; i++){
            System.out.printf("%d %d %d\n",circulo3[i].getX(),circulo3[i].getY(),circulo3[i].getRaio());
        }
    }
    
}
