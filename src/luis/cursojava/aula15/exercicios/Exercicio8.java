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
public class Exercicio8 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe os 3 preços: ");
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        double num3 = scan.nextDouble();

        if (num1 < num2 && num1 < num3) {
            System.out.println("Compre o primeiro produto.");
        } else if (num2 < num1 && num2 < num3) {
            System.out.println("Compre o segundo produto.");
        } else {
            System.out.println("Compre o terceiro produto.");
        }
    }

}
