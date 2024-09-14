package luis.cursojava.aula57;

/**
 *
 * @author luisb
 */
public class TesteWrapper {

    public static void main(String[] args) {
        //tipos primitivos, não são objetos
        short n1 = 1;
        byte n2 = 10;
        int n3 = 100;
        long n4 = 1000;
        float n5 = 3.5f;
        double n6 = 3.5555;
        boolean flag = true;
        char a = 'a';

        Short n7 = new Short((short) 1);
        Byte n8 = new Byte((byte) 10);
        Integer n9 = new Integer(100);
        Long n10 = new Long(1000);
        Float n11 = new Float(3.5f);
        Double n12 = new Double(3.5555);
        Boolean flag2 = new Boolean(true);
        Character b = new Character('b');

        Integer n13 = new Integer("1000");

        Double n14 = n13.doubleValue();

        System.out.println(n14);

        int n15 = Integer.parseInt(("1000"));
        System.out.println(n15);

        Integer n16 = Integer.valueOf(1313);
        System.out.println(n16);

        System.out.println(n13 == n16);
    }

}
