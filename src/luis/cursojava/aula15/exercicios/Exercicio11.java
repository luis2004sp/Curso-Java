/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula15.exercicios;

import java.util.Scanner;

/**
 *
 * @author luisb
 */
public class Exercicio11 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu sálario atual: ");
        double sal = scan.nextDouble();

        if (sal <= 280) {
            System.out.println("Seu sálario atual é: " + sal);
            System.out.println("Seu aumento é de 20%");
            System.out.println("O aumento em reais é de: " + (sal * 0.2));
            System.out.println("Seu novo sálario é: " + (sal * 1.2));
        } else if (sal > 280 && sal <= 700) {
            System.out.println("Seu sálario atual é: " + sal);
            System.out.println("Seu aumento é de 15%");
            System.out.println("O aumento em reais é de: " + (sal * 0.15));
            System.out.println("Seu novo sálario é: " + (sal * 1.15));
        } else if (sal > 700 && sal <= 1500) {
            System.out.println("Seu sálario atual é: " + sal);
            System.out.println("Seu aumento é de 10%");
            System.out.println("O aumento em reais é de: " + (sal * 0.1));
            System.out.println("Seu novo sálario é: " + (sal * 1.1));
        } else if (sal > 1500) {
            System.out.println("Seu sálario atual é: " + sal);
            System.out.println("Seu aumento é de 5%");
            System.out.println("O aumento em reais é de: " + (sal * 0.05));
            System.out.println("Seu novo sálario é: " + (sal * 1.05));
        }
    }
}
