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
public class Exercicio31 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 1;
        double valor = 0, valorTotal = 0;

        System.out.println("Lojas Trabajara" + '\n');

        do {
            System.out.print("Produto " + i + ": R$ ");
            valor = scan.nextDouble();
            valorTotal += valor;
            i++;
        } while (valor != 0);

        System.out.println("Total: R$ " + valorTotal);
        System.out.print("Dinheiro: R$ ");
        double dinheiro = scan.nextDouble();
        System.out.println("Troco: R$ " + (dinheiro - valorTotal));

    }
}
