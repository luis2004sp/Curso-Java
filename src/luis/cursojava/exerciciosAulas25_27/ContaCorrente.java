/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.exerciciosAulas25_27;

/**
 *
 * @author luisb
 */
public class ContaCorrente {

    int numero;
    double saldo, limite;
    boolean contaEspecial = false;

    void saque(double valor) {
        if (saldo - valor >= 0) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso!");
        } else {
            System.out.println("ERRO: Saque indisponivel!\nValor solicitado maior do que valor em conta");
        }
    }

    void deposito(double dep) {
        saldo += dep;
    }

    void saldo() {
        System.out.println("Seu saldo é de: R$" + saldo);
    }

    void chequeEspecial() {
        if (contaEspecial == false) {
            System.out.println("O cliente não usa cheque especial.");
        } else {
            System.out.println("O cliente está usando cheque especial.");

        }
    }
}
