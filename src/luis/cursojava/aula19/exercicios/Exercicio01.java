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
public class Exercicio01 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] A = new int[5];
        int[] B = new int[5];

        for (int i = 0; i < A.length; i++) {
            System.out.println("Digite um numero:");
            A[i] = scan.nextInt();
            B[i] = A[i];
        }

        for (int i : B) {
            System.out.println(i);
        }
    }
}
