package modelos;

public class Rei extends Peca{

    Rei(EnumCor cor, int linha, int coluna){
        super(cor, linha, coluna, "c:/Users/gusta/Documents/Programacao/Projetos-java/xadrez/src/imagens/REI"+cor+".png");
    }

    Rei(EnumCor cor, int linha, int coluna, String imagem) {
        super(cor, linha, coluna, imagem);
        //TODO Auto-generated constructor stub
    }

    @Override
    public boolean validaMovimento(int linhaDestino, int colunaDestino) {
        // TODO Auto-generated method stub
        return false;
    }
    
}
