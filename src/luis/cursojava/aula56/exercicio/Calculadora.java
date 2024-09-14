/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula56.exercicio;

/**
 *
 * @author luisb
 */
public class Calculadora {

    public static void main(String[] args) {

        double x = 10, y = 5;

        for (Operacoes op : Operacoes.values()) {
            System.out.print(x + " ");
            System.out.print(op.toString() + " ");
            System.out.print(y + " = ");
            System.out.println(op.executarOperacao(x, y));
        }
    }
}
