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
public class Exercicio9 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        double num3 = scan.nextDouble();

        if (num1 > num2 && num2 > num3) {
            System.out.println("A ordem fica: ");
            System.out.println("3º = " + num3);
            System.out.println("2º = " + num2);
            System.out.println("1º = " + num1);
        } else if (num2 > num1 && num1 > num3) {
            System.out.println("A ordem fica: ");
            System.out.println("3º = " + num3);
            System.out.println("2º = " + num1);
            System.out.println("1º = " + num2);
        } else if (num3 > num1 && num1 > num2) {
            System.out.println("A ordem fica: ");
            System.out.println("3º = " + num2);
            System.out.println("2º = " + num1);
            System.out.println("1º = " + num3);
        }
    }
}
