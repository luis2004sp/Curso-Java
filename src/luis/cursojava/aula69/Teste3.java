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
public class Teste3 {

    public static void main(String[] args) {
        MinhaThreadRunnable thread1 = new MinhaThreadRunnable("n.1", 500);
        MinhaThreadRunnable thread2 = new MinhaThreadRunnable("n.2", 750);
        MinhaThreadRunnable thread3 = new MinhaThreadRunnable("n.3", 1000);

        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
        Thread t3 = new Thread(thread3);

        t1.start();
        t2.start();
        t3.start();

        //Depois de iniciar as threads
        try {//Faz esperar que as Thread acabem pra continuar o codigo
            t1.join();
            t2.join();
            t3.join();

        } catch (InterruptedException ex) {
            Logger.getLogger(Teste3.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("Programa finalizado!");
    }
}
