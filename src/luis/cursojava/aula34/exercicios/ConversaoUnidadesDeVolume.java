/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula34.exercicios;

/**
 *
 * @author luisb
 */
public class ConversaoUnidadesDeVolume {
    public static double litroCentimetro(double a){
        return a*1000;
    }
    
    public static double metroLitros(double a){
        return litroCentimetro(a);
    }
    
    public static double metroPes(double a){
        return a*35.32;
    }
    
    public static double galaoAmericanoParaPolegadas(double a){
        return a * 231;
    }
    
    public static double galaoAmericanoParaLitro(double a){
        return a * 3785;
    }
}
