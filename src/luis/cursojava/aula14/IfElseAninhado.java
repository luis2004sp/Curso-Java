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
public class IfElseAninhado {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o preço da batata:");
        double preco = scan.nextDouble();

        if (preco <= 10) {
            System.out.println("Esta barta, pode comprar");
        } else if (preco > 10 && preco < 15) {
            System.out.println("Valor bom, mas dá pra pedir um desconto");
        } else {
            System.out.println("Procure mais!");
        }
    }
}
