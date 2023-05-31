/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula43.exercicios.exer03;

/**
 *
 * @author luisb
 */
public class Animal {

    private String nome, cor, Ambiente;
    private double comprimento, velocidade;
    private int numeroPatas;

    public Animal() {
        this.numeroPatas = 4;
    }

    public Animal(String nome, String cor, String Ambiente, double comprimento, double velocidade) {
        this.nome = nome;
        this.cor = cor;
        this.Ambiente = Ambiente;
        this.comprimento = comprimento;
        this.velocidade = velocidade;
        this.numeroPatas = 4;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAmbiente() {
        return Ambiente;
    }

    public void setAmbiente(String Ambiente) {
        this.Ambiente = Ambiente;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    @Override
    public String toString() {
        String s = "";
        s += "Animal: " + this.getNome() + '\n';
        s += "Comprimento: " + getComprimento() + " cm" + '\n';
        s += "Número de patas: " + getNumeroPatas() + '\n';
        s += "Cor: " + getCor() + '\n';
        s += "Hábitat natural: " + getAmbiente() + '\n';
        s += "Velocidade: " + getVelocidade() + " m/s";
        return s;
    }

}
