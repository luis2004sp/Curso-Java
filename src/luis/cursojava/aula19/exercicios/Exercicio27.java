/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.Aula19.exercicios;

/**
 *
 * @author luisb
 */
public class Exercicio27 {

    public static void main(String[] args) {
        int[] a = new int[10];
        char[] b = new char[10];

        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 21 + 1);

            if (a[i] < 7) {
                b[i] = 'a';
            } else if (a[i] == 7) {
                b[i] = 'b';
            } else if (a[i] > 7 && a[i] < 10) {
                b[i] = 'c';
            } else if (a[i] == 10) {
                b[i] = 'd';
            } else if (a[i] > 10) {
                b[i] = 'e';
            }
            System.out.println(b[i]);
        }
    }
}
