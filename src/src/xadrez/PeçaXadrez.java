
package src.xadrez;

import src.tabuleiro.Peça;
import src.tabuleiro.Tabuleiro;

/**
 *Classe para...
 * @author Moisés Júnior
 *@since Classe criada em 01/07/2019
 */
public class PeçaXadrez extends Peça{
    private Cor cor;
    
    public PeçaXadrez(Tabuleiro tabuleiro, Cor cor) {
        super(tabuleiro);
        this.cor = cor;
    }

    public Cor getCor() {
        return cor;
    }
    

}//fim da classe
