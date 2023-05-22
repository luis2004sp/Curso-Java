/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula25_27.exercicios;

/**
 *
 * @author luisb
 */
public class Carro {

    String marca, modelo;
    int numPassageiros;
    double capacidadeCombustivel, consumoCombustivel;

    // nome de classe começa com um verbo
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
