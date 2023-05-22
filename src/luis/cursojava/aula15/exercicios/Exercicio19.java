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
public class Exercicio19 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = scan.nextInt();

        int centena = 0, dezena = 0, unidade = 0, num = numero;

        if (numero < 1000) {
            while (numero >= 100) {
                centena++;
                numero -= 100;
            }
            while (numero >= 10) {
                dezena++;
                numero -= 10;
            }
            while (numero >= 1) {
                unidade++;
                numero -= 1;
            }

            System.out.println(num + " = " + centena + " centenas, " + dezena + " dezena, " + unidade + " unidades.");
        } else {
            System.out.println("Número invalido.");
        }
    }
}
