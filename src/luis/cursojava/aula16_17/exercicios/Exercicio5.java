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
public class Exercicio5 {

    public static void main(String[] args) {
        int populacaoA, populacaoB, ano = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe quantos habitantes tem a População A e a sua taxa de crescimento: ");
        populacaoA = scan.nextInt();
        double taxaA = scan.nextDouble();
        System.out.println("Informe quantos habitantes tem a População B e a sua taxa de crescimento: ");
        populacaoB = scan.nextInt();
        double taxaB = scan.nextDouble();

        taxaA = taxaA/100;
        taxaB = taxaB/100;
        
        while (populacaoA < populacaoB) {
            populacaoA *= (taxaA + 1);
            populacaoB *= (taxaB + 1);
            ano++;
        }

        System.out.println("Anos para a população A iguale ou passe a B: " + ano);
        System.out.println("População A = " + populacaoA);
        System.out.println("População B = " + populacaoB);
    }
}
