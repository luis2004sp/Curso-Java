package luis.cursojava.Exercicios;

import java.util.Scanner;

/**
 *
 * @author luisb
 */
public class Exercicio7 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor da lateral do quadrado: ");
        double lateral = scan.nextDouble();

        double area1 = (lateral * lateral);
        double area2 = 2 * (lateral * lateral);

        System.out.println("A área do quadrado é: " + area1);
        System.out.println("A área do quadrado é: " + area2);

    }
}
