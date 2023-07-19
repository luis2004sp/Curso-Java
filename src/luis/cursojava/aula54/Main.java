/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula54;

/**
 *
 * @author luisb
 */
public class Main {

    public static void main(String[] args) {
        DiaSemana dia = DiaSemana.SEXTA;

        System.out.println(dia + " - " + dia.getValor());

        Data data = new Data(19, 07, 2023, DiaSemana.QUARTA);

    }
}
