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
public class Exercicio24 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num1, num2, resultado = 0;

        System.out.println("Digite dois numeros :");
        num1 = scan.nextDouble();
        num2 = scan.nextDouble();

        System.out.println("Digite + para somar; - subtrair, x multiplicar; / dividir.");
        String operador = scan.next();

        switch (operador) {
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "*":
                resultado = num1 * num2;
                break;
            case "/":
                resultado = num1 / num2;
                break;
        }
        if (resultado % 2 == 0) {
            System.out.print(resultado + " é par");
        } else {
            System.out.print(resultado + " é impar");
        }

        if (resultado >= 0) {
            System.out.print(", possitivo");
        } else {
            System.out.print(", negativo");
        }
        if (resultado % 1 == 0) {
            System.out.print(" e inteiro.");
        } else {
            System.out.print(" e decimal.");
        }
    }
}
