/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula63;

/**
 *
 * @author luisb
 */
public class ExemploPrintf {

    public static void main(String[] args) {
        //% para especificar o tipo de dado
        System.out.printf("Hello %s", "Ola, Mundo!");
        System.out.println("");
        System.out.printf("%S", "Olá, Mundo!");
        System.out.println("");

        System.out.printf("%c", 'c');
        System.out.println("");
        System.out.printf("%C", 'c');
        System.out.printf("%n"); // -> \n

        int valor = 123456789;
        System.out.printf("%d", valor);

        System.out.println("");

        double pontoFlututante = 1.23456789;
        System.out.printf("%f", pontoFlututante);
        System.out.println("");

        String olaMundo = "Olá, mundo!";
        System.out.printf("%20s", olaMundo);
        System.out.println("");
        //define a quantidade da saida

        System.out.printf("+%d", valor);
        System.out.println("");

        System.out.printf("%,d", valor);
        System.out.println("");

        int valor2 = -123456789;
        System.out.printf("% d", valor2);
        System.out.println("");

        System.out.printf("R$%10.2f", pontoFlututante);
        System.out.println("");

        testeMaiscompleto();
    }

    private static void testeMaiscompleto() {
        double[] precos = {1000, 123.2312, 456, 1, 7013.112455};

        for (int i = 0; i < precos.length; i++) {
            System.out.printf("%s %02d: total de R$%,10.2f%n", "Item", i + 1, precos[i]);
        }
    }
}
