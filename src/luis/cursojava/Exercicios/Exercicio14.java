package luis.cursojava.Exercicios;

import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {
        double multa = 4, pesoMax = 50, peso, excesso;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o peso que foi pescado: ");
        peso = scan.nextDouble();
        excesso = peso - pesoMax;

        if (peso > pesoMax) {
            multa = multa * excesso;

            System.out.println("Sua multa é de: " + multa);
        } else {
            System.out.println("TUDO CERTO");
        }
    }
}
