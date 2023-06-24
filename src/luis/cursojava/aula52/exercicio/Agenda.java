/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula52.exercicio;

/**
 *
 * @author luisb
 */
public class Agenda {

    private Contato[] contatos;

    public Agenda() {
        contatos = new Contato[5];
    }

    public Agenda(int quantidade) {
        contatos = new Contato[quantidade];
    }

    public void adicionarContatos(Contato c) {

        for (int i = 0; i < contatos.length; i++) {
            if (contatos[i] == null) {
                contatos[i] = c;
                break;
            }

        }
    }

    public void consultaNome(String nome) {
        for (Contato contato : contatos) {
            if (contato.getNome().equals(nome)) {
                System.out.println(contato);
                break;
            } else {
                System.out.println("Contato inesistente");
                break;
            }

        }
    }

}
