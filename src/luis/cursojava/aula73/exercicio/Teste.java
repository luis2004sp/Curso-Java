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
public class Teste {

    public static void main(String[] args) {
        Semaforo sema = new Semaforo();

        SemaforoThread verde = new SemaforoThread("Verde", sema);
        SemaforoThread vermelho = new SemaforoThread("Vermelho", sema);

        try {
            verde.t.join();
            vermelho.t.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Teste.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
