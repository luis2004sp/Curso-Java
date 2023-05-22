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
public class Exercicio6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite 3 números:");
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        double num3 = scan.nextDouble();

        if (num1 > num2 && num1 > num3) {
            System.out.println("O maior número é " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("O maior número é " + num2);
        } else {
            System.out.println("O maior número é " + num3);
        }
    }
}
