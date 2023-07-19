/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.Aula24.exercicios;

/**
 *
 * @author luisb
 */
public class ExercLampada {

    public static void main(String[] args) {
        Lampada lamp = new Lampada();

        lamp.preco = 12.99;
        lamp.cor = "Branco";
        lamp.garantia = 36;

        System.out.println("R$ " + lamp.preco);
        System.out.println(lamp.cor);
        System.out.println(lamp.garantia + " meses");

    }

}
