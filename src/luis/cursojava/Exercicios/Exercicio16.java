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
public class Exercicio16 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a área em metros quadrados para ser pintada:");
        double area = scan.nextDouble();

        // 1 litro pinta 3 metros quadrados
        // cada lata de 18 litros = 80 reais
        // cada galao de 3.6 de 25 reais
        // informe quantas latas e o preço total
        double litros = area / 3;
        double latas = litros / 18;
        double galoes = litros / 3.6;
        double valorTotalLatas = latas * 80;
        double valorTotalGaloes = galoes * 25;

        System.out.println("Você pode escolher entre:");
        System.out.println("Você pode comprar " + latas + "latas que dá um total de R$ " + valorTotalLatas);
        System.out.println("Você pode comprar " + galoes + "galões que dá um total de R$ " + valorTotalGaloes);
    }
}
