/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula16_17.exercicios;

import java.util.Scanner;

/**
 *
 * @author luisb
 */
public class Exercicio40 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int veiculoTotal = 0, acidentes, maior = 0, menor = 1000000, cidMaior = 0, cidMenor = 0, menosVeiculos = 0, v = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Codigo da cidade: ");
            int codCidade = scan.nextInt();
            System.out.print("Número de veiculos de passeio: ");
            int veiculo = scan.nextInt();
            System.out.print("Número de acidentes com vitima: ");
            acidentes = scan.nextInt();

            if (acidentes > maior) {
                maior = acidentes;
                cidMaior = codCidade;
            }
            if (acidentes < menor) {
                menor = acidentes;
                cidMenor = codCidade;
            }
            veiculoTotal += veiculo;

            if (veiculo <= 2000) {
                menosVeiculos += veiculo;
                v++;
            }
        }
        System.out.println("As 5 cidades juntas tem uma média de " + (veiculoTotal / v) + " veiculos");
        System.out.println("Média de acidentes em cidades com menos de 2000 veiculos: " + (menosVeiculos / 5));

        System.out.println("Maior número de acidentes (" + maior + ") é da cidade " + cidMaior);
        System.out.println("Menor número de acidentes (" + menor + ") é da cidade " + cidMenor);

    }

}
