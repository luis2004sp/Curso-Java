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
public class Exercicio24 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double i = 0, num, soma = 0;
        String resposta;

        do {
            System.out.println("Digite um numero: ");
            num = scan.nextInt();
            System.out.println("Tem mais números?");
            resposta = scan.next();
            i++;
            soma += num;
        } while (!"nao".equals(resposta));

        double media = soma / i;
        System.out.println("A media é de: " + media);

    }
}
