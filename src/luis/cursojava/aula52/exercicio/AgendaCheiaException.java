/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula52.exercicio;

/**
 *
 * @author luisb
 */
public class AgendaCheiaException extends Exception {

    @Override
    public String getMessage() {
        return "Agenda está cheia!";
    }

}
