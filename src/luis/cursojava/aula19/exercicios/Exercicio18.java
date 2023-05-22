/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.Aula19.exercicios;

/**
 *
 * @author luisb
 */
public class Exercicio18 {

    public static void main(String[] args) {
        int[] a = new int[10];
        int maiorIdade = 0, menorIdade = 90, menorI = 0, maiorI = 0;

        for (int i = 0; i < a.length; i++) {
            a[i] = (int) ((Math.random() * 81) + 0);

            System.out.println(a[i]);

            if (a[i] > maiorIdade) {
                maiorIdade = a[i];
                maiorI = i;
            }
            if (a[i] < menorIdade) {
                menorIdade = a[i];
                menorI = i;
            }
        }

        System.out.println("Maior i = " + maiorI + "com idade = " + maiorIdade);
        System.out.println("Menor i = " + menorI + "com idade = " + menorIdade);

    }
}
