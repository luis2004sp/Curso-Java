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
public class Teste {

    public static void main(String[] args) {

        TikTak tt = new TikTak();
        TikTakThread tik = new TikTakThread("Tik", tt);
        TikTakThread tak = new TikTakThread("Tak", tt);

        try {
            tik.t.join();
            tak.t.join();

        } catch (InterruptedException ex) {
            Logger.getLogger(Teste.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
