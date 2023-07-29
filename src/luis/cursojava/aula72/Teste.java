/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula72;

/**
 *
 * @author luisb
 */
public class Teste {

    public static void main(String[] args) {
        TikTak tt = new TikTak();
        ThreadTikTak tik = new ThreadTikTak("Tik", tt);
        ThreadTikTak tak = new ThreadTikTak("Tak", tt);

        try {
            tik.t.join();
            tak.t.join();

        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

    }
}
