/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula33.exercicios;

/**
 *
 * @author luisb
 */
public class Lampada {

    private String modelo, tenccao, cor, tipoLuz;
    private double voltagem, preco, potencia, garantia;
    private String[] tipos;
    private boolean ligada = false;

    private void Ligar() {
        this.ligada = true;
    }

    private void Desligar() {
        this.ligada = false;
    }

    public void OnOff(int num) {
        if (num == 0) {
            this.Desligar();
        } else if (num == 1) {
            this.Ligar();
        }
    }

    public void Status() {
        boolean status = this.isLigada();

        if (status == false) {
            System.out.println("Lampada Desligada");
        } else {
            System.out.println("Lampada Ligada");

        }
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTenccao() {
        return tenccao;
    }

    public void setTenccao(String tenccao) {
        this.tenccao = tenccao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipoLuz() {
        return tipoLuz;
    }

    public void setTipoLuz(String tipoLuz) {
        this.tipoLuz = tipoLuz;
    }

    public double getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(double voltagem) {
        this.voltagem = voltagem;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public double getGarantia() {
        return garantia;
    }

    public void setGarantia(double garantia) {
        this.garantia = garantia;
    }

    public String[] getTipos() {
        return tipos;
    }

    public void setTipos(String[] tipos) {
        this.tipos = tipos;
    }

    public boolean isLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

}
