
package src.xadrez;


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
    private void localNovaPeca(char coluna, int linha, PeçaXadrez peça){
        tabuleiro.posicaoPeça(peça, new PosicaoXadrez(coluna,linha).toPostion());
    }
    private void setupInicial(){
        localNovaPeca('b', 6, new Torre(tabuleiro,Cor.BRANCO));
        localNovaPeca('e', 8, new Rei(tabuleiro,Cor.PRETO));
        localNovaPeca('e', 1, new Rei(tabuleiro,Cor.BRANCO));
    }
       
}//fim da classe
