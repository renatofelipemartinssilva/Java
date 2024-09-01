package com.mycompany.mavenproject2;

import java.util.Scanner;

public class Mavenproject2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual o seu peso?");
        double x =sc.nextDouble();
        
        System.out.print("Qual a sua altura?");
        double y =sc.nextDouble();
        
        double imc;
        
        imc = x / ( y * y);
        
        if( x < 18){
            System.out.println("Magreza.");
        }
        else if( x >= 18 && x <= 24.9 ){
        System.out.println("Saudavel.");
    }
        else if( x >= 25 && x <= 29.9 ){
        System.out.println("Sobrepeso.");
    }
        else if( x >= 30 ){
        System.out.println("Obesidade.");
    }
    }
    
}