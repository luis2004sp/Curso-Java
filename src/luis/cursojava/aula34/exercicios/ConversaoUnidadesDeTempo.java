/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula34.exercicios;

/**
 *
 * @author luisb
 */
public class ConversaoUnidadesDeTempo {

    public static void minutoSegundo(short a) {
        System.out.println(a * 60);
    }

    public static void horaMinutos(short a) {
        minutoSegundo(a);
    }

    public static void diaHoras(short a) {
        System.out.println(a * 24);
    }

    public static void semanasDias(short a) {
        System.out.println(a * 7);
    }

    public static void mesDias(short a) {
        System.out.println(a * 30);
    }

    public static void anoDias(short a) {
        System.out.println(a * 365);
    }
}
