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
        Quadrado q = new Quadrado();
        q.setLado(2);
        q.setNome("Quadrado");

        Circulo c = new Circulo();
        c.setRaio(2);
        c.setNome("Circulo");

        Triangulo t = new Triangulo();
        t.setAltura(2);
        t.setBase(3);
        t.setNome("Triangulo");

        Cubo cubo = new Cubo();
        cubo.setLado(3);
        cubo.setNome("Cubo");

        Cilindro cili = new Cilindro();
        cili.setAltura(3);
        cili.setRaio(2);
        cili.setNome("Cili");

        Piramide piri = new Piramide();
        piri.setAltura(3);
        piri.setApotema(4);
        piri.setArestaBase(2);
        piri.setNumPoliBase(4);
        piri.setBase(q);
        piri.setNome("Piramide");

        FiguraGeometrica[] figuras = new FiguraGeometrica[6];

        figuras[0] = q;
        figuras[1] = c;
        figuras[2] = t;
        figuras[3] = cubo;
        figuras[4] = cili;
        figuras[5] = piri;

        for (FiguraGeometrica figura : figuras) {
            System.out.println("--------------");
            System.out.println("Nome: " + figura.getNome());

            if (figura instanceof Figura2D) {
                Figura2D f2d = (Figura2D) figura;
                System.out.println("Area = " + f2d.calcularArea());
            }
            if (figura instanceof Figura3D) {
                Figura3D f3d = (Figura3D) figura;
                System.out.println("Area = " + f3d.calcularArea());
                System.out.println("Volume = " + f3d.calcularVolume());
            }
        }

    }
}
