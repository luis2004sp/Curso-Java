/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula43.exercicios.exer01;

/**
 *
 * @author luisb
 */
public class ContaBancaria {

    private String nomeCliente, numConta;
    double saldo;

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" + "nomeCliente= " + nomeCliente + ", numConta= " + numConta + ", saldo= " + saldo + '}';
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void saque(double valor) {
        if ((saldo - valor) >= 0) {
            saldo -= valor;
            System.out.println("Saque realizado!");
        } else {
            System.out.println("Saque negado");
        }

    }
}
