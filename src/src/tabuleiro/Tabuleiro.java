
package src.tabuleiro;

/**
 *Classe para...
 * @author Moisés Júnior
 *@since Classe criada em 01/07/2019
 */
public class Tabuleiro {
private int linha;
private int coluna;
private Peça[][] peças;

    public Tabuleiro(int linha, int coluna) {
        this.linha = linha;
        this.coluna = coluna;
        peças = new Peça[linha][coluna];
    }

    public int getLinha() {
        return linha;
    }

    public void setLinha(int linha) {
        this.linha = linha;
    }

    public int getColuna() {
        return coluna;
    }

    public void setColuna(int coluna) {
        this.coluna = coluna;
    }
   
    public Peça peça(int linha,int coluna){
        return peças[linha][coluna];
    }
     
    public Peça peça(Posicao posicao){
        return peças[posicao.getLinha()][posicao.getColuna()];
    }
   
    public void posicaoPeça(Peça peça, Posicao posicao){
        peças[posicao.getLinha()][posicao.getColuna()] = peça;
        peça.posicao = posicao;
    }
     /*
    public Peça removerPeça(Posicao posicao){
    }
    
    public boolean existePeça(Posicao posicao){
    }
    
    public boolean temPeça(Posicao posicao){
    }
    
    
*/

}//fim da classe
