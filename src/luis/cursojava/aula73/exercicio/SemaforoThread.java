/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula73.exercicio;

/**
 *
 * @author luisb
 */
public class SemaforoThread implements Runnable {
    
    Semaforo sema;
    Thread t;
    
    public SemaforoThread(String nome, Semaforo sema) {
        this.sema = sema;
        t = new Thread(this, nome);
        t.start();
    }
    
    @Override
    public void run() {
        if ("Verde".equalsIgnoreCase(t.getName())) {
            for (int i = 0; i < 10; i++) {
                sema.verde(true);
            }
            sema.verde(false);
            
        } else {
            for (int i = 0; i < 10; i++) {
                sema.vermelho(true);
            }
            sema.vermelho(false);
        }
        
    }
    
}
