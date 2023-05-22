/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula34;

/**
 *
 * @author luisb
 */
public class MinhaCalculadora {

    // o metodo static permide a gente usar esse medoto soma sem inicializar um objeto no main
    public static int soma(int num1, int num2) {
        return num1 + num2;
    }

    public static double soma(double num1, double num2) {
        return num1 + num2;
    }

    public static int soma(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static int soma(int[] vetorInteriros) {
        int total = 0;

        for (int i = 0; i < vetorInteriros.length; i++) {
            total += vetorInteriros[i];
        }
        return total;
    }
}
