/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.Aula19.exercicios;

import java.util.Scanner;

/**
 *
 * @author luisb
 */
public class Exercicio13 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] a = new int[5];
        int mult = 0;

        for (int i = 0; i < a.length; i++) {
            a[i] = scan.nextInt();

            if (a[i] % 5 == 0) {
                mult += a[i];
            }
        }

        System.out.println("Soma = " + mult);
    }
}
