/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.Aula19.exercicios;

/**
 *
 * @author luisb
 */
public class Exercicio17 {

    public static void main(String[] args) {
        int[] grupo = new int[10];
        int maior30 = 0;

        for (int i = 0; i < 10; i++) {
            grupo[i] = (int) ((Math.random() * 101) + 0);

            System.out.println(grupo[i]);

            if (grupo[i] > 35) {
                maior30++;
            }
        }
        System.out.println("Maior que 35 = " + maior30);
    }
}
