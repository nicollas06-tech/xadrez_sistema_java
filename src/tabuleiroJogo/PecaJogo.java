package tabuleiroJogo;

public class PecaJogo {

    protected Posicao posicao;
    private Tabuleiro tabuleiro;

    public PecaJogo(Tabuleiro tabuleiro){
        this.tabuleiro=tabuleiro;
        posicao=null;
    }

    public Tabuleiro getTabuleiro(){
        return tabuleiro;
    }

}
