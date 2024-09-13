/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula53;

/**
 *
 * @author luisb
 */
public class Teste {

    public static void main(String[] args) {
        usandoConstante();
        usandoEnum();
    }

    private static void printWeekDay(int day) {
        switch (day) {
            case 1 ->
                System.out.println("Domingo");
            case 2 ->
                System.out.println("Segunda");
            case 3 ->
                System.out.println("Terça");
            case 4 ->
                System.out.println("Quarta");
            case 5 ->
                System.out.println("Quinta");
            case 6 ->
                System.out.println("Sexta");
            case 7 ->
                System.out.println("Sabado");

        }
    }
        private static void printWeekDay(DiaSemana day) {
        switch (day) {
            case DOMINGO ->
                System.out.println("Domingo");
            case SEGUNDA ->
                System.out.println("Segunda");
            case TERCA ->
                System.out.println("Terça");
            case QUARTA ->
                System.out.println("Quarta");
            case QUINTA ->
                System.out.println("Quinta");
            case SEXTA ->
                System.out.println("Sexta");
            case SABADO ->
                System.out.println("Sabado");

        }
    }

    private static void usandoConstante() {
        int segunda = DiaSemanaConstante.SEGUNDA;
        int terca = DiaSemanaConstante.TERCA;
        int quarta = DiaSemanaConstante.QUARTA;
        int quinta = DiaSemanaConstante.QUINTA;
        int sexta = DiaSemanaConstante.SEXTA;
        int sabado = DiaSemanaConstante.SABADO;
        int domingo = DiaSemanaConstante.DOMINGO;

        System.out.println("Usando constantes:");
        printWeekDay(segunda);
        printWeekDay(terca);
        printWeekDay(quarta);
        printWeekDay(quinta);
        printWeekDay(sexta);
        printWeekDay(sabado);
        printWeekDay(domingo);
    }

    private static void usandoEnum() {
        DiaSemana segunda = DiaSemana.SEGUNDA;
        DiaSemana terca = DiaSemana.TERCA;
        DiaSemana quarta = DiaSemana.QUARTA;
        DiaSemana quinta = DiaSemana.QUINTA;
        DiaSemana sexta = DiaSemana.SEXTA;
        DiaSemana sabado = DiaSemana.SABADO;
        DiaSemana domingo = DiaSemana.DOMINGO;

        System.out.println("Usando Enum:");
        printWeekDay(segunda);
        printWeekDay(terca);
        printWeekDay(quarta);
        printWeekDay(quinta);
        printWeekDay(sexta);
        printWeekDay(sabado);
        printWeekDay(domingo);
    }

}
