/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula16_17.exercicios;

import java.util.Scanner;

/**
 *
 * @author luisb
 */
public class Exercicio36 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Montar tabuada de: ");
        int tabuada = scan.nextInt();
        System.out.print("Começar por: ");
        int inicio = scan.nextInt();
        System.out.print("terminar em: ");
        int fim = scan.nextInt();

        if (inicio < fim) {
            System.out.println("Vou montar uma tabuada de " + tabuada + "começando em " + inicio + " terminando em " + fim);

            for (int i = inicio; i <= fim; i++) {
                System.out.println(tabuada + " x " + i + " = " + (tabuada * i));
            }
        } else {
            System.out.println("Digita direito");
        }

    }

}
