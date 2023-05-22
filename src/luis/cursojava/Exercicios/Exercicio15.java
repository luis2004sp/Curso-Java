package luis.cursojava.Exercicios;

import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o quanto você ganha por hora e quantas horas vc trabalha:");
        int horas = scan.nextInt();
        double valorHora = scan.nextDouble();

        double salario = horas * valorHora;

        double IR = salario * 0.11;
        double inss = salario * 0.08;
        double sindicato = salario * 0.05;
        double salarioLiquido = salario - (IR + inss + sindicato);

        System.out.println("Seu salario bruto é: " + salario + " R$");
        System.out.println("Desconto do IR: " + IR + " R$");
        System.out.println("Desconto do INSS: " + inss + " R$");
        System.out.println("Desconto do sindicato: " + sindicato + " R$");
        System.out.println("Seu salario liquido é: " + salarioLiquido + " R$");
    }
}
