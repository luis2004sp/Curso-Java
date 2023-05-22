/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula35;

/**
 *
 * @author luisb
 */
public class Calculadora {

    // Não Recursivo
    public static int fatorialNaoRecursivo(int a) {
        if (a == 0) {
            return 1;
        }

        int total = 1;
        for (int i = a; i > 0; i--) {
            total *= i;
        }
        return total;
    }

    //Recursivo
    public static int fatorialRecursivo(int num) {
        if (num == 0) {
            return 1;
        }

        return num * fatorialRecursivo(num - 1);
    }
}
