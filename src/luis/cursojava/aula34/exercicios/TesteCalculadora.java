/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula34.exercicios;

/**
 *
 * @author luisb
 */
public class TesteCalculadora {

    public static void main(String[] args) {
        double a = 3, b = 2;

        show(Calculadora.soma(a, b));
        show(Calculadora.subtrai(a, b));
        show(Calculadora.mult(a, b));
        show(Calculadora.div(a, b));
        show(Calculadora.potencia(a, b));

        show(Calculadora.fatorial(5));

    }

    static void show(double num) {
        System.out.println(num);
    }
}
