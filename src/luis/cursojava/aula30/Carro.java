/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula30;

/**
 *
 * @author luisb
 */
public class Carro {

    String marca, modelo;
    int numPassageiros;
    double capacidadeCombustivel, consumoCombustivel;

    public Carro() {
    }

    public Carro(String marca, String modelo, int numPassageiros, double capacidadeCombustivel, double consumoCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        this.capacidadeCombustivel = capacidadeCombustivel;
        this.consumoCombustivel = consumoCombustivel;
    }

    public Carro(String marca, String modelo, int numPassageiros) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
    }

    public Carro(String marca, String modelo) {
        this(marca, modelo, 10);
        //chama um construtor dentro da calsse;
    }

    void exibirAutonomia() {
        System.out.println("Autonomia = " + (this.capacidadeCombustivel * this.consumoCombustivel) + " Km.");
    }

    double obterAutonomia() {
        System.out.println("Medoto obterAutonomia foi chamado");

        return this.capacidadeCombustivel * this.consumoCombustivel;
    }

    double calcularCombustivel(double km) {
        return km / this.consumoCombustivel;
    }
}
