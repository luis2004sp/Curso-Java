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
public class Exercicio27 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int alunos = 0, salas = 0, i = 0;

        System.out.println("Quantas turmas tem?");
        salas = scan.nextInt();

        for (i = salas; i > 0; i--) {
            System.out.println("Quantos alunos tem na sala " + i + "?");
            alunos = scan.nextInt();

            if (alunos <= 40) {
                alunos += alunos;
            } else {
                System.out.println("Não tem salas com mais de 40 alunos");
                salas--;
            }
        }
        System.out.println("Tem uma media de " + (alunos / salas) + "por sala");
    }
}
