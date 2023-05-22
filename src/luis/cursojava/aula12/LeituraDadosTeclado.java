package luis.cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*System.out.println("Digite seu nome completo: ");
        String nomeCompleto = scan.nextLine();
        System.out.println(nomeCompleto);

        System.out.println("Digite seu primeiro nome : ");
        String primeiroNome = scan.next();
        System.out.println(primeiroNome);
        
        System.out.println("Digite sua idade ");
        int idade = scan.nextInt();
        System.out.println("Sua idade é: " +idade);
        
        System.out.println("Digite sua altura ");
        double idade = scan.nextDouble()
        System.out.println("Sua altura é: " + idade);
         */
        
        System.out.println("Digite seu nome, telefone, endereço e nummero do endereço:");
        String nome = scan.next();
        int phone = scan.nextInt();
        String endereco = scan.next();
        short endNumero = scan.nextShort();
        
        System.out.println(nome);
        System.out.println(phone);
        System.out.println(endereco);
        System.out.println(endNumero);
    }
}
