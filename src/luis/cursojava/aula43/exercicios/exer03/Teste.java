/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula43.exercicios.exer03;

/**
 *
 * @author luisb
 */
public class Teste {

    public static void main(String[] agrs) {

        Animal camelo = new Animal("Camelo", "Amarelo", "Deserto", 150, 2.0);

        Peixe tubarao = new Peixe();
        tubarao.setNome("Tubarão");
        tubarao.setComprimento(300);
        tubarao.setVelocidade(1.5);

        Mamifero urso = new Mamifero();
        urso.setNome("Urso-do-Canada");
        urso.setComprimento(180);
        urso.setCor("Vermelho");
        urso.setVelocidade(0.5);

        Animal[] animais = new Animal[3];

        animais[0] = camelo;
        animais[1] = tubarao;
        animais[2] = urso;
        
        System.out.println("Zoo");
        for (Animal animal : animais) {
            System.out.println("---------------");
            System.out.println(animal.toString());
            
        }
    }

}
