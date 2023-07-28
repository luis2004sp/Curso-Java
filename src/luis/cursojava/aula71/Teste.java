/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula71;

/**
 *
 * @author luisb
 */
public class Teste {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};
        ThreadSoma t1 = new ThreadSoma("n.1", array);
        ThreadSoma t2 = new ThreadSoma("n.2", array);

    }
}
