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
public class Exercico33 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double temp, tempTotal = 0, maxTemp = -20000, mimTemp = 2000, i = 0;
        String resp;

        do {
            System.out.println("Informe a temperatura:");
            temp = scan.nextDouble();

            if (temp > maxTemp) {
                maxTemp = temp;
            }
            if (temp < mimTemp) {
                mimTemp = temp;
            }

            tempTotal += temp;

            System.out.println("Tem outra temperatura?");
            resp = scan.next();
            i++;
        } while (!"nao".equals(resp));

        System.out.println(i);
        System.out.println("A maior temperatura é: " + maxTemp);
        System.out.println("A menor temperatura é: " + mimTemp);
        System.out.println("A média de temperatura é: " + (tempTotal / i));

    }
}
