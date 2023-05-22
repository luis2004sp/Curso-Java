/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula35.exercicios;

/**
 *
 * @author luisb
 */
public class Calculadora {

    public static int finobacci(int a) {

        if (a < 2) {
            return 1;
        }

        return finobacci(a - 1) + finobacci(a - 2);
    }
    
    
    public static int somatorio(int num){
        if(num==1){
            return 1;
        }
        
        return num + somatorio(num-1);
    }
}
