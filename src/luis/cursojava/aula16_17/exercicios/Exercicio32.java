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
public class Exercicio32 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int fatorial = 1;

        System.out.print("Digite um número: ");
        int num = scan.nextInt();

        for (int i = 1; i <= num; i++) {
            fatorial *= i;
        }
        System.out.println(num + "! = " + fatorial);
    }
}
