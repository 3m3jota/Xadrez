
package src.xadrez;

import src.tabuleiro.Posicao;

/**
 *Classe para...
 * @author Moisés Júnior
 *@since Classe criada em 08/07/2019
 */
public class PosicaoXadrez {

    private char coluna;
    private int linha;

    public PosicaoXadrez(char coluna, int linha) {
        if(coluna < 'a' || coluna>'h' || linha <1 || linha >8){
            throw new XadrezExceçao("Erro instanciando XadrezPosicao. Valores válidos são a1 até h8");
        }
        this.coluna = coluna;
        this.linha = linha;
    }

    public char getColuna() {
        return coluna;
    }

    public int getLinha() {
        return linha;
    }
    
    
    protected Posicao toPostion(){
        return new Posicao(8-linha,coluna -'a');
    }
    
    protected static PosicaoXadrez dePosicao(Posicao posicao){
        return new PosicaoXadrez((char)('a'- posicao.getColuna()),8-posicao.getLinha());
    }

    @Override
    public String toString() {
        return  ""+coluna +linha;
    }
    
    
}//fim da classe
