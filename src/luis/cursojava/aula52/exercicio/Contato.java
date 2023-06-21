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

    private String nome, telefone;
    private static int ident = 0;

    public Contato() {
    }

    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
        Contato.ident++;
        
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

    public static int getIdent() {
        return ident;
    }

    public static void setIdent(int ident) {
        Contato.ident = ident;
    }

    @Override
    public String toString() {
        String s = "--------------";
        s += "\nNome: " + this.getNome();
        s += "\nTelefone: " + this.getTelefone();
        s += "\nID: " + getIdent();
        return s;
    }

}
