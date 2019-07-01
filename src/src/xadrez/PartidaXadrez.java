
package src.xadrez;

import src.tabuleiro.Posicao;
import src.tabuleiro.Tabuleiro;
import src.xadrez.peças.Rei;
import src.xadrez.peças.Torre;

/**
 *Classe para...
 * @author Moisés Júnior
 *@since Classe criada em 01/07/2019
 */
public class PartidaXadrez {
    private Tabuleiro tabuleiro;

    public PartidaXadrez(){
        tabuleiro = new Tabuleiro(8,8);
        setupInicial();
    }
    
    public PeçaXadrez[][] getPeças(){
        PeçaXadrez[][] mat = new PeçaXadrez[tabuleiro.getLinha()][tabuleiro.getColuna()];
        for(int i =0;i<tabuleiro.getLinha();i++){
             for(int j=0;j<tabuleiro.getColuna();j++){
                 mat [i][j]=(PeçaXadrez)tabuleiro.peça(i, j);
            } 
             
        }
        return mat;
    }
    private void setupInicial(){
        tabuleiro.posicaoPeça(new Torre(tabuleiro,Cor.BRANCO), new Posicao(2,1));
        tabuleiro.posicaoPeça(new Rei(tabuleiro,Cor.PRETO), new Posicao(0,4));
        tabuleiro.posicaoPeça(new Rei(tabuleiro,Cor.BRANCO), new Posicao(7,4));
    }
       
}//fim da classe
