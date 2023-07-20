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
        //Autoboxing e Unboxing
        // Transforma um tipo primitivo em um tipo objeto e vice-versa

        // Autoboxing
        Short n7 = 1; // new Short((short) 1);
        Byte n8 = 10; //  new Byte((byte) 10);
        Integer n9 = 100;
        Long n10 = 10000l;
        Float n11 = 3.5f;
        Double n12 = 3.5555555;
        Boolean flag2 = true;
        Character d = 'b';

        // Auto in-boxing
        int n13 = n9;// n9.intValue()

        // Autoboxing em expressões
        n9++;
        System.out.println(n9);

        // Auto un-boxing  n9 -> autoboxing n13/n9 -> n14
        Integer n14 = n13 / n9;

        //mau uso
        Double a, b, c;
        a = 10.0;
        b = 12.2;
        c = 4.7;
        
        Double media = (a+b+c)/3;
        System.out.println(media);
        

    }
}
