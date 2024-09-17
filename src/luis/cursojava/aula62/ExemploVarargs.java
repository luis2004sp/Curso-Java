/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula62;

/**
 *
 * @author luisb
 */
public class ExemploVarargs {

    public static void main(String[] args) {
        int a = 2, b = 3, c = 4;
        int[] vetor = {a, b, c};

        System.out.println(soma(2, 3));
        System.out.println(soma(a, b, c));
        System.out.println(soma(vetor));
        System.out.println(soma(soma(2, 3), soma(a, b, c), soma(vetor)));
    }

    static int soma(int a, int b) {
        return a + b;
    }

    static int soma(int a, int b, int c) {
        return a + b + c;
    }

    static int soma(int[] vetor) {
        int total = 0;

        for (int i = 0; i < vetor.length; i++) {
            total += vetor[i];
        }
        return total;
    }

    static int soma(Integer... vetor) {
        int total = 0;

        for (Integer vetor1 : vetor) {
            total += vetor1;
        }
        return total;
    }

}
