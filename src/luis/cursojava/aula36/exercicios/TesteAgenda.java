/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula36.exercicios;

import java.util.Scanner;

/**
 *
 * @author luisb
 */
public class TesteAgenda {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digiet o nome da agenda: ");
        String nome = scan.nextLine();

        Agenda agenda = new Agenda(nome);

        Contato[] contatos = new Contato[3];
        agenda.setContatos(contatos);
        
        for (int i = 0; i < contatos.length; i++) {
            Contato c = new Contato();

            System.out.println("Digite o nome do contato:");
            c.setNome(scan.nextLine());

            System.out.println("Digite o telefone do contato:");
            c.setTelefone(scan.nextLine());

            System.out.println("Digite o email do contato:");
            c.setEmail(scan.nextLine());

            contatos[i] = c;
        }
        

        if (agenda != null && agenda.getContatos() != null) {
            for (Contato contato : agenda.getContatos()) {
                System.out.println("");
                System.out.println(contato.getNome());
                System.out.println(contato.getTelefone());
                System.out.println(contato.getEmail());
            }
        }
    }
}
