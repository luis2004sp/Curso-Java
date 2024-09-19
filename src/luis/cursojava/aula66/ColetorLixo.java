/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula66;

import luis.cursojava.aula36.exercicios.Contato;

/**
 *
 * @author luisb
 */
public class ColetorLixo {

    public static void main(String[] args) {
        Contato[] contatos = new Contato[1000000];

        for (int i = 0; i < contatos.length; i++) {
            Contato contato = new Contato("Contato" + i, "12345-6789" + i, "contato" + 1 + "@gmail.com");

            contatos[i] = contato;

        }

        System.out.println("Contatos criados");

        obterMemoria();

        contatos = null;

        Runtime.getRuntime().runFinalization();

        Runtime.getRuntime().gc();//coletor de lixo é acionado

        System.out.println("Contatos removidos");

        obterMemoria();

    }

    static void obterMemoria() {

        final int MB = 1024 * 1024;

        Runtime runtime = Runtime.getRuntime(); //singleton

        System.out.println((runtime.totalMemory() - runtime.freeMemory()) / MB);
    }
}
