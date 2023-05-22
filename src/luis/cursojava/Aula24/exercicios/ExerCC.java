/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.Aula24.exercicios;

/**
 *
 * @author luisb
 */
public class ExerCC {

    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();

        cc.numConta = "123";
        cc.agencia = "10";
        cc.contaEspecial = true;
        cc.limite = 10000;
        cc.saldo = 100;

        System.out.println("Número da Conta = " + cc.numConta);
    }
}
