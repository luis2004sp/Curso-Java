/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula64;

/**
 *
 * @author luisb
 */
public class Externa2 {

    public void metodoQualquer() {

        class ClasseLocal {

            private String texto = "texto classe local";

            public void imprimeTexto() {
                System.out.println(texto);
            }
        }

        ClasseLocal local = new ClasseLocal();

        local.imprimeTexto();
    }

    public static void main(String[] args) {

        Externa2 externa = new Externa2();

        externa.metodoQualquer();
    }
}
