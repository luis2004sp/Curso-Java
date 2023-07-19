/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula54;

/**
 *
 * @author luisb
 */
public class Formulario {

    enum Genero {
        FEMINIMO('F'), MASCULINO('M');

        private char valor;

        private Genero(char valor) {
            this.valor = valor;
        }

        public char getValor() {
            return valor;
        }

    }

    private String nome;
    private Genero genero;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

}
