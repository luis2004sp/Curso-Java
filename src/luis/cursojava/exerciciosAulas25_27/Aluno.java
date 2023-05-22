/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.exerciciosAulas25_27;

/**
 *
 * @author luisb
 */
public class Aluno {

    String nome, curso;
    String[] diciplinas;
    double[] notas;
    int numMatricula;

    double media(){
        double soma=0;
        for (int i = 0; i < notas.length; i++) {
            soma+= notas[i];
        }
        return soma/notas.length;
    }
    
    void aprovacao(double media) {
        if (media >= 7) {
            System.out.println("Aluno Aprovado!");
        } else {
            System.out.println("Aluno Reprovado!");

        }
    }
}
