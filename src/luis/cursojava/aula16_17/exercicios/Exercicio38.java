/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula16_17.exercicios;

/**
 *
 * @author luisb
 */
public class Exercicio38 {

    public static void main(String[] args) {
        int anoInicial = 1995, anoAtual = 1998;
        double salarioAnterior = 1000, salarioAtual = 0, t = 0.015;

        
        for (int i = anoInicial + 1; i <= anoAtual; i++) {
            salarioAtual = salarioAnterior * (t + 1);
            salarioAnterior = salarioAtual;
            t *= 2;

        }
        System.out.println("Salario atual é de: R$" + salarioAtual);
    }
}
