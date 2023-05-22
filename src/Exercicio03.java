
import java.util.Scanner;

/**
 *
 * @author luisb
 */
public class Exercicio03 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] a = new int[15], b = new int[15];

        for (int i = 0; i < a.length; i++) {
            a[i] = scan.nextInt();
        }

        for (int i = 0; i < b.length; i++) {
            b[i] = (int) Math.pow(a[i], 2);
            System.out.println(b[i]);
        }
    }
}
