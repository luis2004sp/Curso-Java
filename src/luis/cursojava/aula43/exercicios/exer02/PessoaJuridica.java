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

    @Override
    public String toString() {
        String s = "PessoaJuridica{" + '\n';
        s += "Nome: " + this.getNome() + '\n';
        s += "Salario: R$" + this.getSalario() + '\n';
        s += "Imposto: R$" + this.calcularImposto();
        s += '}';
        return s;
    }

    public double calcularImposto() {
        return (this.getSalario() * 0.1);
    }

}
