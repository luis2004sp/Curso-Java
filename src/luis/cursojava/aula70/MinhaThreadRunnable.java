/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package luis.cursojava.aula70;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author luisb
 */
public class MinhaThreadRunnable implements Runnable {

    private String nome;
    private int tempo;

    public MinhaThreadRunnable(String nome, int tempo) {
        this.nome = nome;
        this.tempo = tempo;
//        Thread t = new Thread(this);
//        t.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 6; i++) {
                System.out.println(nome + " - Contator" + i);

                Thread.sleep(tempo);
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(MinhaThreadRunnable.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println(nome + " terminou execução");
    }

}
