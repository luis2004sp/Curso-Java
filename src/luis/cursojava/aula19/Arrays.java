/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula19;

/**
 *
 * @author luisb
 */
public class Arrays {

    public static void main(String[] args) {
        double tempDia1 = 31.3, tempDia2 = 32, tempDia3 = 33.6, tempDia4 = 34, tempDia5 = 33;

        double[] temps = new double[365];
        temps[0] = 31.3;
        temps[1] = 32;
        temps[2] = 33.6;
        temps[3] = 34;
        temps[4] = 33;

        System.out.println("Temperatura dia 1 é: " + temps[0]);

        System.out.println("O tamanho do array é: " + temps.length);

        for (int i = 0; i < temps.length; i++) {
            System.out.println("A temperatura no dia " + (i + 1) + " é " + temps[i]);
        }

        for (double temp : temps) { // itera o array sem precisar do outro for;
            System.out.println(temp); // essa forma não deixa voce identificar com facilidade a possição igual com o i
        }
    }

}
