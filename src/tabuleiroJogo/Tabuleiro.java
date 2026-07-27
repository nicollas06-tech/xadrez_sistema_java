package tabuleiroJogo;

public class Tabuleiro {
    private int linhas;
    private int colunas;
    private PecaJogo[][] pecaJogo;

   public Tabuleiro(){
       this.linhas=0;
       this.colunas=0;
   }

   public Tabuleiro(int linhas, int colunas){
       this.linhas=linhas;
       this.colunas=colunas;
       pecaJogo = new PecaJogo[linhas][colunas];
   }

   public int getLinhas() {
       return linhas;
   }

   public void setLinhas(int linhas){
       this.linhas=linhas;
   }

   public int getColunas(){
       return colunas;
   }

   public void setColunas(int colunas){
       this.colunas=colunas;
    }

    public PecaJogo pecaXadrez(int linhas, int colunas) {
        return pecaJogo[linhas][colunas];
    }

    public PecaJogo pecaXadrez (Posicao posicao){
       return pecaJogo[posicao.getlinha()][posicao.getcoluna()];
    }
    public void PosicionarPeca(PecaJogo peca, Posicao posicao){
        pecaJogo[posicao.getlinha()][posicao.getcoluna()]= peca;
        peca.posicao=posicao;
    }
}
