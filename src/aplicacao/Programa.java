package aplicacao;

import camadaXadrez.PartidaXadrez;

public class Programa {
    public static void main(String[] args){

        PartidaXadrez partidaXadrez = new PartidaXadrez();
        UI.printboard(partidaXadrez.getPecaXadrez());

    }
}
