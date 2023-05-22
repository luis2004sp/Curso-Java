/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.Aula19.exercicios;

/**
 *
 * @author luisb
 */
public class Exercicio20_21 {

    public static void main(String[] args) {
        double[] A = new double[20];
        double cotacao = 5.23;

        for (int i = 1; i < 20; i++) {
            A[i] = cotacao * i;

            System.out.println(A[i]);
        }
    }
}
