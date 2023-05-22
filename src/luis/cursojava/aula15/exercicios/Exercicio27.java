/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula15.exercicios;

import java.util.Scanner;

// se compra > 8Kg ou valor>25 = descontp 10%
/**
 *
 * @author luisb
 */
public class Exercicio27 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double valor = 0;

        System.out.println("Digite a quantidade de morrangos e maçãs:");
        double morrango = scan.nextDouble();
        double maca = scan.nextDouble();

        if (morrango <= 5) {
            valor += morrango * 2.5;
        } else {
            valor += morrango * 2.2;
        }
        if (maca <= 5) {
            valor += maca * 1.8;
        } else {
            valor += maca * 1.5;
        }

        if ((morrango + maca) >= 8 || valor > 25) {
            valor = valor * 0.9;
        }

        System.out.println("Peso total: " + (morrango + maca) + "KG");
        System.out.println("Valor a ser pago: R$" + valor);
    }
}
