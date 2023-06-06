/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula46.exercicios;

/**
 *
 * @author luisb
 */
public class Cilindro extends Figura3D {

    private double altura, raio;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        double areaBase = Math.PI * raio * raio;
        double areaLateral = 2 * Math.PI * raio * altura;
        double areaTotal = (2 * areaBase) + areaLateral;

        return areaTotal;
    }

    @Override
    public double calcularVolume() {
        return Math.PI * (raio * raio * altura);
    }

}
