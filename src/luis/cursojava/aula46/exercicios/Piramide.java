/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula46.exercicios;

/**
 *
 * @author luisb
 */
public class Piramide extends Figura3D {

    private double altura, arestaBase, apotema, numPoliBase;
    private Figura2D base;

    public Piramide() {
    }

    public Piramide(double altura, double arestaBase, double apotema, double numPoliBase, Figura2D base) {
        this.altura = altura;
        this.arestaBase = arestaBase;
        this.apotema = apotema;
        this.numPoliBase = numPoliBase;
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getArestaBase() {
        return arestaBase;
    }

    public void setArestaBase(double arestaBase) {
        this.arestaBase = arestaBase;
    }

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    public double getNumPoliBase() {
        return numPoliBase;
    }

    public void setNumPoliBase(double numPoliBase) {
        this.numPoliBase = numPoliBase;
    }

    public Figura2D getBase() {
        return base;
    }

    public void setBase(Figura2D base) {
        this.base = base;
    }

    @Override
    public double calculaArea() {
        if (base != null) {
            return numPoliBase * (arestaBase * apotema / 2) + base.calculaArea();
        }
        return 0;
    }

    @Override
    public double calcularVolume() {
        if (base != null) {
            return (base.calculaArea() * altura) / 3;
        }
        return 0;
    }

    @Override
    public String toString() {
        String s = "{ ";
        s += this.getNome() + '\n';
        s += this.getCor() + '\n';
        s += "Araa: " + this.calculaArea() + '\n';
        s += "Volume: " + this.calcularVolume();
        s += " }";

        return s;
    }

}
