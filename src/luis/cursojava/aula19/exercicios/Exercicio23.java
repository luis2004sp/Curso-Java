/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.Aula19.exercicios;

/**
 *
 * @author luisb
 */
public class Exercicio23 {

    public static void main(String[] args) {
        int[] a = new int[5];
        int par = 0;

        do {
            for (int i = 0; i < a.length; i++) {
                a[i] = (int) ((Math.random() * 101) + 1);

                System.out.println(a[i]);

                if (a[i] % 2 != 0) {
                    break;
                } else {
                    par++;
                }
            }
        } while (par != 10);
        System.out.println("Tudo par!");
    }
}
