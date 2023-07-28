/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula68;

/**
 *
 * @author luisb
 */
public class Teste {

    public static void main(String[] args) {
        MinhaThreadRunnable thread1 = new MinhaThreadRunnable("n1", 500);

        //`Pode iniciar desse jeito ou dentro do proprio construtor
//        Thread t1 = new Thread(thread1);
//        t1.start();
        MinhaThreadRunnable thread2 = new MinhaThreadRunnable("n2", 750);

        MinhaThreadRunnable thread3 = new MinhaThreadRunnable("n3", 1000);

    }

}
