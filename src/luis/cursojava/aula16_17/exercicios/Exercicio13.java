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
public class Exercicio13 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int resultado = 1;

        System.out.println("Digite o número e o expoente:");
        int num = scan.nextInt();
        int ex = scan.nextInt();

        for (int i = 1; i <= ex; i++) {
            resultado *= num;

        }

        System.out.println("Resultado = " + resultado);
    }
}
