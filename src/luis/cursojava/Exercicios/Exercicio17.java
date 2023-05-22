package luis.cursojava.Exercicios;

import java.util.Scanner;

public class Exercicio17 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a área em metros quadrados para ser pintada:");
        double area = scan.nextDouble();

        // 1 litro pinta 3 metros quadrados
        // cada lata de 18 litros = 80 reais
        // informe quantas latas e o preço total
        double litros = area / 3;
        double latas = litros / 18;
        double valorTotal = latas * 80;

        System.out.println("Você deverá comprar " + latas + " que dá um total de R$ " + valorTotal);
    }
}
