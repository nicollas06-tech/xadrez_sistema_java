package camadaXadrez;

import tabuleiroJogo.Tabuleiro;
import tabuleiroJogo.PecaJogo;


public class PecaBase extends PecaJogo {
    private Cor cor;

    public PecaBase(Tabuleiro tabuleiro,Cor cor){
        super(tabuleiro);
        this.cor= cor;
    }
    public Cor getCor(){
        return cor;
    }
}