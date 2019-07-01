
package src.application;

import src.tabuleiro.Tabuleiro;
import src.xadrez.PartidaXadrez;

/**
 *Classe para...
 * @author Moisés Júnior
 *@since Classe criada em 29/06/2019
 */
public class Program {
    public static void main(String[] args) {
       PartidaXadrez partida = new PartidaXadrez();
       UI.imprimeTabuleiro(partida.getPeças());
        
    }
    
}//fim da classe
