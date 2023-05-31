/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula43.exercicios.exer02;

/**
 *
 * @author luisb
 */
public class PessoaFísica extends Contribuinte {

    public PessoaFísica(String nome, double salario) {
        super(nome, salario);
    }

    public PessoaFísica() {
    }

    @Override
    public String toString() {
        String s = "PessoaJuridica{" + '\n';
        s += "Nome: " + this.getNome() + '\n';
        s += "Salario: R$" + this.getSalario() + '\n';
        s += "Imposto: R$" + this.calcularImposto();
        s += '}' + '\n';
        return s;
    }

    @Override
    public double calcularImposto() {
        double s = this.getSalario(), imposto = 0;

        if (s <= 1400) {
            return 0;
        }
        if (s <= 2100) {
            imposto = (s * 0.1) - 100;
            return imposto;
        }
        if (s <= 2800) {
            imposto = (s * 0.15) - 270;
            return imposto;
        }
        if (s <= 3600) {
            imposto = (s * 0.25) - 500;
            return imposto;
        }
        if (s > 3600) {
            imposto = (s * 0.3) - 700;
            return imposto;
        }

        return 0;
    }

}
