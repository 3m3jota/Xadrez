
package src.tabuleiro;

/**
 *Classe para...
 * @author Moisés Júnior
 *@since Classe criada em 01/07/2019
 */
public class Peça {
       protected Posicao posicao;
       private Tabuleiro tabuleiro;

    public Peça(Tabuleiro tabuleiro) {
        this.tabuleiro = tabuleiro;
        posicao = null;
    }

    protected Tabuleiro getTabuleiro() {
        return tabuleiro;
    }
    /*
    public boolean movimentosPossiveis (Posicao posicao){
    }
    
    public boolean existeMovimentoPossivel(){
    }*/
               
    
}//fim da classe
