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
public class Exercicio28 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 0;
        double valor = 0;

        System.out.println("Fale quantos CDs você tem:");
        int cds = scan.nextInt();

        do {
            System.out.println("Quanto vale o CD?");
            valor = scan.nextDouble();

            valor += valor;
            i++;
        } while (i < cds);

        System.out.println("O preço médio é de R$" + (valor / cds));
    }
}
