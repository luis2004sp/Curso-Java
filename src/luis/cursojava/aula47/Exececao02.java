/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula47;

/**
 *
 * @author luisb
 */
public class Exececao02 {
    public static void main(String[] args) {
        
        try{
            System.out.println("Isso será imprimido");
            
            int[] vetor = new int[4];
            
            vetor[5] = 5;
            
            
            System.out.println("Isso tbm");
        } catch(Exception e){
            System.out.println("Indice indicado não pode ser encontrado(404)\nNão pode receber valores");
        }
        
        
        
    }
  
}
