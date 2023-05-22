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
public class Exercicio7 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int maior = 0, numAnterior = 0, i = 0;

        do {
            System.out.println("Digite um números:");
            int num = scan.nextInt();

            if (num > maior) {
                maior = num;
            }
            i++;
        } while (i < 5);

        System.out.println("O maior número é " + maior);
    }

}
