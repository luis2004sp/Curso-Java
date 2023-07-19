/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula55;

import luis.cursojava.aula54.DiaSemana;

/**
 *
 * @author luisb
 */
public class TesteEnum {

    public static void main(String[] args) {
        DiaSemana[] dias = DiaSemana.values(); // Retorna um array com todos os valores dentro do enum

        for (DiaSemana dia : dias) {
            System.out.println(dia + " - " + dia.getValor());
        }

    }
}
