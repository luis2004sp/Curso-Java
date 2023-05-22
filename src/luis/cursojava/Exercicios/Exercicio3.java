package luis.cursojava.Exercicios;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite os dois numeros para soma: ");
        int numero1 = scan.nextInt();
        int numero2 = scan.nextInt();

        System.out.println("A soma de " + numero1 + " e " + numero2 + " é " + (numero1 + numero2));
    }
}
