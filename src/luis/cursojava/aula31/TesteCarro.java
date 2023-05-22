/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula31;

/**
 *
 * @author luisb
 */
public class TesteCarro {

    public static void main(String[] args) {
        Carro car = new Carro(10);


        double cal = car.calcularCombustivel(10);
        System.out.println(cal);

    }

}
