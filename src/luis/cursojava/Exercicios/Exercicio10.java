/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.Exercicios;

import java.util.Scanner;

/**
 *
 * @author luisb
 */
public class Exercicio10 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a temperatura em celsius: ");
        double c = scan.nextDouble();

        double f = ((c * 9 / 5) + 32);

        System.out.println(c + "ºC = " + f + "ºF");

    }

}
