package luis.cursojava.Exercicios;

//Faga um Programa que pega um numero e mostre a mensagem "O numero informado foi [n]
import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = scan.nextInt();
        System.out.println("O número informado foi: " + numero);

    }
}
