package luis.cursojava.aula73;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Teste {

    public static void main(String[] args) {
        MinhaThread t1 = new MinhaThread("n.1");
        MinhaThread t2 = new MinhaThread("n.2");

        t1.suspend();

        try {
            Thread.sleep(200);
        } catch (InterruptedException ex) {
            Logger.getLogger(Teste.class.getName()).log(Level.SEVERE, null, ex);
        }

        t2.suspend();

        t1.resume();

        try {
            Thread.sleep(200);
        } catch (InterruptedException ex) {
            Logger.getLogger(Teste.class.getName()).log(Level.SEVERE, null, ex);
        }

        t2.resume();

        t2.stop();
    }
}
