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
        contatos = new Contato[1];
    }

    public Agenda(int quantidade) {
        contatos = new Contato[quantidade];
    }

    public void adicionarContatos(Contato c) throws AgendaCheiaException {

        boolean cheio = true;

        for (int i = 0; i < contatos.length; i++) {
            if (contatos[i] == null) {
                contatos[i] = c;
                cheio = false;
                break;
            }

        }

        throw new AgendaCheiaException();
    }

    public int consultaNome(String nome) throws ContatoNaoExiste {

        for (int i = 0; i < contatos.length; i++) {
            if (contatos[i].getNome().equalsIgnoreCase(nome)) {
                return i;
            }
        }

        throw new ContatoNaoExiste(nome);
    }

    public void exibir(int i) {
        System.out.println(contatos[i]);
    }

}
