/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula69;

public class MinhaThreadRunnable implements Runnable {

    private String nome;
    private int tempo;

    public MinhaThreadRunnable(String nome, int tempo) {
        this.nome = nome;
        this.tempo = tempo;

    }

    @Override
    public void run() {

        for (int i = 0; i < 5; i++) {
            System.out.println(nome + " contador " + (i + 1));
            try {
                Thread.sleep(this.tempo);
            } catch (InterruptedException ex) {

            }
        }

        System.out.println(nome + " terminou a execução");

    }

}
