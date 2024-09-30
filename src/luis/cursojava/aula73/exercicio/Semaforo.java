/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula73.exercicio;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author luisb
 */
public class Semaforo {

    boolean flag;

    synchronized void verde(boolean estaExecutado) {
        if (!estaExecutado) {
            flag = true;
            notify();
            return;

        }

        try {
            Thread.sleep(200);
        } catch (InterruptedException ex) {
            Logger.getLogger(Semaforo.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("Verde");

        try {
            Thread.sleep(400);
        } catch (InterruptedException ex) {
            Logger.getLogger(Semaforo.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("Amarelo");

        flag = true;

        notify();

        while (flag) {
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Semaforo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    synchronized void vermelho(boolean estaExecutado) {
        if (!estaExecutado) {
            flag = false;
            notify();
            return;

        }

        System.out.println("Vermelho");

        try {
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            Logger.getLogger(Semaforo.class.getName()).log(Level.SEVERE, null, ex);
        }

        flag = false;

        notify();

        while (!flag) {
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Semaforo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

}
