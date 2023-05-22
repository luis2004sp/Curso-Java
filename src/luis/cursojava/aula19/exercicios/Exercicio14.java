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
public class Exercicio14 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] a = new int[5];
        int impares = 0, divisor = 0;

        for (int i = 0; i < a.length; i++) {
            a[i] = scan.nextInt();

            if (a[i] % 2 != 0) {
                impares += a[i];
                divisor++;
            }
        }

        System.out.println("Média = " + (impares / divisor));
    }
}
