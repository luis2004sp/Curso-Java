/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.Aula19.exercicios;

/**
 *
 * @author luisb
 */
public class Exercicio29 {

    public static void main(String[] args) {
        int[] a = new int[10], b = new int[10], c = new int[20];
        int j = 0;

        for (int i = 0; i < 10; i++) {
            c[i] = a[i] = (int) (Math.random() * 101 + 1);
            b[i] = (int) (Math.random() * 101 + 1);
        }
        for (int i = 10; i < 20; i++) {

            c[i] = b[j];
            j++;
        }
        for (int i = 0; i < 20; i++) {
            System.out.println(c[i]);
        }
    }
}
