/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula65;

/**
 *
 * @author luisb
 */
@interface InformacaoAula {

    String auto();

    int aulaNum();

    String site() default "youtube.com";

}
