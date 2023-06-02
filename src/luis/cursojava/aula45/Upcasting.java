/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula45;

/**
 *
 * @author luisb
 */
public class Upcasting {

    public static void main(String[] args) {
//        upcasting - transformando uma classe menor(Aluno) para uma classe maior(pessoa)
        Aluno aluno = new Aluno();
        Pessoa pessoaALuno = aluno;
//      Tambem pode ser feito "Manualmente":
//      Pessoa aluno = new Aluno();
//                 ou
//      Pessoa aluno = (Pessoa) new Aluno(); - Jeito bem comum

    }

}
