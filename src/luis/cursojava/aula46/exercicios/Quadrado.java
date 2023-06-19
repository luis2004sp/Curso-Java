/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula46.exercicios;

/**
 *
 * @author luisb
 */
public class Quadrado extends Figura2D {

    private double lado;

    public Quadrado() {
    }

    public Quadrado(double lado) {
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
        return lado * lado;
    }

    @Override
    public String toString() {
        String s = "{";
        s += this.getNome() + '\n';
        s += this.getCor() + '\n';
        s += "Lado: " + this.getLado() + '\n';
        s += "Araa: " + this.calculaArea() + '\n';
        s += "}";

        return s;
    }

}
