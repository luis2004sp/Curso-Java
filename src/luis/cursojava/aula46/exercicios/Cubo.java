/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula46.exercicios;

/**
 *
 * @author luisb
 */
public class Cubo extends Figura3D {

    private double lado;

    public Cubo() {
    }

    public Cubo(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calculaArea() {
        return (6 * (lado * lado));
    }

    @Override
    public double calcularVolume() {
        return Math.pow(lado, 3);
    }

    @Override
    public String toString() {
        String s = "{";
        s += this.getNome() + '\n';
        s += this.getCor() + '\n';
        s += "Lado: " + this.getLado() + '\n';
        s += "Araa: " + this.calculaArea() + '\n';
        s += "Volume: " + this.calcularVolume();
        s += "}";

        return s;
    }

}
