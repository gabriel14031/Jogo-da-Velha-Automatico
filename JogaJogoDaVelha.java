import java.util.Random;
import java.util.Scanner;

public class JogaJogoDaVelha {
    public static void main(String[] args) {
        System.out.println("Jogando até ganhar");
        /** Sua classe deve fazer o seguinte:
         * Instanciar um jogo da velha
         * Fazer jogadas até ganhar ou empatar
         * Imprimir qual jogador ganhou ou se houve empate
         * Imprimir o tabuleiro final
         * Após a impressão do tabuleiro, deve ser oferecida
         * a opção de iniciar um novo jogo
         */

        // Instanciando o jogo da velha
        JogoDaVelha jogo = new JogoDaVelha();
        // Instanciando o Scanner
        Scanner scan = new Scanner(System.in);
        // Instanciando o random
        Random random = new Random();
        // Instanciando o random de i
        int i = 0;
        // Instanciando o random de j
        int j = 0;
        
        // Instanciando a opcao
        int opcao = 1;
        while (opcao != 0){
            jogo.limpaTabuleiro();
            boolean vencedorEncontrado = false; // Controle do loop do jogo
            // Por algum motivo, tentar usar o eVencedor ou Vencedor não funciona, então estou usando esse boolean para subtitui-los
            while (!vencedorEncontrado) {
                do {
                    i = random.nextInt(3);
                    j = random.nextInt(3);
                } while (jogo.tabuleiro[i][j] != JogoDaVelha.VAZIO);
                    jogo.poePeca(i, j); // Coloca a peça na posição válida
                    if (jogo.eVencedor(JogoDaVelha.X)) {
                        System.out.println("X venceu!\n");
                        vencedorEncontrado = true;
                        break;
                    }
                    else if (jogo.eVencedor(JogoDaVelha.O)) {
                        System.out.println("O venceu!\n");
                        vencedorEncontrado = true;
                        break;
                    }
                    else if (jogo.tabuleiroCheio()) {
                        System.out.println("Empate!\n");
                        vencedorEncontrado = true;
                        break;
                    }
            }
            System.out.println(jogo.toString());
            System.out.println("Gostaria de jogar novamente? \n1-Jogar novamente  0-Sair");
            opcao = scan.nextInt();
        }
        scan.close();
    }
}
