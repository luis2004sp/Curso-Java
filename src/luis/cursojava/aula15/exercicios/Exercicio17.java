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
public class Exercicio17 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um ano:");
        int ano = scan.nextInt();

        if (ano % 4 == 0) {
            System.out.println(ano + " é bissexto");
        } else {
            System.out.println(ano + " não é bissexto");
        }

    }
}
