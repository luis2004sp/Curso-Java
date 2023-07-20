/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula56.exercicio;

import java.util.Scanner;

/**
 *
 * @author luisb
 */
public class Calculadora {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double n1 = scan.nextDouble();
        System.out.print("Digite o segundo número: ");
        double n2 = scan.nextDouble();

        System.out.println("Adição (+)");
        System.out.println("Subtração (-)");
        System.out.println("Multiplicação (*)");
        System.out.println("Divisão (/)");
        System.out.print("Escolha a o tipo de calculo: ");
        String operacao = scan.next();

        switch (operacao) {
            case "+" ->
                System.out.println(calculos.SOMA.executarOperacao(n1, n2));

            case "-" ->
                System.out.println(calculos.SUBTRACAO.executarOperacao(n1, n2)
                );
            case "*" ->
                System.out.println(calculos.MULTI.executarOperacao(n1, n2)
                );
            case "/" ->
                System.out.println(calculos.DIV.executarOperacao(n1, n2)
                );
        }

    }

    enum calculos {
        SOMA {
            @Override
            public double executarOperacao(double n1, double n2) {
                return (n1 + n2);
            }
        }, SUBTRACAO {
            @Override
            public double executarOperacao(double n1, double n2) {
                return (n1 - n2);
            }
        }, MULTI {
            @Override
            public double executarOperacao(double n1, double n2) {
                return (n1 * n2);
            }
        }, DIV {
            @Override
            public double executarOperacao(double n1, double n2) {
                return (n1 / n2);
            }
        };

        public abstract double executarOperacao(double n1, double n2);
    }

}
