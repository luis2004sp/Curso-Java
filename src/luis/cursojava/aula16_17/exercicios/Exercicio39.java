package luis.cursojava.aula16_17.exercicios;

import java.util.Scanner;

/**
 *
 * @author luisb
 */
public class Exercicio39 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i = 0, altMax = 0, altMim = 300, numeroMax = 0, numeroMim = 0, numero = -1;

        while (numero != 0) {
            System.out.println("Insira o número do aluno e sua altura:");
            numero = scan.nextInt();
            if (numero == 0) {
                break;
            } else {
                int alt = scan.nextInt();

                if (alt > altMax) {
                    altMax = alt;
                    numeroMax = numero;
                }
                if (alt < altMim) {
                    altMim = alt;
                    numeroMim = numero;
                }
            }

        }
        System.out.println("O maior aluno é o " + numeroMax + " com " + altMax + "cm");
        System.out.println("O menor aluno é o " + numeroMim + " com " + altMim + "cm");

    }
}
