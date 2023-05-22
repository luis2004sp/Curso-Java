/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula43;

import java.util.Arrays;
import java.util.Objects;

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

//    @Override
//    public String toString(){
//        String s = this.cursos + '\n';
//        for (double nota : notas) {
//            s += nota+" ";
//        }
//        return s;
//    }
    @Override
    public String toString() {
        return "Aluno{" + "cursos=" + cursos + ", notas=" + Arrays.toString(notas) + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Aluno other = (Aluno) obj;
        if (!Objects.equals(this.cursos, other.cursos)) {
            return false;
        }
        return Arrays.equals(this.notas, other.notas);
    }

}
