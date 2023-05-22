/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula43;

/**
 *
 * @author luisb
 */
public class Teste {

    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        aluno.setCursos("BCC");

        double[] notas = {10, 9, 8, 7};
        aluno.setNotas(notas);

        System.out.println(aluno.getNotas()[0]);
        System.out.println(aluno.toString());

        String s1 = "abcd";
        String s2 = "abcd";

        System.out.println(s1.equals(s2));

        Aluno aluno2 = new Aluno();

        aluno.setCursos("BCC");

        double[] notas2 = {10, 9, 8, 7};
        aluno2.setNotas(notas2);
        
        System.out.println(aluno.equals(aluno2));
        
        
    }
}
