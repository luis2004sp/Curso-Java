/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula43.exercicios.exer03;

/**
 *
 * @author luisb
 */
public class Peixe extends Animal {

    private String caracteristica;

    public Peixe() {
        this.setNumeroPatas(0);
        this.setAmbiente("Mar");
        this.setCor("Cinzenta");
        this.caracteristica = "Barbatana e cauda";
    }

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    @Override
    public String toString() {
        String s = super.toString();
        s += "\nCaracteristicas: " + getCaracteristica();
        return s;
    }

}
