/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula71;

/**
 *
 * @author luisb
 */
public class MinhaThreadSoma implements Runnable {

    private String nome;
    private int[] nuns;
    private static Calculadora calc = new Calculadora();

    public MinhaThreadSoma(String nome, int[] nuns) {
        this.nome = nome;
        this.nuns = nuns;
        new Thread(this, nome).start();

    }

    @Override
    public void run() {

        System.out.println(this.nome + " iniciado");

        int soma = calc.somaArray(nuns);

        System.out.println("Soma da Thread " + this.nome + " = " + soma);

        System.out.println(this.nome + " terminado");

    }

}
