/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula14;

import java.util.Scanner;

/**
 *
 * @author luisb
 */
public class IfElse {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com sua idade: ");
        int idade = scan.nextInt();

        if (idade >= 18) {
            System.out.println("Maior de idade!");
        } else {
            System.out.println("Menor de idade!");
        }

    }
}
