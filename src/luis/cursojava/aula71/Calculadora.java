/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula71;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author luisb
 */
public class Calculadora {

    private int soma;

    // synchronized impede que várias Threads acessem o mesmo recurso ao mesmo tempo
    public synchronized int somaArray(int[] array) {

        soma = 0;

        for (int i = 0; i < array.length; i++) {
            soma += array[i];

            System.out.println("Executando a soma " + Thread.currentThread().getName()
                    + " somando o valor " + array[i] + " com o total de " + soma);

            try {
                Thread.sleep(200);
            } catch (InterruptedException ex) {
                Logger.getLogger(Calculadora.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return soma;
    }
}
