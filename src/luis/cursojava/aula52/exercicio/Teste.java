/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula52.exercicio;

/**
 *
 * @author luisb
 */
public class Teste {

    public static void main(String[] args) {
        Agenda agenda = new Agenda(2);

        Contato[] conts = new Contato[2];

        Contato a = new Contato("Luis", "1234567");
        Contato b = new Contato("Aloisia", "1234567");
        conts[0] = a;
        conts[1] = b;
        
        for (Contato cont : conts) {
            agenda.adicionarContatos(cont);
        }

       agenda.consulta();

    }
}
