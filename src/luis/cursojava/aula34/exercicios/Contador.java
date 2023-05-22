/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula34.exercicios;

/**
 *
 * @author luisb
 */
public class Contador {

    private static int total = 0;

    public static void incrementar(int num) {
        total += num;
    }

    public static void zerar() {
        total = 0;
    }

    public static void getTotal() {
        System.out.println("Total = " + total);
    }
}
