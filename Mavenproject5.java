package com.mycompany.mavenproject5;

import java.util.Scanner;

public class Mavenproject5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        double a =sc.nextDouble();
        
        System.out.print("Digite a segunda nota: ");
        double b =sc.nextDouble();
        
        System.out.print("Digite a terceira nota: ");
        double c =sc.nextDouble();
        
        System.out.print("Digite a quarta nota: ");
        double d =sc.nextDouble();
        
        double media =(a+b+c+d)/4;
        
        if( media >= 9){
            System.out.println("Aprovado.");
        }
        else if( media >=7 && media <= 9){
            System.out.println("Aprovado.");
        }
        else if( media >=5 && media <= 7){
            System.out.println("Aprovado.");
        }
        else if( media >=2.5 && media <= 5){
            System.out.println("Reprovado.");
        }
        else if( media <=2.5){
            System.out.println("Reprovado.");
        }
            }

}