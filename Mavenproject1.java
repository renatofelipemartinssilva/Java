package com.mycompany.mavenproject1;

import java.util.Scanner;

public class Mavenproject1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Em qual horario comeca o seu turno?");
        double x =sc.nextDouble();
        
        if ( x >= 5 && x <= 13){
        System.out.println("Voce trabalha no turno da manha.");
    }
        else if ( x >=13 && x <= 21){
            System.out.println("Voce trabalha no turno da tarde.");
        }
        else if ( x >= 21 && x <= 24 || x >= 1 && x <= 5){
            System.out.println("Voce trabalha no turno da noite.");
        }
}
}