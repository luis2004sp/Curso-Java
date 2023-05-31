/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula43.exercicios.exer02;

/**
 *
 * @author luisb
 */
public class Contribuinte {

    private String nome;
    private double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        String s = "PessoaJuridica{" + '\n';
        s += "Nome: " + this.getNome() + '\n';
        s += "Salario: R$" + this.getSalario();
        s += '}';
        return s;
    }

    public double calcularImposto() {
        return 0;
    }

    public Contribuinte(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public Contribuinte() {
    }

}
