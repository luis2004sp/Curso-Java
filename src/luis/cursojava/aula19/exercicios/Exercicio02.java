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
public class Exercicio02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] a = new int[8], b = new int[8];

        for (int i = 0; i < a.length; i++) {
            a[i] = scan.nextInt();
        }

        for (int i = 0; i < b.length; i++) {
            b[i] = a[i] * 2;

            System.out.println(b[i]);
        }
    }

}
