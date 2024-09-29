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
    private boolean flag;

    public MinhaThread(String nome) {
        this.nome = nome;
        this.flag = false;
        new Thread(this, nome).start();
    }

    @Override
    public void run() {
        System.out.println("Executando " + this.nome);

        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(300);
                synchronized (this) {
                    while (flag) {
                        wait();
                    }
                }
            } catch (InterruptedException ex) {
                Logger.getLogger(MinhaThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        System.out.println("Thread " + nome + " Terminada");
    }

    void suspend() {
        this.flag = true;
    }

    synchronized void resume() {
        this.flag = false;

        notify();
    }
}
