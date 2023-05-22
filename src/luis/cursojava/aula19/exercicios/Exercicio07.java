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
public class Exercicio07 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] a = new int[3], b = new int[a.length], c = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            System.out.println("Digite A e B: ");
            a[i] = scan.nextInt();
            b[i] = scan.nextInt();
            c[i] = a[i] - b[i];
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println("Valor " + (i + 1) + " é de " + c[i]);

        }
    }
}
