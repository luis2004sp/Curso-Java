/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.Aula19.exercicios;

/**
 *
 * @author luisb
 */
public class Exercicio25 {

    public static void main(String[] args) {
        int[] a = new int[10], b = new int[10];

        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 11 + 1);
            System.out.println("a = "+a[i]);
            if (a[i] % 2 == 0) {
                b[i] = 1;
            } else {
                b[i] = 0;
            }
            System.out.println(b[i]);
        }

    }
}
