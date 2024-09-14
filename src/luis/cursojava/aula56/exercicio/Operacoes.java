/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package luis.cursojava.aula56.exercicio;

/**
 *
 * @author luisb
 */
public enum Operacoes {
    SOMA("+") {
        @Override
        double executarOperacao(double x, double y) {
            return x + y;
        }
    }, SUBTRAIR("-") {
        @Override
        double executarOperacao(double x, double y) {
            return x - y;
        }
    }, MULTIPLICAR("*") {
        @Override
        double executarOperacao(double x, double y) {
            return x * y;
        }
    }, DIVIDIR("/") {
        @Override
        double executarOperacao(double x, double y) {
            return x / y;
        }
    };

    private String simbolo;

    private Operacoes(String simbolo) {
        this.simbolo = simbolo;
    }

    abstract double executarOperacao(double x, double y);

    @Override
    public String toString() {
        return simbolo;
    }
}
