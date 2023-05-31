/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula43.exercicios.exer02;

/**
 *
 * @author luisb
 */
public class PessoaJuridica extends Contribuinte {

    public PessoaJuridica() {
    }

    public PessoaJuridica(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public String toString() {
        String s = "PessoaJuridica{" + '\n';
        s += "Nome: " + this.getNome() + '\n';
        s += "Salario: R$" + this.getSalario() + '\n';
        s += "Imposto: R$" + this.calcularImposto();
        s += '}' + '\n';
        return s;
    }

    @Override
    public double calcularImposto() {
        return (this.getSalario() * 0.1);
    }

}
