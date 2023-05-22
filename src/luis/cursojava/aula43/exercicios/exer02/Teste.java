/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula43.exercicios.exer02;

/**
 *
 * @author luisb
 */
public class Teste {
    public static void main(String[] args) {
        PessoaJuridica pj = new PessoaJuridica();
        
        pj.setNome("Luis");
        pj.setSalario(100);
        System.out.println(pj);
        
        System.out.println("");
        
        Contribuinte c = new Contribuinte();
        
        c.setNome("uai");
        c.setSalario(100);
        
        System.out.println(c);
    }
}
