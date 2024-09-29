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

    public static void main(String[] args) throws InterruptedException {
        MinhaThreadRunnable thread1 = new MinhaThreadRunnable("Thread 01", 500);
        MinhaThreadRunnable thread2 = new MinhaThreadRunnable("Thread 02", 700);
        MinhaThreadRunnable thread3 = new MinhaThreadRunnable("Thread 03", 900);

        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
        Thread t3 = new Thread(thread3);

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.println("Programa finalizado");
    }
}
