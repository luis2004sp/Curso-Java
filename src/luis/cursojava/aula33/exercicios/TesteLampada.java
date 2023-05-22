/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula33.exercicios;

/**
 *
 * @author luisb
 */
public class TesteLampada {
    public static void main(String[] args) {
        Lampada lamp = new Lampada();
        
        lamp.Status();
        
        lamp.OnOff(1);
        
        lamp.Status();
        
        lamp.OnOff(0);
        
        lamp.Status();
    }
}
