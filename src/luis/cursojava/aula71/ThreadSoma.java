/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula71;

/**
 *
 * @author luisb
 */
public class ThreadSoma implements Runnable {

    private String nome;
    private int[] nuns;
    private static Calculadora calc = new Calculadora();

    public ThreadSoma(String nome, int[] array) {
        this.nome = nome;
        this.nuns = array;
        new Thread(this, nome).start();
//        Mesma cois que
//        Thread t = new Thread(this);
//        t.start();
    }

    @Override
    public void run() {
        System.out.println(this.nome + " Iniciado");
        int soma = calc.somaArray(nuns);
        System.out.println("Resultado: " + soma);
        System.out.println(this.nome + " Terminado");

    }

}
