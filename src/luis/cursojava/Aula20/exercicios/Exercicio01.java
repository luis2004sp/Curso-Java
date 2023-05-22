/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.Aula20.exercicios;

/**
 *
 * @author luisb
 */
public class Exercicio01 {

    public static void main(String[] args) {
        int[][] m = new int[4][4], posicao1 = new int[1][1];
        int maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = (int) (Math.random() * 9 + 0);

                if (m[i][j] > maior) {
                    maior = m[i][j];
                }
                if (m[i][j] < menor) {
                    menor = m[i][j];
                }
            }
        }
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " - ");
            }
        }
        System.out.println("");
        System.out.println("Maior = " + maior);
        System.out.println("Maior = " + menor);

    }
}
