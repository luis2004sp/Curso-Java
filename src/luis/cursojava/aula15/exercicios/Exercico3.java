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
public class Exercico3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite F ou M");
        String genero = scan.next();

        if ("F".equals(genero)) {
            System.out.println("F - Femenino");

        } else if ("M".equals(genero)) {
            System.out.println("M - Masculino");
        } else {
            System.out.println("Genero invalido");
        }
    }
}
