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
public class Exercicio01 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite os dois numeros: ");
        double numero1 = scan.nextDouble();
        double numero2 = scan.nextDouble();

        if (numero1 > numero2) {
            System.out.println(numero1 + " é maior que " + numero2);
        } else {
            System.out.println("Segundo numero é maior que o primeiro");
        }
    }

}
