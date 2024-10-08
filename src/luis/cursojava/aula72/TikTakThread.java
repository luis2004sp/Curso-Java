/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula72;

/**
 *
 * @author luisb
 */
public class TikTakThread implements Runnable {

    TikTak tt;
    Thread t;

    public TikTakThread(String nome, TikTak tt) {
        this.tt = tt;
        t = new Thread(this, nome);
        t.start();
    }

    @Override
    public void run() {
        if ("Tik".equalsIgnoreCase(t.getName())) {
            for (int i = 0; i < 5; i++) {
                tt.tik(true);
            }
            tt.tik(false);
        } else {
            for (int i = 0; i < 5; i++) {
                tt.tak(true);
            }
            tt.tak(false);
        }
    }
}
