package camadaXadrez;

import tabuleiroJogo.Tabuleiro;
import tabuleiroJogo.PecaXadrez;


public class PecaBase extends PecaXadrez{
    private Cor cor;

    public PecaBase(Tabuleiro tabuleiro,Cor cor){
        super(tabuleiro);
        this.cor= cor;
    }
    public Cor getCor(){
        return cor;
    }
}