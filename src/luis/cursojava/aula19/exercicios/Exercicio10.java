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
public class Exercicio10 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] a = new double[3], b = new double[a.length];

        for (int i = 0; i < a.length; i++) {
            System.out.println("Digite A e B: ");
            a[i] = scan.nextInt();
            b[i] = a[i] % 2;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println(b[i]);

        }
    }
}
