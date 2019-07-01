
package src.xadrez.peças;

import src.tabuleiro.Tabuleiro;
import src.xadrez.Cor;
import src.xadrez.PeçaXadrez;

/**
 *Classe para...
 * @author Moisés Júnior
 *@since Classe criada em 01/07/2019
 */
public class Torre extends PeçaXadrez {
        
    public Torre(Tabuleiro tabuleiro, Cor cor) {
        super(tabuleiro, cor);
    }

    @Override
    public String toString() {
        return "T";
    }
    
        
}//fim da classe
