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
public class Exercicio15 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int lado1 = scan.nextInt();
        int lado2 = scan.nextInt();
        int lado3 = scan.nextInt();

        if ((lado1 + lado2) >= lado3) {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Triângulo Equilatero");
            } else if (lado1 == lado2 || lado2 == lado3 || lado3 == 1) {
                System.out.println("Triângulo Isósceles");
            } else if (lado1 != lado2 && lado2 != lado3 && lado3 != 1) {
                System.out.println("Triângulo Isósceles");
            }
        }
    }
}
