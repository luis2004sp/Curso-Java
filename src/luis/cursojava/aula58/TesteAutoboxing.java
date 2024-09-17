/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula58;

/**
 *
 * @author luisb
 */
public class TesteAutoboxing {

    public static void main(String[] args) {

        //autoboxing transforma tipos primitivos em objetos
        Short n7 = 1;
        Byte n8 = (byte) 10;
        Integer n9 = 100;
        Long n10 = 1000l;
        Float n11 = 3.5f;
        Double n12 = 3.5555;
        Boolean flag2 = true;
        Character b = 'b';

        //autounboing 
        int n13 = n9; //n9.intValue()

        //autoboxing em expreções
        n9++;
        System.out.println(n9);

        //outo unboxong num9 -> autoboxing n13/n9 -> n14
        Integer n14 = n13 / n9;
        System.out.println(n14);
        
         
    }
}
