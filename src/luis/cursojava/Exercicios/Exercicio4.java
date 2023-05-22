package luis.cursojava.Exercicios;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite as 4 notas: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        int num4 = scan.nextInt();

        int resultado = (num1 + num2 + num3 + num4) / 4;

        System.out.println("A média é: " + resultado);
    }
}
