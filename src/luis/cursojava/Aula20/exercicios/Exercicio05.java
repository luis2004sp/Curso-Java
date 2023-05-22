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
public class Exercicio05 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[][][] m = new String[12][30][8];
        boolean sair = false;

        while (!sair) {
            System.out.println("Caso queira agendar um compromisso tecle 1, caso queira consultar uma compromiso tecle 2 e 0 para sair:");
            System.out.println("Digite 0 para sair");
            System.out.println("Digite 1 para agendar");
            System.out.println("Digite 2 para consultar");
            byte compromisso = scan.nextByte();

            if (compromisso == 1) {
                if (compromisso == 1) {
                    System.out.println("Digite o mês, dia e o horario(só aceia horarios redondos) que queira agendar o compromisso:");
                    int mes = scan.nextInt();
                    int dia = scan.nextInt();
                    int horario = scan.nextInt();

                    if (m[mes][dia][horario] == null) {
                        System.out.println("Digite qual é o compromisso:");
                        m[mes][dia][horario] = scan.next();
                    } else {
                        System.out.println("Nesse dia já há um compromisso agendado.");
                    }
                } else if (compromisso == 2) {
                    System.out.println("Digite o dia e o horario(só aceia horarios redondos) do compromisso que queira :");
                    int mes = scan.nextInt();
                    int dia = scan.nextInt();
                    int horario = scan.nextInt();

                    if (m[mes][dia][horario] != null) {
                        System.out.println("Seu compromisso é: " + m[mes][dia][horario]);
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
}
