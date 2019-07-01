
package src.xadrez;

import src.tabuleiro.Tabuleiro;

/**
 *Classe para...
 * @author Moisés Júnior
 *@since Classe criada em 01/07/2019
 */
public class PartidaXadrez {
    private Tabuleiro tabuleiro;

    public PartidaXadrez(){
        tabuleiro = new Tabuleiro(8,8);
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
       
}//fim da classe
