/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula33.exercicios;

/**
 *
 * @author luisb
 */
public class Aluno {

    private String nome, curso;
    private String[] diciplinas;
    private double[][] notas;
    private int matricula;

    public Aluno() {
        this.diciplinas = new String[3];
        this.notas = new double[3][4];
    }

    public Aluno(String nome, String curso, int matricula) {
        this.nome = nome;
        this.curso = curso;
        this.matricula = matricula;
        this.diciplinas = new String[3];
        this.notas = new double[3][4];
    }

    public void mostrarInfo() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Matricula: " + this.getMatricula());
        System.out.println("Curso: " + this.getCurso());
        System.out.println("");

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Notas da diciplina: " + diciplinas[i]);
            for (int j = 0; j < notas[i].length; j++) {
                System.out.println(notas[i][j] + " ");
            }
            System.out.println("Media: " + Media(i));
            System.out.println("Situação: " + Aprovacao(i));
            System.out.println("");
        }

    }

    private String Aprovacao(int n) {
        if (this.Media(n) < 7) {
            return "Reprovado";
        } else {
            return "Aprovado";
        }
    }

    private double Media(int n) {
        double total = 0;
        for (int i = 0; i < notas[n].length; i++) {
            total += notas[n][i];
        }
        double media = total / 4;
        return media;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String[] getDiciplinas() {
        return diciplinas;
    }

    public void setDiciplinas(String[] diciplinas) {
        this.diciplinas = diciplinas;
    }
    
    public void setNomeDiciplina(int p, String nome){
        this.diciplinas[p] = nome;
    }
    
    public void setNotaPos(int i, int j, double nota){
        this.notas[i][j] = nota;
    }

    public double[][] getNotas() {
        return notas;
    }

    public void setNotas(double[][] notas) {
        this.notas = notas;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

}
