package camadaXadrez.PecasXadrez;

import tabuleiroJogo.Tabuleiro;
import camadaXadrez.PecaBase;
import camadaXadrez.Cor;

public class Torre extends PecaBase {

    public Torre(Tabuleiro tabuleiro, Cor cor){
        super(tabuleiro, cor);
    }

    public String toString(){
        return "T";
    }
}
