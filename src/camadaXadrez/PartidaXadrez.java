package camadaXadrez;

import camadaXadrez.PecasXadrez.Rei;
import camadaXadrez.PecasXadrez.Torre;
import tabuleiroJogo.Posicao;
import tabuleiroJogo.Tabuleiro;
import tabuleiroJogo.PecaJogo;

public class PartidaXadrez {
    private Tabuleiro tabuleiro;

    public PartidaXadrez(){
        tabuleiro = new Tabuleiro(8,8);
        IniciarPartida();
    }

    public PecaJogo[][] getPecaXadrez(){
        PecaJogo[][] mat = new PecaJogo[tabuleiro.getLinhas()][tabuleiro.getColunas()];
        for(int i=0; i<tabuleiro.getLinhas(); i++){
            for(int j=0; j<tabuleiro.getColunas(); j++){
                mat[i][j] = tabuleiro.pecaXadrez(i,j);
            }
        }
        return mat;
    }

    private void IniciarPartida(){
        tabuleiro.PosicionarPeca(new Torre(tabuleiro, Cor.BRANCO), new Posicao(2,1));
        tabuleiro.PosicionarPeca(new Rei(tabuleiro, Cor.PRETO), new Posicao(0, 4));
        tabuleiro.PosicionarPeca(new Rei(tabuleiro, Cor.BRANCO), new Posicao(7, 4));

    }
}
