package com.mycompany.mavenproject8;

import java.util.Scanner;

public class Mavenproject8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de A (em cm): ");
        int A = scanner.nextInt();
        System.out.print("Digite o valor de B (em cm): ");
        int B = scanner.nextInt();
        System.out.print("Digite o valor de C (em cm): ");
        int C = scanner.nextInt();

        if (A + B > C && A + C > B && B + C > A) {
            
            if (A == B && B == C) {
                System.out.println("Os lados formam um triângulo equilátero.");
            } else if (A == B || A == C || B == C) {
                System.out.println("Os lados formam um triângulo isósceles.");
            } else {
                System.out.println("Os lados formam um triângulo escaleno.");
            }
        } else {
            System.out.println("Os lados não formam um triângulo.");
        }

        scanner.close();
    }
}