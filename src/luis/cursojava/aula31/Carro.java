package luis.cursojava.aula31;

class Carro {

    String marca, modelo;
    int numPassageiros;
    double capacidadeCombustivel, consumoCombustivel;

    public Carro(double consumoCombustivel) {
        this.consumoCombustivel = consumoCombustivel;
    }

    public Carro() {
    }

    void exibirAutonomia() {
        System.out.println("Autonomia = " + (this.capacidadeCombustivel * this.consumoCombustivel) + " Km.");
    }

    double obterAutonomia() {
        System.out.println("Medoto obterAutonomia foi chamado");

        return this.capacidadeCombustivel * this.consumoCombustivel;
    }

    private double calcularCombustivelPri(double km) {
        return km / this.consumoCombustivel;
    }

    double calcularCombustivel(double km) {
        return calcularCombustivelPri(km);
    }
}
