/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula47;

/**
 *
 * @author luisb
 */
public class Excecao {

    public static void main(String[] args) {

        try {
            int[] vetor = new int[4];

            System.out.println("Antes da exception");

            vetor[5] = 10;

            System.out.println("Esse texto não será impresso");
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Excecão ao acessar um indice do vetor que não existe");
        }
        
        System.out.println("Esse texto será impresso depois da exception");

    }
}
