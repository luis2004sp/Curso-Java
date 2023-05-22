/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.exerciciosAulas25_27;

/**
 *
 * @author luisb
 */
public class AppTeste {

    public static void main(String[] args) {
        Lampada lamp = new Lampada();

        lamp.status();
        lamp.liga();
        lamp.status();
        lamp.desliga();
        lamp.status();

        ContaCorrente cc = new ContaCorrente();

        cc.saldo();
        cc.deposito(1000);
        cc.saldo();
        cc.saque(100);
        cc.saldo();
        cc.saque(901);


        Aluno aluno1 = new Aluno();

        aluno1.nome = "Luis";
        aluno1.curso = "BCC";
        aluno1.numMatricula = 1591622;

        aluno1.diciplinas = new String[2];
        aluno1.diciplinas[0] = "Calculo 1";
        aluno1.diciplinas[1] = "SO";

        aluno1.notas = new double[4];

        aluno1.notas[0] = 7;
        aluno1.notas[1] = 8;
        aluno1.notas[2] = 6.5;
        aluno1.notas[3] = 6.5;
        
        
        double media = aluno1.media();
        System.out.println(media);
        aluno1.aprovacao(media);
        
        

    }
}
