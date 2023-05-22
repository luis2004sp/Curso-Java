/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula15.exercicios;

import java.util.Scanner;

/**
 *
 * @author luisb
 */
public class Exercicio14 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite as duas notas:");
        double nota1 = scan.nextDouble();
        double nota2 = scan.nextDouble();
        double media = (nota1 + nota2) / 2;

        if (media <= 4) {
            System.out.println("Nota E");
            System.out.println("Média :" + media);
            System.out.println("REPROVADO");
        } else if (media <= 6) {
            System.out.println("Nota D");
            System.out.println("Média :" + media);
            System.out.println("REPROVADO");
        } else if (media <= 7.5) {
            System.out.println("Nota C");
            System.out.println("Média :" + media);
            System.out.println("APROVADO");
        } else if (media <= 9) {
            System.out.println("Nota B");
            System.out.println("Média :" + media);
            System.out.println("APROVADO");
        } else if (media <= 10) {
            System.out.println("Nota A");
            System.out.println("Média :" + media);
            System.out.println("APROVADO");
        }

        System.out.println("Média de Aproveitamento   Conceito");
        System.out.println("Entre 9 e 10                    A");
        System.out.println("Entre 7,5 e 9                   B");
        System.out.println("Entre 6 e 7,5                   C");
        System.out.println("Entre 4 e 6                     D");
        System.out.println("Entre 0 e 4                     E");
    }
}
