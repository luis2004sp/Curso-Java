/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula46.exercicios;

/**
 *
 * @author luisb
 */
public class Triangulo extends Figura2D {

    private double altura, base;

    public Triangulo() {
    }

    public Triangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double calculaArea() {
        return ((base * altura) / 2);
    }

    @Override
    public String toString() {
        String s = "{";
        s += this.getNome() + '\n';
        s += this.getCor() + '\n';
        s += "Base: " + this.getBase() + "Altura: " + this.getAltura() + '\n';
        s += "Araa: " + this.calculaArea() + '\n';
        s += "}";

        return s;
    }

}
