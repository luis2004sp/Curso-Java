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
public class Exercicio2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome, senha;

        System.out.println("Digite seu nome e senha:");
        nome = scan.next();
        senha = scan.next();

        while (nome.equals(senha)) {
            System.out.println("ERROR: usuario igual a senha");
            System.out.println("Digite novamente seu nome e senha:");
            nome = scan.next();
            senha = scan.next();
        }
        System.out.println("Cadastro realizado!");
    }
}
