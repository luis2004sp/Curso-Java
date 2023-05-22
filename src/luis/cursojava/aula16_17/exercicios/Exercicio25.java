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
public class Exercicio25 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int idade = 0, idadeTotal = 0, i = 0;
        String resposta;

        do {
            System.out.println("Digite sua idade:");
            idade = scan.nextInt();
            System.out.println("Tem mais pessoas?");
            resposta = scan.next();

            idadeTotal += idade;
            i++;
        } while (!"nao".equals(resposta));

        double media = idadeTotal / i;

        if (media < 25) {
            System.out.println("Turma jovem.");
        } else if (media < 60) {
            System.out.println("Turma adulta.");
        } else {
            System.out.println("Turma idosa.");
        }
    }
}
