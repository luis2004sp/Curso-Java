/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula59;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
//import static java.lang.Math.*;// importa todos os metodos, mas não é utilizado

/**
 *
 * @author luisb
 */
public class StaticImport {

    public static void main(String[] args) {
        double a = 2, b = 3, c = 4;

        System.out.println(Math.pow(a, b));

        System.out.println(Math.sqrt(c));

        System.out.println(pow(a, b));

        System.out.println(sqrt(c));
    }
}
