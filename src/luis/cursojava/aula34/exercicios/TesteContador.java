/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula34.exercicios;

/**
 *
 * @author luisb
 */
public class TesteContador {

    public static void main(String[] args) {

        Contador.getTotal();

        Contador.incrementar(10);
        Contador.incrementar(10);
        Contador.incrementar(10);
        Contador.incrementar(10);

        Contador.getTotal();
        Contador.zerar();
        Contador.getTotal();
    }
}
