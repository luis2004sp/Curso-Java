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
public class Exercicio30 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("insira o preço do pão:");
        double pao = scan.nextDouble();

        System.out.println("Panificadora Pão de Ontem - Tabela de preços: ");

        for (int i = 1; i < 51; i++) {
            System.out.println(i + " - R$ " + (i * pao));
        }
    }
}
