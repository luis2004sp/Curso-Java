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

        System.out.printf("Hello %s%s", "World", "!");
        System.out.println("");
        System.out.printf("Hello %S%S", "World", "!");
        System.out.println("");

        System.out.printf("%c", 'a');
        System.out.printf("%n");
        System.out.printf("%C", 'a');
        System.out.printf("%n");

        int valor = 12345678;
        System.out.printf("%d", valor);

        System.out.println("");

        double pontoFlutuante = 1.23456789;
        System.out.printf("%f", pontoFlutuante);

        System.out.println("");

        String olaMundo = "Olá, Mundo!";
        System.out.printf("%20s", olaMundo);

        System.out.println("");

        System.out.printf("%-20s", olaMundo);

        System.out.println("");

        System.out.printf("%+d", valor);

        System.out.println("");

        System.out.printf("%015d", valor);

        System.out.println("");

        System.out.printf("%,d", valor);

        valor = -123456789;

        System.out.println("");

        System.out.printf("% d", valor);

        System.out.println("");

        System.out.printf("%.3f", pontoFlutuante);

        System.out.println("");

        System.out.printf("R$%10.2f%n", pontoFlutuante);

        testeCompleto();
    }

    public static void testeCompleto() {

        double[] precos = {1000, 12.34, 1234.3456, 99.99};

        for (int i = 0; i < precos.length; i++) {
            System.out.printf("%s %02d: total de R$%10.2f%n", "Item", i + 1, precos[i]);
        }
    }
}
