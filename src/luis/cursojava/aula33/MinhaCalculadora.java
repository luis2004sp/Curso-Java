/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula33;

/**
 *
 * @author luisb
 */
public class MinhaCalculadora {

    // sobrecarga de métodos 
    public int soma(int num1, int num2) {
        return num1 + num2;
    }

    public double soma(double num1, double num2) {
        return num1 + num2;
    }

    public int soma(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public int soma(int[] vetorInteriros) {
        int total = 0;

        for (int i = 0; i < vetorInteriros.length; i++) {
            total += vetorInteriros[i];
        }
        return total;
    }
}
