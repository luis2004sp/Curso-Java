/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula39;

import luis.cursojava.aula38.*;

/**
 *
 * @author luisb
 */
public class Aluno extends Pessoa {

    private String cursos;
    private double[] notas;

    public Aluno() {
    }

    public Aluno(String cursos, String nome, String endereco, String telefone) {
        super(nome, endereco, telefone); // Acessa a Super Classe
        this.cursos = cursos;
    }

    

    public String getCursos() {
        return cursos;
    }

    public void setCursos(String cursos) {
        this.cursos = cursos;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double calcularMedia() {
        return 0;
    }

    public boolean verificarAprovado() {
        return true;
    }
}
