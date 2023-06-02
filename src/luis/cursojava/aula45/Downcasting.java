/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula45;

/**
 *
 * @author luisb
 */
public class Downcasting {
// Downcasting - declara um objeto de uma superclasse para uma classe de hierarquia menor

    public static void main(String[] args) {

        Object obj1 = obterString();
        String s1 = (String) obj1;

        Object obj2 = "minha string";
        String s2 = (String) obj2;

        Object obj3 = new Object();
        String s3 = (String) obj3;
    }

    public static String obterString() {
        return "minha string";
    }
}
