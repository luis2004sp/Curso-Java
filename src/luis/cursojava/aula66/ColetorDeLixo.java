/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula66;

import luis.cursojava.aula61.Contato;

/**
 *
 * @author luisb
 */
public class ColetorDeLixo {

    public static void main(String[] args) {

        Contato[] contatos = new Contato[1000000];
        Contato contato;

        for (int i = 0; i < contatos.length; i++) {
            contato = new Contato("Contato" + 1, "1234-56789" + 1, "Contato" + i + "@email.com");
            contatos[i] = contato;
        }

        System.out.println("Contatos Criados");

        obterMemoriaUsada();

        contatos = null;

        Runtime.getRuntime().runFinalization(); // finaliza os objetos que não estão sendo usados

        Runtime.getRuntime().gc();// executa o garbage collector

        System.out.println("Contatos removidos da memória");

        obterMemoriaUsada();
    }

    public static void obterMemoriaUsada() {

        final int MB = 1024 * 10234;

        Runtime runtime = Runtime.getRuntime(); //padrão singleton

        System.out.println((runtime.totalMemory() - runtime.freeMemory()) / MB);
    }
}
