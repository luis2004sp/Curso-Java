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
public class Exercicio10 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite dois números: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        System.out.println("O intervalo entre eles é: ");

        if (num1 < num2) {
            for (int i = num1 + 1; i < num2; i++) {
                System.out.print(i + ", ");
            }
        } else {
            for (int i = num2 + 1; i < num1; i++) {
                System.out.print(i + ", ");
            }
        }

    }

}
