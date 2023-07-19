/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package luis.cursojava.aula54;

/**
 *
 * @author luisb
 */
public enum DiaSemana {
    SEGUNDA(1), TERCA(2), QUARTA(3), QUINTA(4),
    SEXTA(5), SABADO(6), DOMINGO(7);

    private int valor;

    private DiaSemana(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

}
