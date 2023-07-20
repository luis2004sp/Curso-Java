/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula57;

import java.awt.CardLayout;
import java.util.Objects;

/**
 *
 * @author luisb
 */
public class TesteWrapper {

    public static void main(String[] args) {
        // Variaveis Primitivas
        short n1 = 1;
        byte n2 = 10;
        int n3 = 100;
        long n4 = 10000l;
        float n5 = 3.5f;
        double n6 = 3.5555555;
        boolean flag = true;
        char a = 'a';

        // Classes Wrapper
        Short n7 = new Short((short) 1);
        Byte n8 = new Byte((byte) 10);
        Integer n9 = new Integer(100);
        Long n10 = new Long(10000l);
        Float n11 = new Float(3.5f);
        Double n12 = new Double(3.5555555);
        Boolean flag2 = new Boolean(true);
        Character b = new Character('b');

        Integer n13 = new Integer("100");
        Double n14 = new Double("3.5");

        System.out.println(n13.intValue());
        System.out.println(n13.longValue());

        Long n15 = n13.longValue();

        Integer n16 = Integer.parseInt("1000");

        double n17 = Double.parseDouble("3.55555");
        System.out.println(n17);

        Integer n18 = Integer.valueOf(1343);
        System.out.println(n18);

        System.out.println(n9 == n13); // Jeito errado de comparar
        System.out.println(Objects.equals(n9, n13)); // Jeito certo de comparar

    }
}
