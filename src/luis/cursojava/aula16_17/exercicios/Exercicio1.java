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
public class Exercicio1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = 0;

        do {
            System.out.println("Digite um número entre 0 e 10:");
            num = scan.nextInt();
        } while (num < 1 || num > 10);

    }
}
