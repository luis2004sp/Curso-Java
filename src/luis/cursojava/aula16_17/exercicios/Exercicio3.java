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
public class Exercicio3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = scan.next();
        System.out.println("Digite sua idade:");
        int idade = scan.nextInt();
        System.out.println("Digite seu salário:");
        double salario = scan.nextDouble();
        System.out.println("Digite seu genero:");
        String genero = scan.next();
        System.out.println("Digite seu estado civil:");
        String estado = scan.next();

        while (nome.length() < 3) {
            System.out.println("Nome muito curto, digite novamente:");
            nome = scan.next();
        }
        System.out.println("Nome aprovado!");

        while (idade < 0 || idade > 150) {
            System.out.println("Idade invalida, digite novamente:");
            idade = scan.nextInt();
        }
        System.out.println("Idade Aprovada!");
        while (salario < 0) {
            System.out.println("Sálario invalido, digite novamente:");
            salario = scan.nextDouble();
        }
        System.out.println("Idade Aprovada!");
        while (!"f".equals(genero) && !"m".equals(genero)) {
            System.out.println("Genero invalido, digite novamente:");
            genero = scan.next();
        }
        System.out.println("Genero Aprovada!");
        while (!"s".equals(estado) && !"c".equals(estado) && !"v".equals(estado) && !"d".equals(estado)) {
            System.out.println("Estado civil invalido, digite novamente:");
            estado = scan.next();
        }
        System.out.println("Cadastro aprovado!");
    }
}
