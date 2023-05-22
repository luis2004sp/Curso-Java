package luis.cursojava.Exercicios;

import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a quantidade de horas que você trabalha por mês e o preço da sua hora:");
        int horas = scan.nextInt();
        double preco = scan.nextDouble();

        double sal = horas * preco;

        System.out.println("O seu salario é: " + sal);
    }
}
