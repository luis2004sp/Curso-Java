/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula16_17.exercicios;

import java.util.Scanner;

/**
 *
 * @author luisb
 */
public class Exercicio8 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double soma = 0, media = 0, i = 0;

        do {
            System.out.println("Digite um numero:");
            double num = scan.nextDouble();

            soma += num;
            i++;
        } while (i < 5);
        media = soma / 5;

        System.out.println("A soma é: " + soma);
        System.out.println("A media é: " + media);

    }
}
