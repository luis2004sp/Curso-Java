/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula33.exercicios;

/**
 *
 * @author luisb
 */
public class ContaCorrente {

    private int numero;
    private double saldo, limite;
    private boolean especial;

    public ContaCorrente(int numero, double saldo, double limite, boolean especial) {
        this.numero = numero;
        this.saldo = saldo;
        this.limite = limite;
        this.especial = especial;
    }
    
    

    public void saque(double valor) {
        if (saldo - valor >= 0) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso!");
        } else {
            System.out.println("ERRO: Saque indisponivel!\nValor solicitado maior do que valor em conta");
        }
    }

    public void deposito(double dep) {
        saldo += dep;
    }

    public void saldo() {
        System.out.println("Seu saldo é de: R$" + saldo);
    }

    public void chequeEspecial() {
        if (especial == false) {
            System.out.println("O cliente não usa cheque especial.");
        } else {
            System.out.println("O cliente está usando cheque especial.");

        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

}
