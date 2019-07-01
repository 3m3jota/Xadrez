
package src.tabuleiro;

/**
 *Classe para...
 * @author Moisés Júnior
 *@since Classe criada em 01/07/2019
 */
public class Tabuleiro {
private int linhas;
private int colunas;
private Peça[][] peças;

    public Tabuleiro(int linha, int coluna) {
        if(linha <1 || coluna <1){
            throw new TabuleiroExcecao("Erro criando tabuleiro: É necessário que tenha pelo menos 1 linha e 1 coluna");
        }
        this.linhas = linha;
        this.colunas = coluna;
        peças = new Peça[linha][coluna];
    }

    public int getLinha() {
        return linhas;
    }

    public int getColuna() {
        return colunas;
    }

    public Peça peça(int linha,int coluna){
        if(!existePosicao(linha, coluna)){
            throw new TabuleiroExcecao("Não tem essa posição");
        }
        return peças[linha][coluna];
    }
     
    public Peça peça(Posicao posicao){
        if(!existePosicao(posicao)){
            throw new TabuleiroExcecao("Não tem essa posição");
        }
        return peças[posicao.getLinha()][posicao.getColuna()];
    }
   
    public void posicaoPeça(Peça peça, Posicao posicao){
        if(temPeça(posicao)){
            throw new TabuleiroExcecao("Tem uma peça na posição: "+posicao);
        }
        peças[posicao.getLinha()][posicao.getColuna()] = peça;
        peça.posicao = posicao;
    }
     /*
    public Peça removerPeça(Posicao posicao){
    }
  
    */ 
    public boolean temPeça(Posicao posicao){
        if(!existePosicao(posicao)){
            throw new TabuleiroExcecao("Não tem essa posição");
        }
        return peça(posicao) != null;
    }
    
 
    private boolean existePosicao(int linha, int coluna){
        return linha >=0 && linha < linhas && coluna >=0 && coluna < colunas;
    }
    public boolean existePosicao(Posicao posicao){
        return existePosicao(posicao.getLinha(),posicao.getColuna());
    }

}//fim da classe
