/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula72;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author luisb
 */
public class TikTak {

    boolean tik;

    synchronized void tik(boolean estaExcutando) {

        if (!estaExcutando) {
            tik = true;
            notify();
            return;
        }
        System.out.print("Tik ");

        tik = true;

        notify();

        while (tik) {
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(TikTak.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    synchronized void tak(boolean estaExcutando) {

        if (!estaExcutando) {
            tik = false;
            notify();
            return;
        }
        System.out.println("Tak");
        tik = false;

        notify();

        while (!tik) {
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(TikTak.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
