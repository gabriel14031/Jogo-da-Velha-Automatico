public class TesteJogoDaVelha {
    public static void main(String[] args) {
        System.out.println("Jogando para ganhar");
        // Instanciando o jogo da velha
        JogoDaVelha jogo = new JogoDaVelha();

        //Inicio
        //jogo.poePeca(1, 1); // jogador
        //jogo.poePeca(1, 2); // -jogador

        //jogo.toString();

        //Abaixo segue um exemplo de como ficará o tabuleiro com um vencedor na coluna do meio
        //jogo.poePeca(1, 1); // jogador
        //jogo.poePeca(1, 2); // -jogador
        //jogo.poePeca(0, 1); // jogador
        //jogo.poePeca(2, 0); // -jogador
        //jogo.poePeca(2, 1); // jogador
        //jogo.poePeca(1, 0); // -jogador
        //jogo.toString();
        //jogo.Vencedor();

        //Abaixo segue um exemplo de como ficará o tabuleiro com um vencedor na diagonal esquerda-direita
        //jogo.poePeca(0, 0); // jogador
        //jogo.poePeca(0, 1); // -jogador
        //jogo.poePeca(1, 1); // jogador
        //jogo.poePeca(1, 0); // -jogador
        //jogo.poePeca(2, 2); // jogador
        //jogo.poePeca(2, 0); // -jogador
        //jogo.toString();
        //jogo.Vencedor();

        //Abaixo segue um exemplo de como ficará o tabuleiro com um vencedor na diagonal direita-esquerda
        jogo.poePeca(0, 2); // jogador
        jogo.poePeca(2, 2); // -jogador
        jogo.poePeca(1, 1); // jogador
        jogo.poePeca(1, 0); // -jogador
        jogo.poePeca(2, 0); // jogador
        jogo.poePeca(2, 1); // -jogador
        jogo.toString();
        jogo.Vencedor();

        System.out.println("-A-");
        String primeirojogo = jogo.toString();
        System.out.println(primeirojogo);
   }
}