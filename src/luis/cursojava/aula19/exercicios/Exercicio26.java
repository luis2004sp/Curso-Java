/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.Aula19.exercicios;

/**
 *
 * @author luisb
 */
public class Exercicio26 {

    public static void main(String[] args) {
        int[] a = new int[10], b = new int[a.length], c = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 11 + 1);
            b[i] = (int) (Math.random() * 11 + 1);

            if (a[i] > b[i]) {
                c[i] = 1;
            } else if (a[i] == b[i]) {
                c[i] = 0;
            } else if (a[i] < b[i]) {
                c[i] = -1;
            }

            System.out.println(a[i]);
            System.out.println(b[i]);
            System.out.println(c[i]);

        }
    }

}
