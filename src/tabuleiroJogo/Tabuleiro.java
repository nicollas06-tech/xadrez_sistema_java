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
}
