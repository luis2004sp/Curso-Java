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
public class Exercicio12 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o seu salário atual: ");
        double sal = scan.nextDouble();

        if (sal <= 900) {
            double inss = sal * 0.1;
            double fgts = sal * 0.11;

            System.out.println("Salário Bruto: R$ " + sal);
            System.out.println("(-)IR: Isento ");
            System.out.println("(-)INSS (10%): R$ " + inss);
            System.out.println("FGTS (11%): R$ " + fgts);
            System.out.println("Desconto total: R$ " + (inss + fgts));
            System.out.println("Salário Liquidol: R$ " + (sal - inss - fgts));
        } else if (sal <= 1500) {
            double ir = sal * 0.05;
            double inss = sal * 0.1;
            double fgts = sal * 0.11;

            System.out.println("Salário Bruto: R$ " + sal);
            System.out.println("(-)IR (5%): R$ " + ir);
            System.out.println("(-)INSS (10%): R$ " + inss);
            System.out.println("FGTS (11%): R$ " + fgts);
            System.out.println("Desconto total: R$ " + (inss + fgts + ir));
            System.out.println("Salário Liquidol: R$ " + (sal - inss - fgts - ir));
        } else if (sal <= 2500) {
            double ir = sal * 0.1;
            double inss = sal * 0.1;
            double fgts = sal * 0.11;

            System.out.println("Salário Bruto: R$ " + sal);
            System.out.println("(-)IR (10%): R$ " + ir);
            System.out.println("(-)INSS (10%): R$ " + inss);
            System.out.println("FGTS (11%): R$ " + fgts);
            System.out.println("Desconto total: R$ " + (inss + fgts + ir));
            System.out.println("Salário Liquidol: R$ " + (sal - inss - fgts - ir));
        } else if (sal > 2500) {
            double ir = sal * 0.2;
            double inss = sal * 0.1;
            double fgts = sal * 0.11;

            System.out.println("Salário Bruto: R$ " + sal);
            System.out.println("(-)IR (20%): R$ " + ir);
            System.out.println("(-)INSS (10%): R$ " + inss);
            System.out.println("FGTS (11%): R$ " + fgts);
            System.out.println("Desconto total: R$ " + (inss + fgts + ir));
            System.out.println("Salário Liquidol: R$ " + (sal - inss - fgts - ir));
        }

    }
}
