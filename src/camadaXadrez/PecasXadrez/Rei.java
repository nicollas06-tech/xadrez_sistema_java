package camadaXadrez.PecasXadrez;

import tabuleiroJogo.Tabuleiro;
import camadaXadrez.PecaBase;
import camadaXadrez.Cor;


public class Rei extends PecaBase{
    public Rei(Tabuleiro tabuleiro, Cor cor){
        super(tabuleiro, cor);
    }

    public String toString(){
        return "R";
    }
}
