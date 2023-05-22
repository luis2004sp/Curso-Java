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
public class Exercicio26 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int candidato1 = 0, candidato2 = 0, candidato3 = 0, eleitores, voto;

        System.out.println("Fale quantos eleitores tem:");
        eleitores = scan.nextInt();

        do {
            System.out.println("Para quem vai se voto?");
            System.out.println("Se for Candidato 1 digite 1");
            System.out.println("Se for Candidato 2 digite 2");
            System.out.println("Se for Candidato 3 digite 3");
            voto = scan.nextInt();

            switch (voto) {
                case 1 ->
                    candidato1++;
                case 2 ->
                    candidato2++;
                case 3 ->
                    candidato3++;
                default -> {
                }
            }

            eleitores--;
        } while (eleitores > 0);

        System.out.println("O VENCEDOR É ");

        if (candidato1 > candidato2 && candidato2 > candidato3) {
            System.out.print("Candidato 1!!!");
        } else if (candidato2 > candidato3 && candidato3 > candidato1) {
            System.out.print("Candidato 2!!!");

        } else if (candidato3 > candidato2 && candidato2 > candidato1) {
            System.out.print("Candidato 2!!!");

        }
    }
}
