package com.mycompany.mavenproject3;

import java.util.Scanner;

public class Mavenproject3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1.BigMac");
        System.out.println("2.Quarteirao");
        System.out.println("3.MacChicken");
        System.out.println("4.Cheddar");
        System.out.println("5.Chesse Burguer");
        System.out.print("Qual o seu pedido?(digite o numero)");
        double x =sc.nextDouble();
        
        if( x == 1){
            System.out.println("BigMac");
        }
        else if( x == 2){
            System.out.println("Quarteirao");
        }
        else if( x == 3){
            System.out.println("MacChicken");
        }
        else if( x == 4){
            System.out.println("Cheddar");
        }
        else if( x == 5){
            System.out.println("Chesse Burguer");
        }
        else {
            System.out.println("Opçao invalida");
        }
    }
    
}