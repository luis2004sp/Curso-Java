/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula36.exercicios;

import java.util.Scanner;

/**
 *
 * @author luisb
 */
public class TesteCursos {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Curso bcc = new Curso();

        Professor prof = new Professor();

        prof.setNome("Jorge");
        prof.setDepartamento("Dep 123");
        prof.setEmail("prof@gmail.com");

        bcc.setProfessor(prof);

        Aluno[] alunos = new Aluno[5];
        bcc.setAlunos(alunos);

        // Pegar as infos
        for (int i = 0; i < alunos.length; i++) {
            Aluno aluno = new Aluno();

            System.out.println("Digite o nome do aluno " + (i + 1) + " : ");
            aluno.setNome(scan.next());

            double[] notas = new double[aluno.getNotas().length];
            for (int j = 0; j < notas.length; j++) {
                System.out.println("Digite a nota:");
                notas[j] = scan.nextDouble();
            }
            aluno.setNotas(notas);
            alunos[i] = aluno;
        }

        // Mostrar infos
        if (bcc != null && bcc.getAlunos() != null) {
            double media = 0;
            for (Aluno aluno : bcc.getAlunos()) {
                System.out.println("");
                System.out.println("Aluno: " + aluno.getNome());
                System.out.println("Média: " + aluno.media());
                aprovado(aluno.media());
                media += aluno.media();
            }
            System.out.println('\n' + "Média da turma: " + (media / bcc.getAlunos().length));
        }

    }

    static void aprovado(double m) {
        if (m < 7) {
            System.out.println("Aluno Reprovado");
        } else {
            System.out.println("Aluno Aprovado");

        }
    }
}
