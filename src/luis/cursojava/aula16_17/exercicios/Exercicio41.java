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
public class Exercicio41 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double divida;
        int juros = 10;

        System.out.print("Valor da divida: R$ ");
        divida = scan.nextDouble();

        System.out.println("Valor Dívida    Valor dos Juros     Quantidade de parlecas      Valor da parcela:");
        System.out.println("R$ " + divida + "                 0                       1                   " + divida);

        for (int i = 3; i <= 12; i += 3) {
//            System.out.println("R$ " + divida + "       " + juros + "       " + i + "       " + (divida* / i));
            juros += 5;
        }
    }

}
