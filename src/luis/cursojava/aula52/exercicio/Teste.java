/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula52.exercicio;

import java.util.Scanner;

/**
 *
 * @author luisb
 */
public class Teste {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Agenda agenda = new Agenda();
        int opcao = 0;

        while (opcao != 3) {
            opcao = menu(scan);

            if (opcao == 1) {
                consulta(scan, agenda);
            } else if (opcao == 2) {
                adicinarContatos(scan, agenda);
            }
        }

    }

    public static void adicinarContatos(Scanner scan, Agenda agenda) {

        System.out.println("\nCriar Contato: ");
        String nome = input(scan, "Nome: ");
        String telefone = input(scan, "Telefone: ");
        String email = input(scan, "Email: ");

        Contato cont = new Contato();
        cont.setNome(nome);
        cont.setTelefone(telefone);
        cont.setEmail(email);

        agenda.adicionarContatos(cont);
    }

    public static String input(Scanner scan, String s) {
        System.out.print(s);
        String entrada = scan.nextLine();
        return entrada;
    }

    public static int menu(Scanner scan) {
        System.out.println("\nOpções");
        System.out.println("1- Consultar um contato");
        System.out.println("2- Adicionar um contato");
        System.out.println("3- Sair\n");

        int opcao = Integer.parseInt(input(scan, "Escolha uma opção: "));

        if (opcao == 1 || opcao == 2 || opcao == 3) {
            return opcao;
        }
        return 0;
    }

    public static void consulta(Scanner scan, Agenda agenda) {
        System.out.println("\nConsulta  de Contato:");
        String nome = input(scan, "Insira o nome: ");
        agenda.consultaNome(nome);
    }

}
