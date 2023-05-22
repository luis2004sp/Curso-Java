/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula29;

/**
 *
 * @author luisb
 */
public class Carro {

    String marca, modelo;
    int numPassageiros;
    double capacidadeCombustivel, consumoCombustivel;

    public Carro(String marca, String modelo, int numPassageiros, double capacidadeCombustivel, double consumoCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        this.capacidadeCombustivel = capacidadeCombustivel;
        this.consumoCombustivel = consumoCombustivel;
    }

    void exibirAutonomia() {
        System.out.println("Autonomia = " + (capacidadeCombustivel * consumoCombustivel) + " Km.");
    }

    double obterAutonomia() {
        System.out.println("Medoto obterAutonomia foi chamado");

        return capacidadeCombustivel * consumoCombustivel;
    }

    double calcularCombustivel(double km) {
        return km / consumoCombustivel;
    }
}
