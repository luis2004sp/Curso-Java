package luis.cursojava.Exercicios;

import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite dois numeros inteiros e um real");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        double num3 = scan.nextDouble();

        double a = (num1 * 2) * (num2 / 2);
        double b = (3 * num1) + num3;
        double c = num3 * num3 * num3;

        System.out.println("A = " + a);
        System.out.println("B = " + b);
        System.out.println("C = " + c);
    }
}
