/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula55;

import luis.cursojava.aula53.DiaSemana;

/**
 *
 * @author luisb
 */
public class TesteEnum2 {

    public static void main(String[] args) {

        System.out.println(Enum.valueOf(DiaSemana.class, "DOMINGO"));

        DiaSemana dia = Enum.valueOf(DiaSemana.class, "DOMINGO");

        System.out.println(dia);

    }
}
