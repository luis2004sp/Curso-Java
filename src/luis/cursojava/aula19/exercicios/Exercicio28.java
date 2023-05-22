/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.Aula19.exercicios;

/**
 *
 * @author luisb
 */
public class Exercicio28 {

    public static void main(String[] args) {
        int[] a = new int[10], b = new int[10];
        int ai = a.length - 1, bi = 0;

        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 16 + 1);
            System.out.print(a[i] + " - ");
        }
        System.out.println('\n');
        while (bi != a.length) {
            b[bi] = a[ai];

            System.out.print(b[bi] + " - ");

            bi++;
            ai--;
        }
    }

}
