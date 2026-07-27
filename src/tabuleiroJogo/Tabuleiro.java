package tabuleiroJogo;

public class Tabuleiro {
    private int linhas;
    private int colunas;
    private PecaXadrez [][] pecaXadrez;

   public Tabuleiro(){
       this.linhas=0;
       this.colunas=0;
   }

   public Tabuleiro(int linhas, int colunas){
       this.linhas=linhas;
       this.colunas=colunas;
       pecaXadrez = new PecaXadrez[linhas][colunas];
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

    public PecaXadrez pecaXadrez(int linhas, int colunas) {
        return pecaXadrez[linhas][colunas];
    }

    public PecaXadrez pecaXadrez (Posicao posicao){
       return pecaXadrez[posicao.getlinha()][posicao.getcoluna()];
    }
}
