/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.Aula20.exercicios;

import java.util.Random;

/**
 *
 * @author luisb
 */
public class Exercicio03 {

    public static void main(String[] args) {
        Random ran = new Random();
        int[][] m = new int[3][3];
        int par = 0, impar = 0;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = ran.nextInt(100);
                System.out.print(m[i][j] + " - ");
                if (m[i][j] % 2 == 0) {
                    par++;
                } else {
                    impar++;
                }
            }
            System.out.println("");
        }
        System.out.println("Par = " + par);
        System.out.println("Impar = " + impar);
    }
}
