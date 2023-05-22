/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula13;

import java.util.logging.Logger;

/**
 *
 * @author luisb
 */
public class OperadoresAritimeticos {

    public static void main(String[] args) {
        int resultado = 1 + 2;
        System.out.println(resultado);

        resultado -= 1;
        System.out.println(resultado);

        resultado = resultado * 2;
        System.out.println(resultado);

        resultado = resultado / 2;
        System.out.println(resultado);

        resultado += 8;
        System.out.println(resultado);

        resultado = resultado % 7;
        System.out.println(resultado);

        String primeiroNome = "Luis ";
        String segundoNome = "Antonio";

        String terceiro = primeiroNome.concat(segundoNome);
        System.out.println(terceiro);

    }

}
