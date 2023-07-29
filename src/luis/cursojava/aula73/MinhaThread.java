/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula73;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author luisb
 */
public class MinhaThread implements Runnable {

    private String nome;
    private boolean estaSuspensa;
    private boolean stop;

    public MinhaThread(String nome) {
        this.nome = nome;
        new Thread(this, nome).start();
        this.estaSuspensa = false;
    }

    @Override
    public void run() {
        System.out.println("Executando " + this.nome);

        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Thread " + nome + ", " + i);
                Thread.sleep(300);

                synchronized (this) {
                    while (estaSuspensa) {
                        wait();
                    }
                    if (this.stop) {
                        break;
                    }
                }
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(MinhaThread.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("Thread " + nome + " terminada");
    }

    void suspend() {
        this.estaSuspensa = true;
    }

    synchronized void resume() {
        this.estaSuspensa = false;
        notify();
    }

    synchronized void stop() {
        this.stop = true;
        notify();
    }
}
