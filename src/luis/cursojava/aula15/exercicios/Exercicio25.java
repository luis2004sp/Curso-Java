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
public class Exercicio25 {

    public static void main(String[] args) {
        int sim = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Telefonou para a vitima?");
        String perg1 = scan.next();
        System.out.println("Esteve no local do crime?");
        String perg2 = scan.next();
        System.out.println("Mora perto da vítima?");
        String perg3 = scan.next();
        System.out.println("Devia para a vítima?");
        String perg4 = scan.next();
        System.out.println("já trabalhou com a vítima?");
        String perg5 = scan.next();

        if ("Sim".equals(perg1)) {
            sim++;
        }
        if ("Sim".equals(perg2)) {
            sim++;
        }
        if ("Sim".equals(perg3)) {
            sim++;
        }
        if ("Sim".equals(perg4)) {
            sim++;
        }
        if ("Sim".equals(perg5)) {
            sim++;
        }

        switch (sim) {
            case 2:
                System.out.println("Suspeito");
                break;
            case 3:
            case 4:
                System.out.println("Cúmplice");
                break;
            case 5:
                System.out.println("Assassino");
                break;
            default:
                System.out.println("Inocente");
                break;
        }
    }

}
