/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula70;

import java.util.logging.Level;
import java.util.logging.Logger;
import luis.cursojava.aula69.MinhaThreadRunnable;

/**
 *
 * @author luisb
 */
public class Teste {

    public static void main(String[] args) {
        MinhaThreadRunnable thread1 = new MinhaThreadRunnable("#1", 500);
        MinhaThreadRunnable thread2 = new MinhaThreadRunnable("#2", 700);
        MinhaThreadRunnable thread3 = new MinhaThreadRunnable("#3", 900);

        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
        Thread t3 = new Thread(thread3);

        //Prioridade que vai ser executado
        t1.setPriority(6);
        t2.setPriority(3);
        t3.setPriority(1);

        t1.start();
        t2.start();
        t3.start();

        //Espera as Threads acabarem para continuar o Main
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Teste.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("Programa Finalizado");
    }

}
