public class JogoDaVelha {
    protected static final int X = 1, O = -1;
    protected static final int VAZIO = 0;
    protected int tabuleiro[][] = new int[3][3];
    protected int jogador;

    public JogoDaVelha() {
        limpaTabuleiro();
    }


    public void limpaTabuleiro() {
        for(int i = 0;i<3;i++) {
            for (int j=0; j<3; j++) {
                tabuleiro[i][j]=VAZIO;
            }
        }
        jogador = X;
    }

    public void poePeca(int i, int j) {
        if (i<0||i>2||j<0||j>2){
            throw new IllegalArgumentException("Posição Inválida");
        }
        if (tabuleiro[i][j]!=VAZIO) throw new IllegalArgumentException("Posição Ocupada");
        tabuleiro[i][j]=jogador;
        jogador = -jogador;
    }

    public boolean eVencedor(int marca) {
        return ((tabuleiro[0][0] + tabuleiro[0][1] + tabuleiro[0][2] == marca*3) 	// linha 0 ^-
|| (tabuleiro[1][0] + tabuleiro[1][1] + tabuleiro[1][2] == marca*3) 			// linha 1 -
|| (tabuleiro[2][0] + tabuleiro[2][1] + tabuleiro[2][2] == marca*3) 			// linha 2  _
|| (tabuleiro[0][0] + tabuleiro[1][0] + tabuleiro[2][0] == marca*3) 			// coluna 0 |
|| (tabuleiro[0][1] + tabuleiro[1][1] + tabuleiro[2][1] == marca*3) 			// coluna 1  -|
|| (tabuleiro[0][2] + tabuleiro[1][2] + tabuleiro[2][2] == marca*3) 			// coluna 2  --|
|| (tabuleiro[0][0] + tabuleiro[1][1] + tabuleiro[2][2] == marca*3) 			// diagonal \
|| (tabuleiro[2][0] + tabuleiro[1][1] + tabuleiro[0][2] == marca*3)); 		// diagonal /
    }

    public int Vencedor() {
        /** Implementar método indicando se há um vencedor e retornando o valor 1 ou -1
         * para indicar o vencedor ou zero para indicar empate.
         */

        /*Passar na lista se todos espaços são iguais para determinar vencedor
         * começar por linha [i] e dps passar pra coluna [j]; for [i]
         * diagonal \
         * diagonal /: soma dos indices é igual a 2 Ex: (1,1) 1+1=2; (2,0) 2+0= 2;
         */

         int retorno = 0;
        //Passando pela linha
        for (int i = 0;i<3;i++){
            int somaLinha = 0;
            for (int j = 0;j<3;j++){
                somaLinha = somaLinha + tabuleiro[i][j];
                if (somaLinha == 3){
                    System.out.println("X venceu");
                    retorno = X;
                    break;
                }
                if (somaLinha == -3){
                    System.out.println("O venceu");
                    retorno = O;
                    break;
                }

                }
            }
        //Passando pela coluna
        for (int i = 0;i<3;i++){
            int somaColuna = 0;
            for (int j = 0;j<3;j++){
                somaColuna = somaColuna + tabuleiro[j][i];
                if (somaColuna == 3){
                    System.out.println("X venceu");
                    retorno = X;
                    break;
                }
                if (somaColuna == -3){
                    System.out.println("O venceu");
                    retorno = O;
                    break;
                }
            
                }
            }
        //Passando pela diagonais
        int somaDiagonal = 0; //A somaDiagonal está fora para não resetar o valor após passar para a próxima linha

        //Diagonal esquida-direita
        for (int i = 0;i<3;i++){
            for (int j = 0;j<3;j++){
                if (i == j){
                    somaDiagonal = somaDiagonal + tabuleiro[i][j];
                }
                if (somaDiagonal == 3){
                    System.out.println("X venceu");
                    somaDiagonal = 0;
                    retorno = X;
                    break;
                }
                if (somaDiagonal == -3){
                    System.out.println("O venceu");
                    somaDiagonal = 0;
                    retorno = O;
                    break;
                }
            }
        }
        //Diagonal direita-esquerda
        for (int i = 0;i<3;i++){
            for (int j = 0;j<3;j++){
                if (i + j == 2){
                    somaDiagonal = somaDiagonal + tabuleiro[i][j];
                }
                if (somaDiagonal == 3){
                    System.out.println("X venceu");
                    retorno = X;
                    break;
                }
                if (somaDiagonal == -3){
                    System.out.println("O venceu");
                    retorno = O;
                    break;
                }
            }
        }
        //Identificar um meio de identificar o vencedor; Identificar uma forma de não dar empate a toda rodada
        //empate somente quando todas as casas estiverem cheias e não cumprem a condição de vencer
            return retorno;
        }

        // Verifica se o tabuleiro está cheio (sem espaços vazios)
        public boolean tabuleiroCheio() {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (tabuleiro[i][j] == VAZIO) {
                        return false;
                    }
                }
            }
            return true; // Todas as posições estão preenchidas
        }

    public String toString() {
        String retorno = "";
        /** Implementar o método to String que deve retornar
         * uma string com o tabuleiro do jogo da velha com as peças
         * nas posições corretas.
         */

         //Esse construtor mostra o tabuleiro somente uma vez
        for (int i = 0;i<3;i++){
            for (int j = 0;j<3;j++){
                //System.out.print("|"+tabuleiro[i][j]+"|");
                if (tabuleiro[i][j]==X){
                    retorno += ("X");
                }else if(tabuleiro[i][j]==O){
                    retorno += ("O");
                }
                else{
                    retorno += (" ");
                }
                if (j<2){
                    retorno += ("│");
                }
            }
            retorno += ("\n─┼─┼─\n");
        }
        return retorno;
    }
}