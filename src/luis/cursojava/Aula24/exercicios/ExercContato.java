/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.Aula24.exercicios;

/**
 *
 * @author luisb
 */
public class ExercContato {

    public static void main(String[] args) {
        Contato contato1 = new Contato();

        contato1.nome = "Luis";
        contato1.sobrenome = "Brugger Martinez";

        contato1.telefones = new String[3];
        contato1.telefones[0] = "952215437";
        contato1.telefones[1] = "981007694";
        contato1.telefones[2] = "963528774";

        System.out.println(contato1.nome + " " + contato1.sobrenome);
        System.out.println("tel : " + contato1.telefones[0]);
    }

}
