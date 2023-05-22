/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula35;

/**
 *
 * @author luisb
 */
public class TesteCalculadora {

    public static void main(String[] args) {
        int fatorialNR = Calculadora.fatorialNaoRecursivo(5);
        System.out.println(fatorialNR);

        int fatorialR = Calculadora.fatorialRecursivo(5);
        System.out.println(fatorialR);
    }
}
