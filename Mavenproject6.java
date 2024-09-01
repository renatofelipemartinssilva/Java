package com.mycompany.mavenproject6;

import java.util.Scanner;

public class Mavenproject6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a sua idade: ");
        double x =sc.nextDouble();
        
        if(x >=5 && x <= 7){
            System.out.println("Infantil A.");
    }
        else if (x >= 8 && x <= 10){
            System.out.println("Infantil B.");
    }
        else if (x >= 11 && x <= 13){
            System.out.println("Juvenil A.");
    }
        else if (x >= 14 && x <= 17){
            System.out.println("Juvenil B.");
    }
        else if (x >= 18){
            System.out.println("Senior.");
    }
    
    }
}
