/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula25_27.exercicios;

/**
 *
 * @author luisb
 */
public class TesteCarro {

    public static void main(String[] args) {
        Carro van = new Carro();

        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiros = 10;
        van.capacidadeCombustivel = 100;
        van.consumoCombustivel = 2.2;

        System.out.println(van.marca);
        System.out.println(van.modelo);

        Carro fusca = new Carro();

        fusca.marca = "Volkswagen";
        fusca.modelo = "Fusca";
        fusca.numPassageiros = 4;
        fusca.capacidadeCombustivel = 30;
        fusca.consumoCombustivel = 0.15;

        System.out.println(fusca.marca);
        System.out.println(fusca.modelo);

        fusca.exibirAutonomia();

        double autonomia = fusca.obterAutonomia();
        System.out.println("Autononomia = " + autonomia);
        System.out.println("Autononomia = " + fusca.obterAutonomia());

        System.out.println("Presisa de  " + fusca.calcularCombustivel(10));

    }
}
