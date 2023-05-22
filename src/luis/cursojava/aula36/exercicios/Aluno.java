/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula36.exercicios;

/**
 *
 * @author luisb
 */
public class Aluno {

    private String nome, matricula;
    private double[] notas = new double[4];

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double media() {
        double media = 0;
        for (int i = 0; i < notas.length; i++) {
            media += notas[i];
        }

        return media / notas.length;
    }

}
