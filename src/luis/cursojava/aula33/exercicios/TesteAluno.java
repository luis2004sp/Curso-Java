/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula33.exercicios;

import java.util.Scanner;

/**
 *
 * @author luisb
 */
public class TesteAluno {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Aluno aluno1 = new Aluno("Luis", "Computação", 124);

        for (int i = 0; i < aluno1.getNotas().length; i++) {
            System.out.println("Digite o nome da diciplina:");
            String nome = scan.next();
            aluno1.setNomeDiciplina(i, nome);
            System.out.println("");
            for (int j = 0; j < aluno1.getNotas()[i].length; j++) {
                System.out.println("Digite a nota: ");
                double nota = scan.nextDouble();
                aluno1.setNotaPos(i, j, nota);

            }
        }

        aluno1.mostrarInfo();
    }
}
