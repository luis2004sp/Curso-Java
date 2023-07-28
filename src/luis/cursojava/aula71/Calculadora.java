/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula71;

/**
 *
 * @author luisb
 */
public class Calculadora {

    private int soma;

    // synchronized faz que apenas uma Thread acesse o metodo por vez
    public synchronized int somaArray(int[] array) {
        soma = 0;

        for (int i = 0; i < array.length; i++) {
            soma += array[i];

            System.out.println("Executando soma " + Thread.currentThread().getName()
                    + " Somando o valor: " + array[i] + " ;total = " + soma);

            try {
                Thread.sleep(200);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }

        return soma;
    }

}
