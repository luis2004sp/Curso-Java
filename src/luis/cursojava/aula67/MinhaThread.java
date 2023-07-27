/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula67;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author luisb
 */
public class MinhaThread extends Thread {

    private String nome;
    private int tempo;

    public MinhaThread(String nome, int tempo) {
        this.nome = nome;
        this.tempo = tempo;
        this.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 6; i++) {
                System.out.println(nome + " contator: " + i);// executa essa linha
                Thread.sleep(tempo);// espera/dorme por um certo tempo
                //executa o for novamente
            }

        } catch (InterruptedException ex) {
            Logger.getLogger(MinhaThread.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println(nome + " - Terminou execução");
    }

}
