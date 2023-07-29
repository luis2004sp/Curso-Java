/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula72;

/**
 *
 * @author luisb
 */
public class TikTak {

    boolean tik;

    synchronized void tik(boolean exc) {
        if (!exc) {
            tik = true;
            notify();
            return;
        }

        System.out.print("Tik");

        tik = true;

        notify();// notifica a outra Thread para que ela execute

        try {
            while (tik) {

                wait();//espera a execurção da outra Thread
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

    }

    synchronized void tak(boolean exc) {
        if (!exc) {
            tik = false;
            notify();
            return;
        }

        System.out.println("Tak");

        tik = false;

        notify();
        try {
            while (!tik) {

                wait();
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

}
