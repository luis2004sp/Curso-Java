/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula33;

/**
 *
 * @author luisb
 */
public class TesteCalculadora {

    public static void main(String[] args) {
        MinhaCalculadora cal = new MinhaCalculadora();
        int[] numbs = {1,2,3,4,5};
        

        cal.soma(1, 2);
        cal.soma(1.0, 2.0);
        int somaNubs = cal.soma(numbs);
        
        System.out.println(somaNubs);
    }
}
