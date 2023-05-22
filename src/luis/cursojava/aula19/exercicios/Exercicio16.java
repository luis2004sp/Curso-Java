/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.Aula19.exercicios;

/**
 *
 * @author luisb
 */
public class Exercicio16 {

    public static void main(String[] args) {
        int[] a = new int[30];
        int menor15 = 0, igual5 = 0, maior15 = 0, divisor = 0;

        for (int i = 0; i < a.length; i++) {
            a[i] = i;

            if (a[i] < 15) {
                menor15 += a[i];
            } else if (a[i] == 15) {
                igual5 += a[i];
            } else if (a[i] > 15) {
                maior15 += a[i];
                divisor++;
            }
        }
        System.out.println("Soma menor que 15: " + menor15);
        System.out.println("Soma maior que 15: " + igual5);
        System.out.println("Soma média dos maiores que 15: " + (maior15 / divisor));

    }
}
