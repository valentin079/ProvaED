package ListaLigada;

public class ListaEncOrdenada<T extends Comparable<T>> extends ListaEnc<T> {
    private int tipoOrdenacao;

    public void setTipoOrdenacao (boolean tipoOrdenacao) throws Exception {

    }

    public int getTipoOrdenacao() {
        if(tipoOrdenacao == 1){

        }
        return tipoOrdenacao;
    }

    public void setTipoOrdenacao(int tipoOrdenacao) {
        this.tipoOrdenacao = tipoOrdenacao;
    }
}
