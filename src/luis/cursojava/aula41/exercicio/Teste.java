/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula41.exercicio;

/**
 *
 * @author luisb
 */
public class Teste {

    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro("1.8", "Labrador", "John");

        System.out.println(cachorro.getNome());
        System.out.println(cachorro.getRaca());
        System.out.println(cachorro.getTamanho());
        cachorro.emitirSom();
        cachorro.amamentar();

    }

}
