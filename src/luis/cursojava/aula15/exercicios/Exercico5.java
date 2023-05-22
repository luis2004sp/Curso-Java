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
public class Exercico5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite as duas notas: ");
        double numero1 = scan.nextDouble();
        double numero2 = scan.nextDouble();

        double media = (numero1 + numero2) / 2;

        if (media >= 7 && media < 10) {
            System.out.println("APROVADO");
        } else if (media < 7) {
            System.out.println("REPROVADO");
        } else if (media == 10) {
            System.out.println("Aprovado com Distinção");
        }
    }
}
