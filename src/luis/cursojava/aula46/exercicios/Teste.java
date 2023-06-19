/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula46.exercicios;

/**
 *
 * @author luisb
 */
public class Teste {

    public static void main(String[] args) {

        double raio = 2, lado = 3, altura = 5;

        Quadrado f1 = new Quadrado(lado);
        f1.setCor("Azul");
        f1.setNome("Quadrado");

        Circulo f2 = new Circulo(raio);
        f2.setCor("Azul");
        f2.setNome("Circulo");

        Triangulo f3 = new Triangulo(altura, lado);
        f3.setCor("Azul");
        f3.setNome("Triangulo");

        Cubo f4 = new Cubo(lado);
        f4.setCor("Azul");
        f4.setNome("Cubo");

        Cilindro f5 = new Cilindro(altura, raio);
        f5.setCor("Azul");
        f5.setNome("Cilindro");

        Piramide f6 = new Piramide();
        f6.setAltura(3);
        f6.setApotema(4);
        f6.setArestaBase(2);
        f6.setNumPoliBase(4);
        f6.setBase(f3);
        f6.setNome("Piramide");
        f6.setCor("SLa");

        FiguraGeometrica[] figs = new FiguraGeometrica[6];

        figs[0] = f1;
        figs[1] = f2;
        figs[2] = f3;
        figs[3] = f4;
        figs[4] = f5;
        figs[5] = f6;

        for (FiguraGeometrica fig : figs) {
            System.out.println(fig);
            System.out.println("");
        }

    }

}
