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
public class Exercicio37 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int cod = -1, codPesoMax = 0, codPesoMim = 0, codAltMax = 0, codAltMim = 0, i = 0;
        double pesoTotal = 0, alt = 0, maxPeso = 0, mimPeso = 2000, maxAlt = 0, mimAlt = 3;

        while (cod != 0) {
            System.out.print("Digite seu codigo da academia: ");
            cod = scan.nextInt();
            if (cod == 0) {
                break;
            } else {
                System.out.print("Digite sua altura: ");
                double altura = scan.nextDouble();
                System.out.print("Digite seu peso: ");
                double peso = scan.nextDouble();

                if (altura > maxAlt) {
                    maxAlt = altura;
                    codAltMax = cod;
                } else if (altura < mimAlt) {
                    mimAlt = altura;
                    codAltMim = cod;
                }
                if (peso > maxPeso) {
                    maxPeso = peso;
                    codPesoMax = cod;
                } else if (peso < mimPeso) {
                    mimPeso = peso;
                    codPesoMim = cod;
                }
                alt += altura;
                pesoTotal += peso;
                i++;
            }

        }

        System.out.println(i);
        System.out.println(alt);
        System.out.println(pesoTotal);

        System.out.println("Cliente mais alto é " + codAltMax + " com " + maxAlt + "m");
        System.out.println("Cliente mais baixo é " + codAltMim + " com " + mimAlt + "m");
        System.out.println("Cliente mais gordo é " + codPesoMax + " com " + maxPeso + "Kg");
        System.out.println("Cliente mais magro é " + codPesoMim + " com " + mimPeso + "Kg");
        System.out.println("A média de altura da academia é de " + (alt / i) + "m e o peso médio é de " + (pesoTotal / i) + "Kg");

    }
}
