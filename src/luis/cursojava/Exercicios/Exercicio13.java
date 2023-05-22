package luis.cursojava.Exercicios;

import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite sua altura: ");
        double altura = scan.nextDouble();

        System.out.println("Digite 1 se você for homem e 2 se for mulher:");
        int genero = scan.nextInt();

        if (genero == 1) {
            double pesoIdeal = (72.7 * altura) - 58;
            System.out.println("Peso ideal é: " + pesoIdeal);
        } else {
            double pesoIdeal = (62.1 * altura) - 44.7;
            System.out.println("Peso ideal é: " + pesoIdeal);
        }
    }

}
