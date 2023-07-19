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
public class Exercicio18_19 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int menor = 2147483647, maior = 0, soma = 0, i = 5;

        do {
            System.out.println("Digite um número: ");
            int num = scan.nextInt();

            if (num >= 0 && num <= 1000) {
                soma += num;

                if (num < menor) {
                    menor = num;
                }
                if (num > maior) {
                    maior = num;
                }

            } else {
                System.out.println("Numero invalido");
            }
            i--;
        } while (i > 0);

        System.out.println("A soma é: " + soma);
        System.out.println("O menor numero é: " + menor);
        System.out.println("O maior numero é: " + maior);

    }
}
