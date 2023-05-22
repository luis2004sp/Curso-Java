/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula41;

/**
 *
 * @author luisb
 */
public class Teste {

    public static void main(String[] args) {

        //Pessoa pessoa = new Pessoa() {};
        Pessoa aluno = new Aluno();
        Pessoa prof = new Professor();

        //  pessoa.setEndereco("Rua 1, num 1");
        aluno.setEndereco("Rua 2, num 2");
        prof.setEndereco("Rua 3, num 3");

        // System.out.println(pessoa.obterEndereco());
        System.out.println(aluno.obterEndereco());
        System.out.println(prof.obterEndereco());
        aluno.imprimirEndereco();
        prof.imprimirEndereco();

    }
}
