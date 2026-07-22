package tabuleiroJogo;

public class Posicao {

    private int linhas;
    private int colunas;

    public Posicao(){
        this.linhas=0;
        this.colunas=0;
    }

    public Posicao(int linhas, int colunas){
        this.linhas=linhas;
        this.colunas=colunas;
    }

    public int getlinha(){
        return linhas;
    }

    public void setlinha(int linha){
        this.linhas=linha;
    }

    public int coluna(){
        return colunas;
    }

    public void setcoluna(int coluna){
        this.colunas=coluna;
    }
    @Override
    public String toString(){
        return linhas +","+colunas;
    }
}


