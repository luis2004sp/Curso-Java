/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.Aula21;

import java.util.Random;

/**
 *
 * @author luisb
 */
public class ForEach {

    public static void main(String[] args) {
        Random ran = new Random();
        int[] notas = new int[10];

        //Exemplo 01
        for (int nota : notas) { //for each
            nota = ran.nextInt(11);
            System.out.print(nota + " - ");
        }
        System.out.println("");
        //Exemplo 02
        int[][] notasAlunos = new int[3][4];

        for (int[] notasAluno : notasAlunos) {
            for (int i : notasAluno) {
                int n = ran.nextInt(11);
                System.out.print(n + " - ");
            }
            System.out.println("");
        }
    }
}
