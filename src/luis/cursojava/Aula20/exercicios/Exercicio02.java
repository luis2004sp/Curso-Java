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
public class Exercicio02 {

    public static void main(String[] args) {
        Random ran = new Random();
        int[][] m = new int[10][10];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = ran.nextInt(100);
            }
        }

        int maiorLinha = Integer.MIN_VALUE, menorLinha = Integer.MAX_VALUE;
        for (int i = 0; i < m[5].length; i++) { //linha 5
            System.out.print(m[4][i] + " - ");

            if (m[4][i] > maiorLinha) {
                maiorLinha = m[4][i];
            }
            if (m[4][i] < menorLinha) {
                menorLinha = m[4][i];
            }
        }

        System.out.println("");
        
        int maiorColuna = Integer.MIN_VALUE, menorColuna = Integer.MAX_VALUE; //coluna 7
        for (int i = 0; i < m.length; i++) {
            System.out.print(m[i][7] + " - ");

            if (m[i][7] > maiorColuna) {
                maiorColuna = m[i][7];
            }
            if (m[i][7] < menorColuna) {
                menorColuna = m[i][7];
            }
        }
        System.out.println("");
        System.out.println("Maior na linha 5 = " + maiorLinha);
        System.out.println("Menor na linha 5 = " + menorLinha);
        System.out.println("Maior na coluna 7 = " + maiorColuna);
        System.out.println("Menor na coluna 7 = " + menorColuna);

    }
}
