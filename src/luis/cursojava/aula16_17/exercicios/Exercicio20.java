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
public class Exercicio20 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int r = 1, num;
        String cont;

        do {
            System.out.println("Digite o numero: ");
            num = scan.nextInt();

            if (num >= 0 && num <= 16) {
                for (int i = 1; i < num + 1; i++) {
                    r *= i;
                }
                System.out.println(num + "! = " + r);
            } else {
                System.out.println("Numero invalido!");
                break;
            }

            r = 1;

            System.out.println("Fazer outra conta?");
            cont = scan.next();
        } while (!"nao".equals(cont));

    }
}
