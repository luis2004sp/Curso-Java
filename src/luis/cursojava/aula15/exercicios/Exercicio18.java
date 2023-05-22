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
public class Exercicio18 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma data no formato de dd/mm/aaaa :");
        int dd = scan.nextInt();
        int mm = scan.nextInt();
        int aa = scan.nextInt();

        if (aa > 0) {
            if (mm >= 1 && mm <= 12) {
                if (dd >= 1 && dd <= 31) {
                    System.out.println("Formato válido");
                } else {
                    System.out.println("Formato inválido");
                }
            } else {
                System.out.println("Formato inválido");
            }
        } else {
            System.out.println("Formato inválido");
        }
    }
}
