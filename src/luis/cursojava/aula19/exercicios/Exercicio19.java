/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.Aula19.exercicios;

/**
 *
 * @author luisb
 */
public class Exercicio19 {

    public static void main(String[] args) {
        double[] nota1 = new double[10], nota2 = new double[nota1.length], result = new double[nota1.length];

        for (int i = 0; i < nota1.length; i++) {
            nota1[i] = (Math.random() * 11) + 0;
            nota2[i] = (Math.random() * 11) + 0;

            result[i] = (nota1[i] + nota2[i]) / 2;

            if (result[i] < 7) {
                System.out.println("Aluno " + (i + 1) + " - Média = " + result[i] + " - Está: REPROVADO");
            } else {
                System.out.println("Aluno " + (i + 1) + " - Média = " + result[i] + " - Está: APROVADO");

            }
        }
        System.out.println(result[0]);
        System.out.println(nota1[0]);
        System.out.println(nota2[0]);
    }
}
