/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula34;

/**
 *
 * @author luisb
 */
public class TesteCalculadora {

    static int resultSoma;

    public static void main(String[] args) {
//        sem static
//        MinhaCalculadora calc =  new MinhaCalculadora();
//        calc.soma(1, 2);
//        
//      com static
        resultSoma = MinhaCalculadora.soma(1, 2);

        soma2Valores(1, 2);

    }

    static int soma2Valores(int a, int b) {
        return MinhaCalculadora.soma(a, b);
    }
}
