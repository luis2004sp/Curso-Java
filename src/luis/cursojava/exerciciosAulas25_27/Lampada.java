/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.exerciciosAulas25_27;

/**
 *
 * @author luisb
 */
public class Lampada {

    String modelo, tenccao, cor, tipoLuz;
    double voltagem, preco, potencia, garantia;
    String[] tipos;
    boolean ligada = false;

    void status() {
        if (ligada == false) {
            System.out.println("Lampada está desligada!");

        } else {
            System.out.println("Lampada está ligada!");

        }
    }

    void liga() {
        ligada = true;
        System.out.println("Lampada ligada!");
    }

    void desliga() {
        ligada = false;
        System.out.println("Lampada desligada!");
    }
}
