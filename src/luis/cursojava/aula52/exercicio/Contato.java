/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula52.exercicio;

/**
 *
 * @author luisb
 */
public class Contato {

    private static int idCont = 0;
    private String nome, telefone;
    private int id;

    public Contato() {
        idCont++;
        id = idCont;
    }

    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
        idCont++;
        id = idCont;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        String s = "--------------";
        s += "\nNome: " + this.getNome();
        s += "\nTelefone: " + this.getTelefone();
        s += "\nID: " + id;
        return s;
    }

}
