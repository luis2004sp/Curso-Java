/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.Aula19.exercicios;

/**
 *
 * @author luisb
 */
public class Exercicio30 {

    public static void main(String[] args) {
        int bi = 1, ci = 1;
        int[] a = new int[20], b = new int[20], c = new int[20];

        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 101 + 1);

            if (a[i] % 2 != 0) {
                bi++;
                b[i] = a[i];
            } else {
                ci++;
                c[i] = a[i];
            }

            System.out.print(a[i] + " - ");
        }
        System.out.println("");
        for (int i = 0; i < 20; i++) {
            System.out.print(b[i] + " - ");
        }
        System.out.println("");
        for (int i = 0; i < 20; i++) {
            System.out.print(c[i] + " - ");
        }

    }
}
