/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula15;

import java.util.Scanner;

/**
 *
 * @author luisb
 */
public class Swith_Case {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int diaSemana = scan.nextInt();

       /* if (diaSemana == 1) {
            System.out.println("Domingo");
        } else if (diaSemana == 2) {
            System.out.println("Segunda");
        } else if (diaSemana == 3) {
            System.out.println("terça");
        } else if (diaSemana == 4) {
            System.out.println("Quarta");
        } else if (diaSemana == 5) {
            System.out.println("Quinta");
        } else if (diaSemana == 6) {
            System.out.println("Sexta");
        } else if (diaSemana == 7) {
            System.out.println("Sabado");
        } else {
            System.out.println("Dia invalido!");
        }*/
        
        /*switch (diaSemana) {
            case 1: System.out.println("Domingo"); break; // case seria um if
            case 2: System.out.println("Segunda");break;
            case 3: System.out.println("terça");break;
            case 4: System.out.println("Quarta");break;
            case 5: System.out.println("Quinta");break;
            case 6: System.out.println("Sexta");break;
            case 7: System.out.println("Sabado");break;
            default: System.out.println("Dia invalido!"); // default age como um else
                
        }*/
        
        switch (diaSemana) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6: System.out.println("Dia util."); break;
            case 1:    
            case 7: System.out.println("FDS");  break;
            default: System.out.println("Dia invalido");  break;
        }
    }
}
