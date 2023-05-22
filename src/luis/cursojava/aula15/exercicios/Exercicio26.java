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
public class Exercicio26 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double valor = 0;

        System.out.println("Litros vendidos:");
        double litro = scan.nextDouble();
        System.out.println("Tipo de combustivel: G-Gasolina ou A-álcool:");
        String tipo = scan.next();

        if ("G".equals(tipo)) {
            if (litro <= 20) {
                valor = litro * 2.5 * 0.96;
                System.out.println("Valor = R$" + valor);
            } else {
                valor = litro * 2.5 * 0.94;
                System.out.println("Valor = R$" + valor);
            }
        } else if ("A".equals(tipo)) {
            if (litro <= 20) {
                valor = litro * 1.9 * 0.97;
                System.out.println("Valor = R$" + valor);
            } else {
                valor = litro * 1.9 * 0.95;
                System.out.println("Valor = R$" + valor);
            }
        } else {
            System.out.println("Tipo invalido");
        }
    }
}
