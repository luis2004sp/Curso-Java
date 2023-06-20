/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula50;

import java.util.Scanner;

/**
 *
 * @author luisb
 */
public class UsandoThrows {

    public static void main(String[] args) {
        System.out.println("Digite um número: ");
        try {
            double num = lerNum();
            System.out.println("Você digitou: " + num);
        } catch (Exception e) {
            System.out.println("Entrada invalida");
            e.printStackTrace();
        }
    }

    public static double lerNum() throws Exception {
        Scanner scan = new Scanner(System.in);
        double num = scan.nextDouble();
        return num;
    }
}
