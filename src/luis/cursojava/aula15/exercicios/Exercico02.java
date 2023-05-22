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
public class Exercico02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número:");
        double numero = scan.nextDouble();

        if (numero >= 0) {
            System.out.println(numero + " é possitivo");
        } else {
            System.out.println(numero + " é negativo");
        }
    }
}
