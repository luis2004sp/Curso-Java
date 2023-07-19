//ler entrada do jogador
//verificar se a posição está livre
// se estiver colocar "marca" na posição
// verificar se tem uma linha completa para vitoria
// depois de 9 rodadas encerrar o jogo
package luis.cursojava.Aula20.exercicios;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[][] tabuleiro = new String[3][3];
        int linha, coluna;
        boolean status = false, jogada = false;

        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                tabuleiro[i][j] = "";
            }
        }

        //  INICIO DO JOGO
        System.out.println("HORA DE JOGAR!!!");
        while (!status) {

            //JODADOR 1
            while (!jogada) {
                System.out.println("Jogador 1 é asua vez!");
                System.out.println("Informe a linha onde você quer jogar: ");
                linha = (scan.nextInt()) - 1;
                System.out.println("Informe a coluna onde você quer jogar: ");
                coluna = (scan.nextInt()) - 1;

                if (tabuleiro[linha][coluna] == "") {
                    tabuleiro[linha][coluna] = "X";
                    jogada = true;
                } else {
                    System.out.println("Posição já preenchida");
                }
            }
            if ("X".equals(tabuleiro[0][0]) && "X".equals(tabuleiro[0][1]) && "X".equals(tabuleiro[0][2])) {
                System.out.println("Jogador 1 VENCEU!!!");
                status = true;
                break;
            } else if ("X".equals(tabuleiro[1][0]) && "X".equals(tabuleiro[1][1]) && "X".equals(tabuleiro[1][2])) {
                System.out.println("Jogador 1 VENCEU!!!");
                status = true;
                break;
            } else if ("X".equals(tabuleiro[2][0]) && "X".equals(tabuleiro[2][1]) && "X".equals(tabuleiro[2][2])) {
                System.out.println("Jogador 1 VENCEU!!!");
                status = true;
                break;
            } else if ("X".equals(tabuleiro[0][0]) && "X".equals(tabuleiro[1][1]) && "X".equals(tabuleiro[2][2])) {
                System.out.println("Jogador 1 VENCEU!!!");
                status = true;
                break;
            } else if ("X".equals(tabuleiro[2][0]) && "X".equals(tabuleiro[1][1]) && "X".equals(tabuleiro[0][2])) {
                System.out.println("Jogador 1 VENCEU!!!");
                status = true;
                break;
            } else if ("X".equals(tabuleiro[0][0]) && "X".equals(tabuleiro[1][0]) && "X".equals(tabuleiro[2][0])) {
                System.out.println("Jogador 1 VENCEU!!!");
                status = true;
                break;
            } else if ("X".equals(tabuleiro[0][1]) && "X".equals(tabuleiro[1][1]) && "X".equals(tabuleiro[2][1])) {
                System.out.println("Jogador 1 VENCEU!!!");
                status = true;
                break;
            } else if ("X".equals(tabuleiro[0][2]) && "X".equals(tabuleiro[1][2]) && "X".equals(tabuleiro[2][2])) {
                System.out.println("Jogador 1 VENCEU!!!");
                status = true;
                break;
            }
            jogada = false;
            for (int i = 0; i < tabuleiro.length; i++) {
                for (int j = 0; j < tabuleiro[i].length; j++) {
                    System.out.print(tabuleiro[i][j] + " | ");
                }
                System.out.println("");
            }

            //JODADOR 2
            while (!jogada) {
                System.out.println("Jogador 2 é asua vez!");
                System.out.println("Informe a linha onde você quer jogar: ");
                linha = (scan.nextInt()) - 1;
                System.out.println("Informe a coluna onde você quer jogar: ");
                coluna = (scan.nextInt()) - 1;

                if (tabuleiro[linha][coluna] == "") {
                    tabuleiro[linha][coluna] = "O";
                    jogada = true;
                } else {
                    System.out.println("Posição já preenchida");
                }
            }
            if ("X".equals(tabuleiro[0][0]) && "X".equals(tabuleiro[0][1]) && "X".equals(tabuleiro[0][2])) {
                System.out.println("Jogador 2 VENCEU!!!");
                status = true;
                break;
            } else if ("X".equals(tabuleiro[1][0]) && "X".equals(tabuleiro[1][1]) && "X".equals(tabuleiro[1][2])) {
                System.out.println("Jogador 2 VENCEU!!!");
                status = true;
                break;
            } else if ("X".equals(tabuleiro[2][0]) && "X".equals(tabuleiro[2][1]) && "X".equals(tabuleiro[2][2])) {
                System.out.println("Jogador 2 VENCEU!!!");
                status = true;
                break;
            } else if ("X".equals(tabuleiro[0][0]) && "X".equals(tabuleiro[1][1]) && "X".equals(tabuleiro[2][2])) {
                System.out.println("Jogador 2 VENCEU!!!");
                status = true;
                break;
            } else if ("X".equals(tabuleiro[2][0]) && "X".equals(tabuleiro[1][1]) && "X".equals(tabuleiro[0][2])) {
                System.out.println("Jogador 2 VENCEU!!!");
                status = true;
                break;
            } else if ("X".equals(tabuleiro[0][0]) && "X".equals(tabuleiro[1][0]) && "X".equals(tabuleiro[2][0])) {
                System.out.println("Jogador 2 VENCEU!!!");
                status = true;
                break;
            } else if ("X".equals(tabuleiro[0][1]) && "X".equals(tabuleiro[1][1]) && "X".equals(tabuleiro[2][1])) {
                System.out.println("Jogador 2 VENCEU!!!");
                status = true;
                break;
            } else if ("X".equals(tabuleiro[0][2]) && "X".equals(tabuleiro[1][2]) && "X".equals(tabuleiro[2][2])) {
                System.out.println("Jogador 2 VENCEU!!!");
                status = true;
                break;
            }
            jogada = false;
            for (int i = 0; i < tabuleiro.length; i++) {
                for (int j = 0; j < tabuleiro[i].length; j++) {
                    System.out.print(tabuleiro[i][j] + " | ");
                }
                System.out.println("");
            }
        }

        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                System.out.print(tabuleiro[i][j] + " | ");
            }
            System.out.println("");
        }

    }

}
