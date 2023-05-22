/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula11;

/**
 *
 * @author luisb
 */
public class CuriosidadeInt {

    public static void main(String[] args) {
        // limite de um numero int é de -2147483647 a 2147483647, quando se somo no limite máximo, ele volta para o liminite mínimo
        // sendo assim uma lista ciclica
        int var1 = 2147483647;
        int var2 = 1;

        System.out.println(var1 + var2); // = -2147483648
    }
}
