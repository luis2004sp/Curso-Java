/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula43.exercicios.exer01;

/**
 *
 * @author luisb
 */
public class Teste {

    public static void main(String[] args) {
        ContaBancaria bc = new ContaBancaria();

        System.out.println("");
        System.out.println("---ContaBancaria---");
        bc.setNomeCliente("Luis");
        bc.setNumConta("12345");
        bc.depositar(500);
        bc.saque(100);

        System.out.println(bc);

        ContaPoupanca cp = new ContaPoupanca();

        System.out.println("");
        System.out.println("---ContaPoupanca---");
        cp.setNomeCliente("Luis");
        cp.setNumConta("12345");
        cp.depositar(500);
//        cp.saque(100);
        cp.calcularNovoSalto(10);

        System.out.println(cp);

        ContaEspecial ce = new ContaEspecial();
        System.out.println("");
        System.out.println("---ContaEspecial---");
        ce.setNomeCliente("Luis");
        ce.setNumConta("12345");
        ce.setLimite(50);
        ce.depositar(100);
        ce.saque(100);
        ce.saque(50);
        ce.saque(1);
        System.out.println(ce);
    }
}
