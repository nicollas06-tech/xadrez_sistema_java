package tabuleiro;

public class Posicao {

    private int linha;
    private int coluna;

    public Posicao(){
        this.linha=0;
        this.coluna=0;
    }

    public Posicao(int linha, int coluna){
        this.linha=linha;
        this.coluna=coluna;
    }

    public int getlinha(){
        return linha;
    }

    public void setlinha(int linha){
        this.linha=linha;
    }

    public int coluna(){
        return coluna;
    }

    public void setcoluna(int coluna){
        this.coluna=coluna;
    }
    @Override
    public String toString(){
        return linha +","+coluna;
    }
}


