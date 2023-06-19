/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula46.exercicios;

/**
 *
 * @author luisb
 */
public class Circulo extends Figura2D {

    private double raio;

    public Circulo() {
    }

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calculaArea() {
        return (Math.PI * raio * raio);
    }

    @Override
    public String toString() {
        String s = "{";
        s += this.getNome() + '\n';
        s += this.getCor() + '\n';
        s += "Raio: " + this.getRaio() + '\n';
        s += "Araa: " + this.calculaArea() + '\n';
        s += "}";

        return s;
    }

}
