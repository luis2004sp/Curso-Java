/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula16_17.exercicios;

/**
 *
 * @author luisb
 */
public class Exercicio9 {

    public static void main(String[] args) {
        System.out.println("O números impares entre 1 e 50 são:");
        for (int i = 0; i < 51; i++) {
            if (i % 2 != 0) {
                System.out.print(i + ", ");
            }
        }
    }
}
