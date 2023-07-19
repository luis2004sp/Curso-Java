/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula42;

/**
 *
 * @author luisb
 */
public class Aluno {

    private String cursos;
    private double[] notas;

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

    //@Override
    public String obterEndereco() {
        String s = "Endereço do Aluno: ";

        //s += this.getEndereco();
        return s;
    }

    //@Override
    public void imprimirEndereco() {
        System.out.println(this.obterEndereco());
    }

}
