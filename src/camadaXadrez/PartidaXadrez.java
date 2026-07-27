package camadaXadrez;

import tabuleiroJogo.Tabuleiro;
import tabuleiroJogo.PecaXadrez;

public class PartidaXadrez {
    private Tabuleiro tabuleiro;

    public PartidaXadrez(){
        tabuleiro = new Tabuleiro(8,8);
    }

    public PecaXadrez[][] getPecaXadrez(){
        PecaXadrez [][] mat = new PecaXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
        for(int i=0; i<tabuleiro.getLinhas(); i++){
            for(int j=0; j<tabuleiro.getColunas(); j++){
                mat[i][j] = tabuleiro.pecaXadrez(i,j);
            }
        }
        return mat;
    }
}
