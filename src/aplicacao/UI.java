package aplicacao;

import tabuleiroJogo.PecaJogo;

public class UI {

    public static void printboard(PecaJogo[][] pecas){
        for(int i = 0; i < pecas.length; i++){
            System.out.print((8-i)+" ");
            for(int j = 0; j < pecas[i].length; j++){
                printPecaXadrez(pecas[i][j]);
            }
            System.out.println();
        }
        System.out.println("  a b c d e f g h");
    }

    private static void printPecaXadrez(PecaJogo peca){
        if(peca == null){
            System.out.print("-");
        }
        else{
            System.out.print(peca);
        }
        System.out.print(" ");
    }
}