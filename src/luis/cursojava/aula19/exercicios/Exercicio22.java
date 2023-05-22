/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.Aula19.exercicios;

/**
 *
 * @author luisb
 */
public class Exercicio22 {

    public static void main(String[] args) {
        int[] a = new int[10];
        double um = 0, zero = 0;

        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 2) + 0;
            System.out.println(a[i]);

            if (a[i] == 0) {
                zero++;
            } else {
                um++;
            }
        }
        System.out.println("Um = " + (um / a.length) * 100 + " %");
        System.out.println("Zero = " + (zero / a.length) * 100 + " %");

    }

}
