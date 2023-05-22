/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.Aula20.exercicios;

import java.util.Scanner;

/**
 *
 * @author luisb
 */
public class Exercicio04 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[][] m = new String[30][24];
        boolean sair = false;

        while (!sair) {
            System.out.println("Caso queira agendar um compromisso tecle 1, caso queira consultar uma compromiso tecle 2 e 0 para sair:");
            byte compromisso = scan.nextByte();

            if (compromisso == 1) {
                System.out.println("Digite o dia e o horario(só aceia horarios redondos) que queira agendar o compromisso:");
                int dia = scan.nextInt();
                int horario = scan.nextInt();

                if (m[dia][horario] == null) {
                    System.out.println("Digite qual é o compromisso:");
                    m[dia][horario] = scan.next();
                } else {
                    System.out.println("Nesse dia já há um compromisso agendado.");
                }
            } else if (compromisso == 2) {
                System.out.println("Digite o dia e o horario(só aceia horarios redondos) do compromisso que queira :");
                int dia = scan.nextInt();
                int horario = scan.nextInt();

                if (m[dia][horario] != null) {
                    System.out.println("Seu compromisso é: " + m[dia][horario]);
                } else {
                    System.out.println("Nada agendado para esse dia e hora");
                }
            } else if (compromisso == 0) {
                sair = true;
            } else {
                System.out.println("Número invalido");
            }
        }

    }

}
