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
public class Exercicio21 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor da compra entre 10-600: ");
        int valor = scan.nextInt();
        int nota100 = 0, nota50 = 0, nota10 = 0, nota5 = 0, nota1 = 0;

        if (valor >= 10 && valor <= 600) {
            while (valor >= 100) {
                nota100++;
                valor -= 100;
            }
            while (valor >= 50) {
                nota50++;
                valor -= 50;
            }
            while (valor >= 10) {
                nota10++;
                valor -= 10;
            }
            while (valor >= 5) {
                nota5++;
                valor -= 5;
            }
            while (valor >= 1) {
                nota1++;
                valor -= 1;
            }

            System.out.println(nota100 + " Notas de 100; " + nota50 + " Notas de 50; " + nota10 + " Notas de 10; " + nota5 + " Notas de 5; " + nota1 + " Notas de 1; ");
        } else {
            System.out.println("Valor invalido");
        }
    }
}
