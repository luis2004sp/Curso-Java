package luis.cursojava.Exercicios;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o tamaho em metros: ");
        double metros = scan.nextDouble();
        double centimetros = metros * 100;

        System.out.println(metros + " m = " + centimetros + " cm.");
    }
}
