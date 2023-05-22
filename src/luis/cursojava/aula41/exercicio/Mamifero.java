/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula41.exercicio;

/**
 *
 * @author luisb
 */
public abstract class Mamifero extends Animal {

    public Mamifero() {
    }

    public Mamifero(String nome) {
        super(nome);
    }

    public void amamentar() {
        System.out.println("Glup Glup");
    }
;
}
