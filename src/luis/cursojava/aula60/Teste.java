/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula60;

/**
 *
 * @author luisb
 */
public class Teste {

    public static void main(String[] args) {
        EscopoVariaveis escopo = new EscopoVariaveis();

        escopo.setValor(10);

        System.out.println(escopo.getValor());
        System.out.println(escopo.calculaValor(20));
        System.out.println(escopo.getValor());
        
        System.out.println(escopo.teste());
    }
}
