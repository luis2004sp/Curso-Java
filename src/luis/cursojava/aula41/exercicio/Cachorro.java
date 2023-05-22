/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula41.exercicio;

/**
 *
 * @author luisb
 */
public class Cachorro extends Mamifero {

    private String tamanho, raca;

    public Cachorro() {
    }

    public Cachorro(String tamanho, String raca, String nome) {
        super(nome);
        this.tamanho = tamanho;
        this.raca = raca;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public void emitirSom() {
        System.out.println("AU AU");
    }

}
