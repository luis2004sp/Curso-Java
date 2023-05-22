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
public class Exercicio14 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int par = 0, impar = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um número:");
            int num = scan.nextInt();

            if (num % 2 == 0) {
                par++;
            } else {
                impar++;
            }

        }

        System.out.println("São: " + '\n' + par + " par(es)" + impar + " impar(es)");
    }

}
