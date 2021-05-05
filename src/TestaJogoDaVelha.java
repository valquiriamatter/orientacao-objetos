import java.util.Scanner;

public class TestaJogoDaVelha {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        JogoDaVelha jogo = new JogoDaVelha();

        System.out.println("Jogador 1 - X");
        System.out.println("Jogador 2 - O");

        boolean ganhou = false;
        char sinal;
        int linha = 0;
        int coluna = 0;

        while (!ganhou) {

            if (jogo.vezJogadorUm()) {
                System.out.println("Vez do Jogador 1: Escolha Linha e Coluna (1-3)");
                sinal = 'X';

            } else {
                System.out.println("Vez do Jogador 2: Escolha Linha e Coluna (1-3)");
                sinal = 'O';
            }

            linha = verificarValor("Linha", scan);
            coluna = verificarValor("Coluna", scan);

            if(!jogo.validarJogada(linha, coluna, sinal)){
                System.out.println("Posição já usada, tente novamente.");
            }

            jogo.imprimirTabuleiro();

            if (jogo.verificarGanhador('X')) {
                ganhou = true;
                System.out.println("Parabéns jogador 1 Ganhou!");
            } else if (jogo.verificarGanhador('O')) {
                ganhou = true;
                System.out.println("Parabéns jogador 2 Ganhou!");
            } else if (jogo.getJogada() > 9) {
                ganhou = true;
                System.out.println("Ninguém ganhou!");
            }
        }

    }

    static int verificarValor(String tipoValor, Scanner scan) {

        int valor = 0;
        boolean valorValido = false;

        while (!valorValido) {
            System.out.println("Entre com a " + tipoValor + " (1,2 ou 3)");
            valor = scan.nextInt();

            if (valor >= 1 && valor <= 3) {
                valorValido = true;
            } else {
                System.out.println("Entrada Inválida: Digite 1, 2 ou 3");
            }

        }
        valor--;
        return valor;
    }


}




