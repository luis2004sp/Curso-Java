/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula34.exercicios;

/**
 *
 * @author luisb
 */
public class Calculadora {

    public static double soma(double n1, double n2) {
        return n1 + n2;
    }

    public static double subtrai(double n1, double n2) {
        return n1 - n2;
    }

    public static double mult(double n1, double n2) {
        return n1 * n2;
    }

    public static double div(double n1, double n2) {
        return n1 / n2;
    }

    public static double potencia(double base, double expoente) {
        return Math.pow(base, expoente);
    }

    public static int fatorial(int a) {
        int total = 1;

        for (int i = a; i > 0; i--) {
            total *= i;
        }
        return total;
    }
}
