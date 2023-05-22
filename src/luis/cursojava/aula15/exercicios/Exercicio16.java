/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula15.exercicios;

import java.util.Scanner;

/**
 *
 * @author luisb
 */
public class Exercicio16 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite os valores de a, b e c :");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if (a != 0) {
            double delta = Math.pow(b, 2) - 4 * a * c;
            System.out.println(delta);
            if (delta < 0) {
                System.out.println("Delta é negativo - NÂO POSSUE RAIZES REAIS");
            } else if (delta == 0) {
                double raiz = (-b + 0) / (a * 2);
                System.out.println("A raiz é " + raiz);
            } else {
                delta = Math.sqrt(delta);
                double raiz1 = (-b + delta) / (a * 2);
                double raiz2 = (-b - delta) / (a * 2);

                System.out.println("Raiz 1 = " + raiz1 + "; Raiz dois = " + raiz2);
            }
        } else {
            System.out.println("a = 0, a equação não é de segundo grau");
        }
    }
}
