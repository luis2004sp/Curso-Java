/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula69;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author luisb
 */
public class Teste {

    public static void main(String[] args) {
        MinhaThreadRunnable thread1 = new MinhaThreadRunnable("n.1", 500);
        MinhaThreadRunnable thread2 = new MinhaThreadRunnable("n.2", 500);
        MinhaThreadRunnable thread3 = new MinhaThreadRunnable("n.3", 500);

        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
        Thread t3 = new Thread(thread3);

        t1.start();
        t2.start();
        t3.start();

        for (int i = 0; i < 7; i++) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException ex) {
                Logger.getLogger(Teste.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("Programa finalizado!");
    }
}
