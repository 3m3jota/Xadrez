
package src.application;

import src.xadrez.PeçaXadrez;

/**
 *Classe para...
 * @author Moisés Júnior
 *@since Classe criada em 01/07/2019
 */
public class UI {
    public static void imprimeTabuleiro(PeçaXadrez [][] peças){
        for(int i=0;i<peças.length;i++){
            System.out.print((8-i)+ " ");
             for(int j=0;j<peças.length;j++){
                 imprimePeça(peças[i][j]);
             }
             System.out.println();
        }
        System.out.println("  a b c d e f g h");
    }
    
    private static void imprimePeça(PeçaXadrez peça){
        if(peça == null){
            System.out.print("-");
        }else{
            System.out.print(peça);
        }
        System.out.print(" ");
    }

}//fim da classe
