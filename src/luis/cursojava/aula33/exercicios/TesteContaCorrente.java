/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula33.exercicios;

/**
 *
 * @author luisb
 */
public class TesteContaCorrente {
    public static void main(String[] args) {
        ContaCorrente cc =  new ContaCorrente(123, 1000, 2000, false);
        
        
        cc.saque(500);
        System.out.println(cc.getSaldo());
    }
}
