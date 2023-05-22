/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula15.exercicios;

import java.util.Scanner;

/**
 *
 * @author luisb
 */
public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o turno que você estuda: ");
        System.out.println("M-Matutino, V-Vesperino, ou N-Noturno");
        String turno = scan.next();
        
        switch (turno){
            case "M": System.out.println("Bom dia!"); break;
            case "V": System.out.println("Boa tarde!"); break;
            case "N": System.out.println("Boa noite!"); break;
            default: System.out.println("Valor Inválido");
        }
        
    }
}
