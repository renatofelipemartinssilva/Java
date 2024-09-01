package com.mycompany.mavenproject7;

import java.util.Scanner;

public class Mavenproject7 {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro dia: ");
        int dia1 = scanner.nextInt();
        System.out.print("Digite o primeiro mes: ");
        int mes1 = scanner.nextInt();
        System.out.print("Digite o primeiro ano: ");
        int ano1 = scanner.nextInt();

        System.out.print("Digite o segundo dia: ");
        int dia2 = scanner.nextInt();
        System.out.print("Digite o segundo mes: ");
        int mes2 = scanner.nextInt();
        System.out.print("Digite o segundo ano: ");
        int ano2 = scanner.nextInt();

        if (ano1 < ano2 || (ano1 == ano2 && mes1 < mes2) || (ano1 == ano2 && mes1 == mes2 && dia1 < dia2)) {
            System.out.printf("Data 1: %02d/%02d/%04d\n", dia1, mes1, ano1);
            System.out.printf("Data 2: %02d/%02d/%04d\n", dia2, mes2, ano2);
        } else {
            System.out.printf("Data 2: %02d/%02d/%04d\n", dia2, mes2, ano2);
            System.out.printf("Data 1: %02d/%02d/%04d\n", dia1, mes1, ano1);
        }

        scanner.close();
    }
}
    
