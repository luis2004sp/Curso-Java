/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula64;

/**
 *
 * @author luisb
 */
public class Anonima {

    public void print() {
        System.out.println("Qualquer texto");
    }

    public static void main(String[] args) {
        Anonima anonima = new Anonima() {
            @Override
            public void print() {
                System.out.println("Qualquer texto sobrescrito");
            }

        };
        anonima.print();

        Texto texto = new Texto() {
            @Override
            public void print() {
                System.out.println("Texto interface");
            }

        };
        texto.print();
    }
}
