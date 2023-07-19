/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula43.exercicios.exer01;

/**
 *
 * @author luisb
 */
public class ContaEspecial extends ContaBancaria {

    private double limite;

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public String toString() {
        String s = "Conta Especial{";
        s += "Limite: " + this.limite;
        s += "; " + super.toString();
        s += ";";
        return s;
    }

    @Override
    public void saque(double valor) {

        double saldoComLimite = this.getSaldo() + this.getLimite();

        if ((saldoComLimite - valor) >= 0) {
            this.setSaldo(this.getSaldo() - valor);
            System.out.println("Saque realizado!");
        } else {
            System.out.println("Saque indisponivel");
        }

    }

}
