/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.Aula24.exercicios;

/**
 *
 * @author luisb
 */
public class ExercLivro {

    public static void main(String[] args) {
        Livro HarryPotterPedraFilosofal = new Livro();

        HarryPotterPedraFilosofal.autor = "J. K. Rowling";
        HarryPotterPedraFilosofal.editora = "Rocco";
        HarryPotterPedraFilosofal.genero = "Magia";
        HarryPotterPedraFilosofal.paginas = 208;

        System.out.println(HarryPotterPedraFilosofal.autor);
        System.out.println(HarryPotterPedraFilosofal.editora);
        System.out.println(HarryPotterPedraFilosofal.genero);
        System.out.println(HarryPotterPedraFilosofal.paginas);

        LivroDeLivraria oki = new LivroDeLivraria();

        oki.autor = "Doke";
        System.out.println(oki.autor);
    }

}
