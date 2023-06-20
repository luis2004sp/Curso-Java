/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula49;

/**
 *
 * @author luisb
 */
public class FinallyPegadinha {

    public static void main(String[] args) {

        int[] numeros = {4, 8, 16, 32, 64, 128};
        int[] denom = {2, 0, 4, 8, 0};

        for (int i = 0; i < numeros.length; i++) {
            try {
                System.out.println(numeros[i] + " / " + denom[i] + " = " + (numeros[i] / denom[i]));

            } catch (ArithmeticException e) {
                System.out.println("Erro ao dividir por zero");
                System.exit(0); // termina a execução do try/catch
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Possição do array invalida");
                System.exit(0);
            } finally {
                System.out.println("Essa linha é impressa apos o try ou o catch");
            }
        }

    }
}
