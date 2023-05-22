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
public class Exercicio6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o raio do circulo: ");
        double raio = scan.nextDouble();
        double pi = Math.PI;

        double area = pi * (raio * raio);

        System.out.println("A área é: " + area + " cm/m");
    }
}
