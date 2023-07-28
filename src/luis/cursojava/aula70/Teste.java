/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula70;

/**
 *
 * @author luisb
 */
public class Teste {

    public static void main(String[] args) {
        MinhaThreadRunnable thread1 = new MinhaThreadRunnable("n.1", 500);
        MinhaThreadRunnable thread2 = new MinhaThreadRunnable("n.2", 500);
        MinhaThreadRunnable thread3 = new MinhaThreadRunnable("n.3", 500);

        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
        Thread t3 = new Thread(thread3);

        //Nivel de prioridade de 0 a 10
        t1.setPriority(5);
        t2.setPriority(3);
        t3.setPriority(1);

        //Usando as constates de prioridade da class Thread
//        t1.setPriority(Thread.MAX_PRIORITY);
//        t2.setPriority(Thread.NORM_PRIORITY);
//        t3.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
    }
}
