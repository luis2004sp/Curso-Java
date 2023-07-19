/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula42;

/**
 *
 * @author luisb
 */
public class Professor {

    private String nomeCurso;
    double salario;

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double calcularSalarioLiquido() {
        return 0;
    }

    //@Override
    public String obterEndereco() {
        String s = "Endereço do Professor: ";

        //s += this.getEndereco();
        return s;
    }

    //@Override
    public void imprimirEndereco() {
        System.out.println("Imprimindo endereço do prof:");
        System.out.println(this.obterEndereco());
    }

}
