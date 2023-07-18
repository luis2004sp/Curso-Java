/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula53;

/**
 *
 * @author luisb
 */
public class Main {

    public static void main(String[] args) {
        usandoConstantes();
        
        System.out.println("");
        
        usandoEnum();
    }

    private static void usandoConstantes() {
        int segunda = DiaDaSemanaConstante.SEGUNDA_FEIRA;
        int terca = DiaDaSemanaConstante.TERCA_FEIRA;
        int quarta = DiaDaSemanaConstante.QUARTA_FEIRA;
        int quinta = DiaDaSemanaConstante.QUINTA_FEIRA;
        int sexta = DiaDaSemanaConstante.SEXTA_FEIRA;
        int sabado = DiaDaSemanaConstante.SABADO_FEIRA;
        int domingo = DiaDaSemanaConstante.DOMINGO_FEIRA;

        System.out.println("Teste utilizando constantes no Java");
        imprimeDiaSemana(segunda);
        imprimeDiaSemana(terca);
        imprimeDiaSemana(quarta);
        imprimeDiaSemana(quinta);
        imprimeDiaSemana(sexta);
        imprimeDiaSemana(sabado);
        imprimeDiaSemana(domingo);

    }

    private static void imprimeDiaSemana(int dia) {
        switch (dia) {
            case 1 ->
                System.out.println("Segunda");
            case 2 ->
                System.out.println("Terça");
            case 3 ->
                System.out.println("Quanta");
            case 4 ->
                System.out.println("Quinta");
            case 5 ->
                System.out.println("Sexta");
            case 6 ->
                System.out.println("Sabado");
            case 7 ->
                System.out.println("Domingo");

        }
    }

    private static void usandoEnum() {
        DiaSemana segunda = DiaSemana.SEGUNDA;
        DiaSemana terca = DiaSemana.TERCA;
        DiaSemana quarta = DiaSemana.QUANTA;
        DiaSemana quinta = DiaSemana.QUINTA;
        DiaSemana sexta = DiaSemana.SEXTA;
        DiaSemana sabado = DiaSemana.SABADO;
        DiaSemana domingo = DiaSemana.DOMINGO;

        System.out.println("Teste utilizando ENUM no Java");
        imprimeDiaSemana(segunda);
        imprimeDiaSemana(terca);
        imprimeDiaSemana(quarta);
        imprimeDiaSemana(quinta);
        imprimeDiaSemana(sexta);
        imprimeDiaSemana(sabado);
        imprimeDiaSemana(domingo);

    }

    private static void imprimeDiaSemana(DiaSemana dia) {
        switch (dia) {
            case SEGUNDA ->
                System.out.println("Segunda");
            case TERCA ->
                System.out.println("Terça");
            case QUANTA ->
                System.out.println("Quanta");
            case QUINTA ->
                System.out.println("Quinta");
            case SEXTA ->
                System.out.println("Sexta");
            case SABADO ->
                System.out.println("Sabado");
            case DOMINGO ->
                System.out.println("Domingo");

        }
    }
}
