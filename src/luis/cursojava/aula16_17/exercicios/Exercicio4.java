/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula16_17.exercicios;

/**
 *
 * @author luisb
 */
public class Exercicio4 {

    public static void main(String[] args) {
        int populacaoA = 80000, populacaoB = 200000, ano = 0;
        // cresce 3% ano        cresce 1.5% ano

        while (populacaoA < populacaoB) {
            populacaoA *= 1.03;
            populacaoB *= 1.015;
            ano++;
        }

        System.out.println("Anos para a população A iguale ou passe a B: " + ano);
        System.out.println("População A = " + populacaoA);
        System.out.println("População B = " + populacaoB);
    }
}
