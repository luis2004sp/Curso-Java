/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/AnnotationType.java to edit this template
 */
package luis.cursojava.aula65;

/**
 *
 * @author luisb
 */
public @interface InformacaoAula {

    String auto() default ("Luis");

    int aulaNumero();

    String site() default ("https://www.linkedin.com/in/luisbrugger/");
}
