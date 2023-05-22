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
public class Exercicio20 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite as três notas: ");
        double nota1 = scan.nextDouble();
        double nota2 = scan.nextDouble();
        double nota3 = scan.nextDouble();
        double media = (nota1 + nota2 + nota3) / 3;

        if (media < 7) {
            System.out.println("REPROVADO");
        } else if (media < 10) {
            System.out.println("APROVADO");
        } else if (media == 10) {
            System.out.println("Aprovado com Distinção");
        }
    }
}