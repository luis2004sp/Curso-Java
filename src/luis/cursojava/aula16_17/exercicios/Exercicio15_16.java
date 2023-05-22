/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula16_17.exercicios;

/**
 *
 * @author luisb
 */
public class Exercicio15_16 {

    public static void main(String[] args) {
        int primeiro = 1, segundo = 2, terceiro;

        for (int i = 0; i < 13; i++) {
            terceiro = primeiro + segundo;
            primeiro = segundo;
            segundo = terceiro;
            System.out.print(terceiro + ", ");
        }

        do {
            terceiro = primeiro + segundo;
            primeiro = segundo;
            segundo = terceiro;
            System.out.print(terceiro + ", ");
        } while (terceiro < 500);
    }
}
