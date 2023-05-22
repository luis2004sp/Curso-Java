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
public class Exercicio03 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] a = new int[15], b = new int[15];

        for (int i = 0; i < a.length; i++) {
            a[i] = scan.nextInt();
            b[i] = (int) Math.pow(a[i], 2);
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println(b[i]);
        }

    }

}
