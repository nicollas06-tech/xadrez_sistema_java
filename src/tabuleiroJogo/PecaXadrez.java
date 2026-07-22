package tabuleiroJogo;

import tabuleiroJogo.Tabuleiro;

public class PecaXadrez {

    protected Posicao posicao;
    private Tabuleiro tabuleiro;

    public PecaXadrez(Tabuleiro tabuleiro){
        this.tabuleiro=tabuleiro;
        posicao=null;
    }

    public Tabuleiro getTabuleiro(){
        return tabuleiro;
    }

}
