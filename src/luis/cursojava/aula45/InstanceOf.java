/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula45;

/**
 *
 * @author luisb
 */
public class InstanceOf {
//  Identifica o tipo do objeto

    public static void main(String[] agrs) {
        Pessoa pessoa = new Pessoa();
        Aluno aluno = new Aluno();
        Professor prof = new Professor();

        if (pessoa instanceof Pessoa) {
            System.out.println("é do tipo Pessoa");
        }
        if (aluno instanceof Aluno) {
            System.out.println("é do tipo Pessoa");
        }
        if (prof instanceof Professor) {
            System.out.println("é do tipo Pessoa");
        }
    }
}
