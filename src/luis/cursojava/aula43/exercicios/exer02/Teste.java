/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula43.exercicios.exer02;

/**
 *
 * @author luisb
 */
public class Teste {

    public static void main(String[] args) {

        PessoaJuridica pj1 = new PessoaJuridica("Luis", 100);
        PessoaJuridica pj2 = new PessoaJuridica("Antonio", 1000);
        PessoaJuridica pj3 = new PessoaJuridica("Aloisia", 10000);

        PessoaFísica pf1 = new PessoaFísica("Luis", 2000);
        PessoaFísica pf2 = new PessoaFísica("Antonio", 2500);
        PessoaFísica pf3 = new PessoaFísica("Aloisia", 3500);

        System.out.println("Pessoas Juridicas:" + '\n');
        System.out.println(pj1.toString() + '\n');
        System.out.println(pj2.toString() + '\n');
        System.out.println(pj3.toString() + '\n');

        System.out.println("-------------------" + '\n');

        System.out.println("Pessoas Físicas:");
        System.out.println(pf1.toString() + '\n');
        System.out.println(pf2.toString() + '\n');
        System.out.println(pf3.toString() + '\n');;

    }
}
